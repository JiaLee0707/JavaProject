import java.awt.BorderLayout;
import java.awt.Desktop.Action;
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
		frame.setPreferredSize(new Dimension(2000,1000));

		//FlowLayout
		panel.setLayout(new BorderLayout());
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 25));
//		panel2.setLayout(new BorderLayout());

		//버튼 가로 450, 세로 350 30씩 떨어트림, 밑으로 25 떨어트림
		//결과 가로 1472,세로 600	
		ImageIcon image1 = new ImageIcon("src/image/1.PNG");
		ImageIcon small1 = new ImageIcon(image1.getImage().getScaledInstance(450, 350, Image.SCALE_DEFAULT));
		ImageIcon image2 = new ImageIcon("src/image/2.PNG");
		ImageIcon small2 = new ImageIcon(image2.getImage().getScaledInstance(450, 350, Image.SCALE_DEFAULT));
		ImageIcon image3 = new ImageIcon("src/image/C.PNG");
		ImageIcon image4 = new ImageIcon("src/image/D.PNG");
		
		JButton imageButton1 = new JButton(small1);
		JButton imageButton2 = new JButton(image2);
		JButton imageButton3 = new JButton(image3);
		JButton imageButton4 = new JButton(image4);
		
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		};
		
		
		panel.add(panel2, BorderLayout.NORTH);
		panel2.add(imageButton1, BorderLayout.NORTH);
		panel2.add(imageButton2, BorderLayout.NORTH);
		panel2.add(imageButton3, BorderLayout.NORTH);
		panel2.add(imageButton4, BorderLayout.NORTH);
		frame.add(panel);

		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
