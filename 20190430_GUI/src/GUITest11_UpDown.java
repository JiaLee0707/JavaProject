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
	JFrame frame = new JFrame("���شٿ���شٿ�");
	JPanel panel = new JPanel();
	frame.setPreferredSize(new Dimension(400,600));

	//JTestField, JButton
	JTextField tfInput = new JTextField(10);
	JButton btQuestion = new JButton("��?");
	//JLabel
	JLabel lbResult = new JLabel("1~100���� ���� �����");
	Random random = new Random();
	computer = random.nextInt(100+1); //1~100
	ActionListener al = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			//������Է°� ��������
			String input = tfInput.getText();
			tfInput.setText("");
			int player = Integer.parseInt(input); //String -> int
			//��ǻ�Ͱ��̶� ������
			//��� ��������
			if(computer > player) {
				lbResult.setText(input+" Up(��)");
			}
			else if(computer < player) {
				lbResult.setText(input+" Down(��)");
			}
			else {
				// ���
				// ==Ż��
				lbResult.setText("����");
				computer = random.nextInt(100+1);
			}
			
		}
	};
	btQuestion.addActionListener(al);
	tfInput.addActionListener(al); //����
	
	panel.add(tfInput);
	panel.add(btQuestion);
	panel.add(lbResult);
	frame.add(panel);
	
	frame.pack();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
