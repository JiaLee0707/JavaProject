package jdbc;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;

public class MemberDB extends JFrame implements ActionListener{
	Container contentPane = new Container();
	
	Connection connl;
	PreparedStatement pstmtl;
	
	JMenuBar mb;
	JMenu menu1;
	JMenu menu2;
	JMenuItem save;
	JMenuItem view;
	JLabel namelabel;
	JLabel passlabel;
	JLabel num1label;
	JLabel num2label;
	JLabel phonelabel;
	TextField fname;
	JPasswordField fpass;
	TextField fnum1;
	TextField fnum2;
	TextField fphone;
	
	JButton NextBut;
	
	private int numberOfRecord=0;
	
	public MemberDB() {
		setTitle("ȸ�� ������ ���̽�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(6, 2, 0, 0));
		
		//�޴���
		mb = new JMenuBar();
		menu1 = new JMenu("�޴�");
		menu2 = new JMenu("����");
		
		save = new JMenuItem("ȸ�� ���");
		save.addActionListener(this);
		
		view = new JMenuItem("��� ȸ�� ����");
		view.addActionListener(this);
		
		menu1.add(save);
		menu1.add(view);
		
		this.setJMenuBar(mb);
		
		//
		namelabel = new JLabel("����");
		namelabel.setSize(50, 50);
		fname = new TextField();
		namelabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		passlabel = new JLabel("��й�ȣ");
		passlabel.setHorizontalAlignment(SwingConstants.CENTER);
		JPasswordField fpass = new JPasswordField();
		
		num1label = new JLabel("�ֹι�ȣ1");
		num1label.setHorizontalAlignment(SwingConstants.CENTER);
		TextField fnum1 = new TextField();
		
		num2label = new JLabel("�ֹι�ȣ2");
		num2label.setHorizontalAlignment(SwingConstants.CENTER);
		TextField fnum2 = new TextField();

		phonelabel = new JLabel("��ȭ��ȣ");
		phonelabel.setHorizontalAlignment(SwingConstants.CENTER);
		TextField fphone = new TextField();
		
		NextBut = new JButton("���� ȸ��");
		NextBut.setPreferredSize(new Dimension(150, 20));
		//NextBut.addActionListener(this);
		
		contentPane.add(namelabel);
		contentPane.add(fname);
		contentPane.add(passlabel);
		contentPane.add(fpass);
		contentPane.add(num1label);
		contentPane.add(fnum1);
		contentPane.add(num2label);
		contentPane.add(fnum2);
		contentPane.add(phonelabel);
		contentPane.add(fphone);
		contentPane.add(NextBut);
		
		//jdbc
		Connection conn=null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/javap", "root", "mirim2"); //DB����
			System.out.println("DB ���� �Ϸ�");
			String sql = "select count(id) from register";
			pstmt = conn.prepareStatement(sql);
			ResultSet rs;
			rs = pstmt.executeQuery();
			rs.next();
			numberOfRecord = rs.getInt(1);
			
//			sql = "insert into register(id, name, pass, num1, num2, phone) values (?,?,?,?,?,?)";
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, ++numberOfRecord);
//			pstmt.setString(2, fname.getText());
//			pstmt.setString(3, fpass.getPassword());
//			pstmt.setString(4, fnum1.getText());
//			pstmt.setString(5, fnum2.getText());
//			pstmt.setString(6, fphone.getText());

		}catch(ClassNotFoundException e) {
			handleError(e.getMessage());
		}catch(SQLException e) {
			handleError(e.getMessage());
		}
		
		setSize(500, 500);
		setVisible(true);
	}
	
	private void insertMember(String n1, String n2, String n3, )
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == menu2) {
			System.exit(0);
		} else if(e.getSource() == save) {
			String name = fname.getText();
			String pass = fpass.getText();
			String num1 = fnum1.getText();
			String num2 = fname.getText();
			String phone = fphone.getText();
			insertMember(name, pass, num1, num2, phone);
		}
	}

	private void handleError(String string) {
		System.out.println(string);
		System.exit(1);
	}


	public static void main(String[] args) {
		new MemberDB();

	}

		

}
