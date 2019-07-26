package jdbc;

import java.util.*;
import java.sql.*;

public class StudentManage {
	Scanner sc=new Scanner(System.in);
	
	StudentManage() {
		try {
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/javap", "root", "mirim2");
			System.out.println("DB 연결 완료");
			menu();
		}catch(SQLException ex) {
			System.out.println("SQLException:" + ex);
		}catch(Exception ex) {
			System.out.println("Exception:" + ex);
		}
	}
	
	public void menu() throws SQLException {
		while(true) {
			System.out.print("1 입력, 2 전체 검색, 3 조건 검색, 4 정보 수정, 5조건 삭제, 6 종료 >> ");
			int n = sc.nextInt();
			Student s=new Student(conn, pstmt);
			switch(n) {
			case 1:
				System.out.print("name, dept, id를 입력하시오. >>");
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
		
		System.out.print("검색하실 학번을 입력하세요. >> ");
		String num = sc.next();
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/javap", "root", "mirim2");
			System.out.println("DB 연결 완료");
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
