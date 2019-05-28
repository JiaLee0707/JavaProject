package images;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUITest9_Event {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Event");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400,600));

		
		//JTextField, JButton, JLabel
		JTextField tfInput = new JTextField(10);
		JButton btRun = new JButton("* 12");
		JLabel lbOutput = new JLabel();
		ActionListener al = new ActionListener() {
			//액션리스너 만들자
			@Override
			public void actionPerformed(ActionEvent e) {
				//	액션이 발생하면, tfInput에서 텍스트 가져와서 lbOutput에 설정하자
//				String input = tfInput.getText();
//				lbOutput.setText("안녕, " + input + "야!");
				int input = Integer.parseInt(tfInput.getText());
				lbOutput.setText(Integer.toString(12*input)); //(""+input*12)
			}
		};
		//버튼에 액션리스너 추가하자
		btRun.addActionListener(al);
		
		panel.add(tfInput);
		panel.add(btRun);
		panel.add(lbOutput);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
