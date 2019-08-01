package GUI;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.*;
import javax.swing.*;

public class AudioStart extends JFrame{
	private Clip clip = null;
	private AudioInputStream audioStream = null;
	private JLabel msgLabel = new JLabel("����� ����");
	private JButton sbtn = new JButton("����");
	private JButton ebtn = new JButton("����");
	
	public AudioStart() {
		super("����� ������ ����/���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		msgLabel.setFont(new Font("Gothic", Font.PLAIN, 15));
		msgLabel.setHorizontalAlignment(JLabel.LEFT);
		sbtn.setHorizontalAlignment(JButton.CENTER);
		ebtn.setHorizontalAlignment(JButton.RIGHT);
		c.add(msgLabel);
		c.add(sbtn);
		c.add(ebtn);
		
		setSize(450, 150);
		setVisible(true);
		
		sbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(clip != null && clip.isActive())
					clip.close();
				playAudio("src/GUI/hiphop.wav");
				msgLabel.setText("hiphop.wav" + "�� �����ϰ� �ֽ��ϴ�.");
			}
		});
		
		ebtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(clip != null && clip.isActive()) {
					clip.close();
					msgLabel.setText("���ָ� �������ϴ�.");
				}
				try {
					audioStream.close();
				}catch(IOException e1) { e1.printStackTrace(); }
			}
		});
				
	}
	private void playAudio(String pathName) {
		try {
			File audioFile = new File(pathName); //����� ������ ��θ�
			audioStream = AudioSystem.getAudioInputStream(audioFile);
			
			clip = AudioSystem.getClip(); //����ִ� ����� Ŭ�� �����
			clip.open(audioStream); //����� ����� ��Ʈ�� ����
			clip.start(); //��� ����
		}
		catch(LineUnavailableException e) { e.printStackTrace(); }
		catch(UnsupportedAudioFileException e) { e.printStackTrace(); }
		catch(IOException e) { e.printStackTrace(); }
	}
	
	public static void main(String[] args) {
		new AudioStart();

	}

}
