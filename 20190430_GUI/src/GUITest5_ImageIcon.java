import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUITest5_ImageIcon {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400,600));

		//ImageIcon, JLabel
		ImageIcon Chocolate = new ImageIcon("src/images/Chocolate.jpg");
		JLabel imageLabel = new JLabel(Chocolate);
		
		//ImageIcon, JButton
		ImageIcon Cat = new ImageIcon("src/images/Cat.jpg");
		//ImageIcon 크기 수정
		ImageIcon smallCat = new ImageIcon(Cat.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		JButton imageButton = new JButton(smallCat);
		
		
		panel.add(imageLabel);
		panel.add(imageButton);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
