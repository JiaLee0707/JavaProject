import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class test{
	public static void main(String[] args) {
		JFrame frame = new JFrame("창이름");
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		frame.setPreferredSize(new Dimension(2000,1000));

		//FlowLayout
		panel.setLayout(new BorderLayout());
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 25));
		panel3.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 20));

		//버튼 가로 450, 세로 350 30씩 떨어트림, 밑으로 25 떨어트림
		//결과 가로 1472,세로 600	
		
		//심리테스트 종류
		ImageIcon image1 = new ImageIcon("src/image/1.PNG");
		ImageIcon small1 = new ImageIcon(image1.getImage().getScaledInstance(450, 350, Image.SCALE_DEFAULT));
		ImageIcon image2 = new ImageIcon("src/image/2.PNG");
		ImageIcon small2 = new ImageIcon(image2.getImage().getScaledInstance(450, 350, Image.SCALE_DEFAULT));
		ImageIcon image3 = new ImageIcon("src/image/3.PNG");
		ImageIcon small3 = new ImageIcon(image3.getImage().getScaledInstance(450, 350, Image.SCALE_DEFAULT));
		ImageIcon image4 = new ImageIcon("src/image/4.PNG");
		ImageIcon small4 = new ImageIcon(image4.getImage().getScaledInstance(450, 350, Image.SCALE_DEFAULT));
		
		JButton imageButton1 = new JButton(small1);
		JButton imageButton2 = new JButton(image2);
		JButton imageButton3 = new JButton(image3);
		JButton imageButton4 = new JButton(image4);
		
		//심리테스트1
		ImageIcon A = new ImageIcon("src/image/A.PNG");
		
		JButton AButton = new JButton(A);
		
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == imageButton1) {//setVisible, CardLayout

				}
			}
		};
		imageButton1.addActionListener(listener);
		
		panel.add(panel2, BorderLayout.NORTH);
		panel.add(panel3, BorderLayout.SOUTH);
		panel3.add(AButton);
		panel2.add(imageButton1);
		panel2.add(imageButton2);
		panel2.add(imageButton3);
		panel2.add(imageButton4);
		frame.add(panel);

		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
