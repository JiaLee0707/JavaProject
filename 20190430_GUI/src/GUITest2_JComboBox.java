import java.awt.Dimension;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUITest2_JComboBox {

	public static void main(String[] args) {
		JFrame frame = new JFrame("â�̸�");
		frame.setLocation(600, 300); //â ��ġ
		frame.setPreferredSize(new Dimension(600, 400)); //ũ��� �����ֳ� �׳� �������� ������ �����ִ�
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("�¾ �� :");
		
		//String[] month = {"1��", "2��", "3��", "4��", "5��", "6��", "7��", "8��", "9��", "10��", "11��", "12��"};
		String[] picnics = {"���ɱ���", "��������"};
		JComboBox<String> m = new JComboBox<>();
		JComboBox<String> cb = new JComboBox<>(picnics);
		for(int i=1; i<=12; i++) {
			m.addItem(i+"��"); //m.addItem(i+"") //String.valueOf(i)
		}
		cb.addItem("����ķ��");
		cb.addItem("�ܿﴫ�ο�");

		panel.add(label);
		panel.add(m);
		panel.add(cb);
		frame.add(panel);
		
		frame.pack(); //â�� �۰� �����
		frame.setVisible(true); //�������
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���������� ��������
	}

}
