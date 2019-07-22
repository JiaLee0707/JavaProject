import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class RadioButtonItemEventEx extends JFrame {
	JRadioButton radio[] = new JRadioButton[3];
	String text[] = {"사과", "배", "체리"};
	JLabel textLabel = new JLabel();
	
	Container contentPane;
	RadioButtonItemEventEx() {
		setTitle("라디오버튼 ItemEvnet 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		
		ButtonGroup g = new ButtonGroup();
		for(int i=0; i<radio.length; i++) {
			radio[i] = new JRadioButton(text[i]);
			g.add(radio[i]);
			panel.add(radio[i]);
			radio[i].addItemListener(new MyItemListener());
		}
		radio[2].setSelected(true);
		contentPane.add(panel, BorderLayout.NORTH);
		contentPane.add(textLabel, BorderLayout.CENTER);
		textLabel.setHorizontalAlignment(SwingConstants.CENTER);
		setSize(250, 150);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.DESELECTED)
				return;
			if(radio[0].isSelected())
				textLabel.setText(text[0]);
			else if(radio[1].isSelected())
				textLabel.setText(text[1]);
			else
				textLabel.setText(text[2]);
		}
		
	}
	
	public static void main(String[] args) {
		new RadioButtonItemEventEx();
	}

}
