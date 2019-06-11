import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUITest12_Listeners {
	public static void main(String []args) {
		JFrame frame = new JFrame("창이름");
		frame.setLocation(600, 300); //창 위치
		frame.setPreferredSize(new Dimension(600, 400)); //크기는 정해주나 그냥 느슨가게 정당히 정해주는
		
		JPanel panel = new JPanel();
		JTextField tfInput = new JTextField(10);
		JTextField tfInput2 = new JTextField(20);
		JLabel lbOutput = new JLabel("쳐 엔터!");
		
		tfInput.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbOutput.setText(tfInput.getText()+" 흠뻑쇼!!!!!!");				
			}
		});
		tfInput.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent arg0) {
				lbOutput.setText("다시돌아와ㅠㅠ");
				
			}
			
			@Override
			public void focusGained(FocusEvent arg0) {
				lbOutput.setText("나만 바라봐 @.@");
			}
		});
		
		panel.add(tfInput);
		panel.add(tfInput2);
		panel.add(lbOutput);
		frame.add(panel);
		
		frame.pack(); //창을 작게 만드는
		frame.setVisible(true); //보여줘라
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //엑스누르면 실행종료		
	}

}
