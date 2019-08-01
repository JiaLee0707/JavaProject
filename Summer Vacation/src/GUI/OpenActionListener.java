package GUI;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.event.*;
import java.awt.*;

public class OpenActionListener extends JFrame{
	Container contentPane;
	JLabel imageLabel = new JLabel();
	
	MeuAndFileDialogEx() {
		setTitle("Menu�� JFileChooser Ȱ�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contenPane = getContentPane();
		contentPane.add(imageLabel);
		createMenu();
		setSize(250, 200);
		setVisible(true);
	}
	
	void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem openItem = new JMenuItem("Open");
		openItem.addActionListener(
				new OpenActionListener());
		fileMenu.add(openItem);
		mb.add(fileMenu);
		this.setJMenuBar(mb);
	}
	
	class OpenActionListener implements ActionListener {
		JFileChooser chooser;
		OpenActionListener() {
			chooser = new JFileChooser();
		}
		public void actioPerformed(ActionEvent e) {
			FileNameExtensionFilter filter = new
					FileNameExtensionFilter(
							"JPG & GIF Images", "jpg", "gif");
			chooser.setFileFilter(filter);
			int ret = chooser.showOpenDialog(null);
			if(ret != JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null,
						"������ �������� �ʾҽ��ϴ�.",
						"���", JOptionPane.WARNING_MESSAGE);
				return;
			}
		}
		String filePath = chooser.getSelectedFile().getPath();
		imageLabel.setIcon(new ImageIcon(filePath));
		pack();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
