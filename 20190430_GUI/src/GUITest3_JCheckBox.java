import java.awt.Dimension;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUITest3_JCheckBox {

	public static void main(String[] args) {
		JFrame frame = new JFrame("창이름");
		frame.setLocation(600, 300); //창 위치
		frame.setPreferredSize(new Dimension(600, 400)); //크기는 정해주나 그냥 느슨가게 정당히 정해주는
		
		JPanel panel = new JPanel();
		//JCheckBox 치킨
		JCheckBox cbChicken = new JCheckBox("치킨");
		//JComboBox 피자
		JCheckBox cbPizza = new JCheckBox("피자");		
		
		panel.add(cbChicken);
		panel.add(cbPizza);
		frame.add(panel);
		
		frame.pack(); //창을 작게 만드는
		frame.setVisible(true); //보여줘라
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //엑스누르면 실행종료
	}

}
