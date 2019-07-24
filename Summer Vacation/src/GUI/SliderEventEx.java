package GUI;
import javax.swing.*;
import javax.swing.event.*;

import java.awt.*;

public class SliderEventEx extends JFrame {
	Container contentPane;
	JSlider slider[] = new JSlider[3];
	JLabel colorLabel = new JLabel();

	SliderEventEx() {
		setTitle("슬라이더와 ChangeEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		colorLabel.setText("SLIDER EXAMPLE");
		
		for(int i=0; i<slider.length; i++) {
			slider[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 120);
			slider[i].setPaintLabels(true);
			slider[i].setPaintTicks(true);
			slider[i].setPaintTrack(true);
			slider[i].setMajorTickSpacing(50);
			slider[i].setMinorTickSpacing(10);
			slider[i].addChangeListener(new MyChangeListener());
			contentPane.add(slider[i]);
		}
		
		slider[0].setForeground(Color.RED);
		slider[1].setForeground(Color.GREEN);
		slider[2].setForeground(Color.BLUE);
		colorLabel.setOpaque(true);
		colorLabel.setBackground(
				new Color(slider[0].getValue(), slider[1].getValue(), slider[2].getValue()));
		contentPane.add(colorLabel);
		setSize(300, 300);
		setVisible(true);
	}
	
	class MyChangeListener implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			colorLabel.setBackground(
				new Color(slider[0].getValue(), slider[1].getValue(), slider[2].getValue()));
		}
	}
	
	public static void main(String[] args) {
		new SliderEventEx();
	}

}
