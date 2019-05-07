import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUITest_JFrame {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("창이름");
		frame.setLocation(600, 300); //창 위치
		frame.setPreferredSize(new Dimension(600, 400)); //크기는 정해주나 그냥 느슨가게 정당히 정해주는
		//frame.setSize(600,400); //창 크기 //크기를 정해주는
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("오월은 푸르구나~");
		label.setText("너도나도 자란다~");
		//label.setOpaque(true);
		//label.setBackground(Color.pink);
		
		JTextField tf = new JTextField("우리들은 자란다~");
		
		panel.add(label);
		panel.add(tf);
		frame.add(panel);
		
		frame.pack(); //창을 작게 만드는
		frame.setVisible(true); //보여줘라
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //엑스누르면 실행종료
	}
}
