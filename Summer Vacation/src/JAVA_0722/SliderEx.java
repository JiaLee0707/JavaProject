package JAVA_0722;
import javax.swing.*;
import java.awt.*;

public class SliderEx extends JFrame {
	Container contentPane;
	SliderEx() {
		setTitle("슬라이더 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
		slider.setPaintLabels(true); //숫자
		slider.setPaintTicks(true); //눈금
		slider.setPaintTrack(true); //바 보이는지 안보이는지
		slider.setMajorTickSpacing(50); //큰눈금
		slider.setMinorTickSpacing(10); //작은 눈금
		
		contentPane.add(slider);
		setSize(300, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new SliderEx();
	}

}