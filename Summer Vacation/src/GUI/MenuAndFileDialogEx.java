package GUI;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MenuAndFileDialogEx extends JFrame{
	Container contentPane;
	JLabel imageLabel = new JLabel();
	
	MenuAndFileDialogEx() {
		setTitle("Menu와 JFileChooser 활용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.add(imageLabel);
		createMenu();
		setSize(250, 200);
		setVisible(true);
	}
	
	void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem openItem = new JMenuItem("Open");
		JMenuItem saveItem = new JMenuItem("Save");
		openItem.addActionListener(
				new OpenActionListener());
		saveItem.addActionListener(
				new SaveActionListener());
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		mb.add(fileMenu);
		this.setJMenuBar(mb);
	}
	
	class OpenActionListener implements ActionListener {
		JFileChooser chooser;
		OpenActionListener() {
			chooser= new JFileChooser();
		}
		public void actionPerformed(ActionEvent e) {
			FileNameExtensionFilter filter = new
				FileNameExtensionFilter(
						"JPG & GIF Images", "jpg", "gif");
			chooser.setFileFilter(filter);
			int ret = chooser.showOpenDialog(null);
			if(ret != JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null,
						"파일을 선택하지 않았습니다",
						"경고", JOptionPane.WARNING_MESSAGE);
				return;
			}
		String filePath = chooser.getSelectedFile().getPath();
		imageLabel.setIcon(new ImageIcon(filePath));
		pack();
		}
	}
	class SaveActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	public static void main(String [] args) {
		new MenuAndFileDialogEx();
	}
} 