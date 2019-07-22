import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxItemEventEx extends JFrame {
	Container contentPane;
	JCheckBox fruits[] = new JCheckBox[3];
	String name[] = {"사과", "배", "체리"};
	private Label sumLabel;
	int sum = 0;
	
	public CheckBoxItemEventEx() {
		setTitle("체크박스와 ITemEvent");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		new Label("사과 100원, 배 500원, 체리 20000원");
		MyItemListener listener = new MyItemListener();
		for(int i=0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(name[i]);
			fruits[i].setBorderPainted(true);
			contentPane.add(fruits[i]);
			fruits[i].addItemListener(listener);
		}
		
		sumLabel = new Label("현재 0원 입니다.");
		contentPane.add(sumLabel);
		setSize(250, 150);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			int selected = 1;
			if(e.getStateChange() == ItemEvent.SELECTED)
				selected = 1;
			else
				selected = -1;
			if(e.getItem() == fruits[0])
				sum = sum + selected*100;
			else if(e.getItem() == fruits[1])
				sum = sum + selected*500;
			else
				sum = sum + selected*20000;
			
			sumLabel.setText("현재" + sum + "원 입니다.");
		}
	}
	public static void main(String[] args) {
		new CheckBoxItemEventEx();
	}
}
