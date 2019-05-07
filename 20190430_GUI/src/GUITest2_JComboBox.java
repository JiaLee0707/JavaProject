import java.awt.Dimension;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUITest2_JComboBox {

	public static void main(String[] args) {
		JFrame frame = new JFrame("창이름");
		frame.setLocation(600, 300); //창 위치
		frame.setPreferredSize(new Dimension(600, 400)); //크기는 정해주나 그냥 느슨가게 정당히 정해주는
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("태어난 달 :");
		
		//String[] month = {"1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월"};
		String[] picnics = {"봄꽃구경", "여름수영"};
		JComboBox<String> m = new JComboBox<>();
		JComboBox<String> cb = new JComboBox<>(picnics);
		for(int i=1; i<=12; i++) {
			m.addItem(i+"월"); //m.addItem(i+"") //String.valueOf(i)
		}
		cb.addItem("가을캠프");
		cb.addItem("겨울눈싸움");

		panel.add(label);
		panel.add(m);
		panel.add(cb);
		frame.add(panel);
		
		frame.pack(); //창을 작게 만드는
		frame.setVisible(true); //보여줘라
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //엑스누르면 실행종료
	}

}
