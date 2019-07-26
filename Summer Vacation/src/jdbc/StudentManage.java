package jdbc;

import java.util.*;
import java.sql.*;

public class StudentManage {
	Scanner sc=new Scanner(System.in);
	
	StudentManage() {
		try {
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/javap", "root", "mirim2");
			System.out.println("DB ���� �Ϸ�");
			menu();
		}catch(SQLException ex) {
			System.out.println("SQLException:" + ex);
		}catch(Exception ex) {
			System.out.println("Exception:" + ex);
		}
	}
	
	public void menu() throws SQLException {
		while(true) {
			System.out.print("1 �Է�, 2 ��ü �˻�, 3 ���� �˻�, 4 ���� ����, 5���� ����, 6 ���� >> ");
			int n = sc.nextInt();
			Student s=new Student(conn, pstmt);
			switch(n) {
			case 1:
				System.out.print("name, dept, id�� �Է��Ͻÿ�. >>");
				String name = sc.next();
				String dept = sc.next();
				String id = sc.next();
				s.Insert(name, dept, id);
				break;
			case 2: ss.main(null); break;
			case 3: select(); break;
			case 4: su.main(null); break;
			case 5: sd.main(null); break;
			case 6: System.exit(0); break;
			}
		}
	}
	
	public void select() {
		
		System.out.print("�˻��Ͻ� �й��� �Է��ϼ���. >> ");
		String num = sc.next();
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/javap", "root", "mirim2");
			System.out.println("DB ���� �Ϸ�");
			String sql = "select * from student where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);
			ResultSet srs = pstmt.executeQuery();
			System.out.println("Name Dept   id");
			while(srs.next()) {
				System.out.print(srs.getString("name")+" ");
				System.out.print(srs.getString("dept")+" ");
				System.out.print(srs.getString("id")+" ");
				System.out.println();
			}
		}catch(SQLException ex) {
			System.out.println("SQLException:" + ex);
		}catch(Exception ex) {
			System.out.println("Exception:" + ex);
		}finally {
			if(conn != null)
				try {
					conn.close();
				}catch(SQLException sqle) {}
			if(pstmt != null) 
				try {
					pstmt.close();
				}catch(SQLException sqle) {}
		}
	}
	
	public static void main(String[] args) {
		new StudentManage();
	}

}
