package network;

class MyModalDialog extends JDialog {
	JTextField tf = new JTextField(10);
	JButton okButton = new JButton("OK");
	
	public MyModalDialog(JFrame frame, String title) {
		super(frame,title, treu); //��� ���̾�α׷� ����
		setLayout(new FlowLayout());
		add(tf);
	}
}

public class DialogEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
