package GUI;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AudioStart2 extends JFrame{
	private Clip clip = null;
	private AudioInputStream audioStream = null;
	private JLabel msgLabel = new JLabel("오디오 파일");	
	private JButton openbtn = new JButton("열기");
	private JButton sbtn = new JButton("연주");
	private JButton ebtn = new JButton("종료");
	private String filePath;
	
	public AudioStart2() {
		super("오디오 파일을 연주/종료 제어");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		msgLabel.setFont(new Font("Gothic", Font.PLAIN, 15));
		msgLabel.setHorizontalAlignment(JLabel.LEFT);
		openbtn.setHorizontalAlignment(JButton.CENTER);
		sbtn.setHorizontalAlignment(JButton.CENTER);
		ebtn.setHorizontalAlignment(JButton.RIGHT);
		c.add(msgLabel);
		c.add(openbtn);
		c.add(sbtn);
		c.add(ebtn);
		
		setSize(450, 150);
		setVisible(true);
		
		openbtn.addActionListener(new ActionListener() {
			JFileChooser chooser = new JFileChooser();

			public void actionPerformed(ActionEvent e) {
//				FileNameExtensionFilter filter = new
//					FileNameExtensionFilter("wav");
				//chooser.setFileFilter(filter);
				int ret = chooser.showOpenDialog(null);
				if(ret != JFileChooser.APPROVE_OPTION) {
					JOptionPane.showMessageDialog(null,
							"파일을 선택하지 않았습니다",
							"경고", JOptionPane.WARNING_MESSAGE);
					return;
				}
			filePath = chooser.getSelectedFile().getPath();
			pack();
			}
		});
		
		sbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(clip != null && clip.isActive())
					clip.close();
				playAudio(filePath);
				msgLabel.setText("hiphop.wav" + "를 연주하고 있습니다.");
			}
		});
		
		ebtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(clip != null && clip.isActive()) {
					clip.close();
					msgLabel.setText("연주를 종료힙니다.");
				}
				try {
					audioStream.close();
				}catch(IOException e1) { e1.printStackTrace(); }
			}
		});
				
	}
	private void playAudio(String pathName) {
		try {
			File audioFile = new File(pathName); //오디오 파일의 경로명
			audioStream = AudioSystem.getAudioInputStream(audioFile);
			
			clip = AudioSystem.getClip(); //비어있는 오디오 클립 만들기
			clip.open(audioStream); //재생할 오디오 스트림 열기
			clip.start(); //재생 시작
		}
		catch(LineUnavailableException e) { e.printStackTrace(); }
		catch(UnsupportedAudioFileException e) { e.printStackTrace(); }
		catch(IOException e) { e.printStackTrace(); }
	}
	
	public static void main(String[] args) {
		new AudioStart2();
	}

}
