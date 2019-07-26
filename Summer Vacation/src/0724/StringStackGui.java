package GUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import JAVA.*;

public class StringStackGui extends JFrame {
	Container contentPane;
	
	TextField count = new TextField(5);
	TextField val = new TextField(5);
	
	StringStack ss = new StringStack();
	JList<String> stackList = new JList<String>(ss.element);

	StringStackGui() {
		setTitle("Stack GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		Label clabel = new Label("�迭����");
		JButton cBut = new JButton("�Է�");
		cBut.addActionListener(new cActionListener());
			
		Label slabel = new Label("�Է� ������");
		JButton sBut = new JButton("�Է�");
		sBut.addActionListener(new dataActionListener());
		
		
		JButton printBut = new JButton("���");
		printBut.addActionListener(new printActionListener());
		
		//�迭����
		contentPane.add(clabel);
		contentPane.add(count);
		contentPane.add(cBut);
		//�Էµ�����
		contentPane.add(slabel);
		contentPane.add(val);
		contentPane.add(sBut);
		//���
		contentPane.add(printBut);
		contentPane.add(stackList);
		
		
		setSize(300, 400);
		setVisible(true);
	}
	
	class cActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			int c = Integer.parseInt(count.getText());
			ss.StringStack11(c);
		}
	}
	
	class dataActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String str = val.getText();
			ss.push(str);
		}
	}
	
	class printActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			for(int i=0; i<ss.capacity(); i++) {
				stackList = new JList<String>(ss.element);
				stackList.setListData(ss.element);
				System.out.println(ss.element[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		new StringStackGui();
	}
}
