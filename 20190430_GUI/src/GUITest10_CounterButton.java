import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUITest10_CounterButton {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Counter Button");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(300,100));
		GridLayout grid = new GridLayout(1, 2);
		panel.setLayout(grid);

		//JLabel, JButton
		JLabel lbNumber = new JLabel("0");
		JButton btCount = new JButton("Click Counter");
		lbNumber.setHorizontalAlignment(JLabel.CENTER);

		ActionListener listener = new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				//lbNumber에서 텍스트 가져와서
				//+1을 하고
				int al = Integer.parseInt(lbNumber.getText())+1;
				//lbNumber에 설정하자
				lbNumber.setText(Integer.toString(al));
			}
		};
		btCount.addActionListener(listener);
		
		panel.add(lbNumber);
		panel.add(btCount);
		
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
