package GUI;

import java.awt.*;
import javax.swing.*;

public class SmpleMenu extends JFrame{
	Container contentPane;
	SmpleMenu() {
		setTitle("SmpleMenu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		JMenuBar mb = new JMenuBar();
		JMenu file = new JMenu("파일");
		JMenu editing = new JMenu("편집");
		JMenu show = new JMenu("보기");
		JMenu input = new JMenu("입력");
		JMenuItem as = new JMenuItem("화면확대");
		JMenuItem a = new JMenuItem("쪽윤곽");
		
		show.add(as);
		show.add(a);
		mb.add(file);
		mb.add(editing);
		mb.add(show);
		mb.add(input);
		this.setJMenuBar(mb);
		
		setSize(250, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SmpleMenu();

	}

}
