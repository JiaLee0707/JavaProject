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
		JMenu file = new JMenu("����");
		JMenu editing = new JMenu("����");
		JMenu show = new JMenu("����");
		JMenu input = new JMenu("�Է�");
		JMenuItem as = new JMenuItem("ȭ��Ȯ��");
		JMenuItem a = new JMenuItem("������");
		
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
