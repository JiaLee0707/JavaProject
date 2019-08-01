package GUI;

import java.awt.*;
import javax.swing.*;

public class MoneyChange extends JFrame {
//20, 20 금액
//100, 20 textFild
//50, 50 오만원
	JLabel la;
	JTextField tf;
	JTextField tf1;
	int a[] = {50000, 10000, 1000, 500, 100, 50, 10, 1};
	int money;
	
	
	Container contentPane;
	MoneyChange() {
		setTitle("MoneyChange");
		contentPane = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.setBackground(Color.PINK);
		contentPane.setLayout(null);
		
		la = new JLabel("금액");
		
		String m[] = {"금액", "오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원"};
		JLabel mt = new JLabel();
		
		tf = new JTextField(10);
		
		
		la.setLocation(20, 20);	
		la.setSize(30, 20);
		contentPane.add(la);
		tf.setLocation(100, 20);	
		tf.setSize(100, 20);
		contentPane.add(tf);
		String tff= tf.getText();
		money = Integer.parseInt(tff);
		
		for(int i=0; i<m.length; i++) {
			mt = new JLabel(m[i]);
			mt.setLocation(50,50+(i*20));
			mt.setSize(30, 30);
			contentPane.add(mt);
		}
		for(int i=0; i<a.length; i++) {
			String mm =  count(money, a[i]);
			tf1 = new JTextField(mm);
			tf1.setLocation(100,50+(i*20));
			tf1.setSize(30, 30);
			contentPane.add(tf1);
		}
		
		
		setSize(300, 300);
		setVisible(true);
	}

	public String count(int n, int b) {
		int c = n/b;
		money = n%b;
		
		return Integer.toString(c);
	}
	
	public static void main(String[] args) {
		new MoneyChange();
	}

}
