import java.awt.Dimension;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUITest3_JCheckBox {

	public static void main(String[] args) {
		JFrame frame = new JFrame("â�̸�");
		frame.setLocation(600, 300); //â ��ġ
		frame.setPreferredSize(new Dimension(600, 400)); //ũ��� �����ֳ� �׳� �������� ������ �����ִ�
		
		JPanel panel = new JPanel();
		//JCheckBox ġŲ
		JCheckBox cbChicken = new JCheckBox("ġŲ");
		//JComboBox ����
		JCheckBox cbPizza = new JCheckBox("����");		
		
		panel.add(cbChicken);
		panel.add(cbPizza);
		frame.add(panel);
		
		frame.pack(); //â�� �۰� �����
		frame.setVisible(true); //�������
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���������� ��������
	}

}
