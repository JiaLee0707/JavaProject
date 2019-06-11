import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUITest11_UpDown {
	static int computer;
	public static void main(String[] args) {
	JFrame frame = new JFrame("업앤다운업앤다운");
	JPanel panel = new JPanel();
	frame.setPreferredSize(new Dimension(400,600));

	//JTestField, JButton
	JTextField tfInput = new JTextField(10);
	JButton btQuestion = new JButton("냐?");
	//JLabel
	JLabel lbResult = new JLabel("1~100사이 숫자 맞춰봐");
	Random random = new Random();
	computer = random.nextInt(100+1); //1~100
	ActionListener al = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			//사용자입력값 가져오자
			String input = tfInput.getText();
			tfInput.setText("");
			int player = Integer.parseInt(input); //String -> int
			//컴퓨터값이랑 비교하자
			//결과 보여주자
			if(computer > player) {
				lbResult.setText(input+" Up(↑)");
			}
			else if(computer < player) {
				lbResult.setText(input+" Down(↓)");
			}
			else {
				// 결과
				// ==탈출
				lbResult.setText("정답");
				computer = random.nextInt(100+1);
			}
			
		}
	};
	btQuestion.addActionListener(al);
	tfInput.addActionListener(al); //엔터
	
	panel.add(tfInput);
	panel.add(btQuestion);
	panel.add(lbResult);
	frame.add(panel);
	
	frame.pack();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
