package GUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import JAVA.*;

public class StringStackGui extends JFrame {
	Container contentPane;
	Container Input;
	Container print;
	
	TextField count = new TextField(5);
	TextField val = new TextField(5);
	
	StringStack ss = new StringStack();
	JList<String> stackList = new JList<String>(ss.element);

	StringStackGui() {
		setTitle("Stack GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		Input = getContentPane();
		print = getContentPane();
		contentPane.setLayout(new BorderLayout(0, 0));
		Input.setLayout(new GridLayout(2, 2, 10, 5));
		print.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 0));
		
		Label clabel = new Label("배열갯수");
		JButton cBut = new JButton("입력");
		cBut.addActionListener(new cActionListener());
			
		Label slabel = new Label("입력 데이터");
		JButton sBut = new JButton("입력");
		sBut.addActionListener(new dataActionListener());
		
		
		JButton printBut = new JButton("출력");
		printBut.addActionListener(new printActionListener());
		
		//배열갯수
		Input.add(clabel);
		Input.add(count);
		Input.add(cBut);
		//입력데이터
		Input.add(slabel);
		Input.add(val);
		Input.add(sBut);
		//출력
		print.add(printBut);
		print.add(stackList);
				
		contentPane.add(Input, BorderLayout.NORTH);		
		contentPane.add(print, BorderLayout.CENTER);
		
		setSize(300, 400);
		setVisible(true);
	}
	//배열갯수
	class cActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			int c = Integer.parseInt(count.getText());
			ss.StringStack11(c);
		}
	}
	//입력데이터
	class dataActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String str = val.getText();
			ss.push(str);
		}
	}
	//list
	class printActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			for(int i=0; i<ss.capacity()-1; i++) {
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
