import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUITest7_Layout {

	public static void main(String[] args) {
		JFrame frame = new JFrame("√¢¿Ã∏ß");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400,600));

//		FlowLayout fl = new FlowLayout();
//		fl.setAlignment(FlowLayout.LEFT);
//		panel.setLayout(fl);
		
		//BorderLayout
		BorderLayout bl = new BorderLayout();
		panel.setLayout(bl);
		JButton btNorth = new JButton("NORTH");
		JButton btWest = new JButton("WEST");
		JButton btCenter = new JButton("CENTER");
		JButton btEast = new JButton("EAST");
		JButton btSouth = new JButton("SOUTH");
		panel.add(btNorth, BorderLayout.NORTH);
		panel.add(btWest, BorderLayout.WEST);
		panel.add(btCenter, BorderLayout.CENTER);
		panel.add(btEast, BorderLayout.EAST);
		panel.add(btSouth, BorderLayout.SOUTH);
		
		JPanel panelNorth = new JPanel();
		
		//0~9 i
		for(int i=0; i<10; i++) {
			JButton bts = new JButton("Button "+i);
			panelNorth.add(bts);
		}
		panel.add(panelNorth, BorderLayout.NORTH);
		
		//GridLayout
		//-------
		GridLayout gl = new GridLayout(2, 3);
		JPanel panelCenter = new JPanel();
		panelCenter.setLayout(gl);
		//0~7 i
		for(int i=0; i<6; i++) {
			JButton bts = new JButton("Button "+i);
			panelCenter.add(bts);
		}				
		
		panel.add(panelCenter, BorderLayout.CENTER);
		
		//---------
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
