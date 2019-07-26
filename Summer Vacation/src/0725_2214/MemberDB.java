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
		setTitle("회원 데이터 베이스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(6, 2, 0, 0));
		
		//메뉴바
		mb = new JMenuBar();
		menu1 = new JMenu("메뉴");
		menu2 = new JMenu("종료");
		
		save = new JMenuItem("회원 등록");
		save.addActionListener(this);
		
		view = new JMenuItem("모든 회웜 보기");
		view.addActionListener(this);
		
		menu1.add(save);
		menu1.add(view);
		
		this.setJMenuBar(mb);
		
		//
		namelabel = new JLabel("성명");
		namelabel.setSize(50, 50);
		fname = new TextField();
		namelabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		passlabel = new JLabel("비밀번호");
		passlabel.setHorizontalAlignment(SwingConstants.CENTER);
		JPasswordField fpass = new JPasswordField();
		
		num1label = new JLabel("주민번호1");
		num1label.setHorizontalAlignment(SwingConstants.CENTER);
		TextField fnum1 = new TextField();
		
		num2label = new JLabel("주민번호2");
		num2label.setHorizontalAlignment(SwingConstants.CENTER);
		TextField fnum2 = new TextField();

		phonelabel = new JLabel("전화번호");
		phonelabel.setHorizontalAlignment(SwingConstants.CENTER);
		TextField fphone = new TextField();
		
		NextBut = new JButton("다음 회원");
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
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/javap", "root", "mirim2"); //DB연결
			System.out.println("DB 연결 완료");
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
