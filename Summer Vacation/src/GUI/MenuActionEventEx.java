package GUI;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MenuActionEventEx extends JFrame{
	Container contentPane;
	JLabel label= new JLabel("Hello");
	
	MenuActionEventEx() {
		setTitle("Menu 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label, BorderLayout.CENTER);
		createMenu();
		setSize(250, 200);
		setVisible(true);
	}
	
	void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenuItem [] menuItem = new JMenuItem[4];
		String[] itemTitle = {"Color", "Font", "Top", "Bottom"};
		JMenu textMenu = new JMenu("Text");
		for(int i=0; i<menuItem.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(new MenuActionListener());
			textMenu.add(menuItem[i]);
		}
		mb.add(textMenu);
		this.setJMenuBar(mb);
	}
	
	class MenuActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if(cmd.equals("Color"))
				label.setForeground(Color.BLUE);
			else if(cmd.contentEquals("Font"))
				label.setFont(new Font("Ravie", Font.ITALIC, 30));
			else if(cmd.contentEquals("Top"))
				label.setVerticalAlignment(SwingConstants.TOP);
			else
				label.setVerticalAlignment(SwingConstants.BOTTOM);
		}
	}
	public static void main(String[] args) {
		new MenuActionEventEx();

	}

}
