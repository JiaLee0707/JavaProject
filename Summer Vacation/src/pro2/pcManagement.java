package pro2;

import java.sql.*;
import java.util.*;

class pcManagement {
	Scanner sc=new Scanner(System.in);
	
	String id;
	String password;
	String payment;
	
	Connection conn=null;
	PreparedStatement pstmt = null;
	
	public pcManagement() {
		try {
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/javap", "root", "mirim2");
			System.out.println("DB ���� �Ϸ�");
		}catch(SQLException ex) {
			System.out.println("SQLException:" + ex);
		}catch(Exception ex) {
			System.out.println("Exception:" + ex);
		}
		
		
		Login login = new Login();
		Join join = new Join();
		Use use = new Use();
		Timer timer = new Timer();
		pc pc = new pc();
		
		System.out.println("pc���� ���α׷�");
		System.out.print("����Ͻ� pc�� �����ϼ���(1~6) : ");
		int num = sc.nextInt();
		System.out.println("�α��� : 1, ȸ������ : 0");
		int n=sc.nextInt();
		boolean bl = false, pbl = false;
		if(n == 1) {
			id = sc.next();
			password = sc.next();
			bl = login.Login(id, password, conn, pstmt);
			pbl = pc.pc(Integer.toString(num), id, conn, pstmt);
		}
		else if(n == 0) {
			String name = sc.next();
			id = sc.next();
			password = sc.next();
			System.out.println("����? �ĺ�?");
			payment = sc.next();
			bl = join.join(name, id, password, payment, conn, pstmt);
		}
		if(bl && pbl == true) {
			System.out.println("ȯ���մϴ�.");
			use.use(id, password);
		}
	}
	
	public static void main(String[] args) {
		
		pcManagement pm = new pcManagement();

	}

}


	


