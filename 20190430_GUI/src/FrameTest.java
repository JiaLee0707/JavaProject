import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("창");
		JLabel label = new JLabel("레이블");
		frame.add(label);
		
		frame.setPreferredSize(new Dimension(400, 100)); //창 크기
		frame.setLocation(200, 500); //창 위치
		
		frame.pack();				//반드시 필요
		frame.setVisible(true);		//반드시 필요
		
		JFrame frame2 = new JFrame("창투");
		frame2.pack();
		frame2.setVisible(true);
	}

}
