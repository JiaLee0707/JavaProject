import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class yaho {

	public static void main(String[] args) {
		JFrame frame = new JFrame("창이름");
		frame.setPreferredSize(new Dimension(600, 400));
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("야호");
		
		JTextField tf = new JTextField("아이디를 입력하시오");
		tf.setText("야호");
		label.setText(tf.getText());
		
		panel.add(label);
		panel.add(tf);
		frame.add(panel);

		frame.pack(); 
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
