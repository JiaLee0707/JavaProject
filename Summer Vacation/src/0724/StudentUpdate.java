package jdbc;

import java.sql.*;
import java.util.*;

public class StudentUpdate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Connection conn=null;
		PreparedStatement pstmt = null;
		
		System.out.println("�����Ͻ� �������� �й��� �Է��ϼ���. >> ");
		String id=sc.next();
		//System.out.println("�����Ͻ� �������� �׸� ���ÿ�. (name, dept, id) >>");
		//String choice = sc.next();
		System.out.println("�й��� ��� �����Ͻðڽ��ϱ�? >> ");
		String change = sc.next();
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/javap", "root", "mirim2"); //DB����
			System.out.println("DB ���� �Ϸ�");
			String sql = "update student set id = ? where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, change);
			pstmt.setString(2, id);
			pstmt.executeUpdate(); //�����Ű�� ��
			
			sql = "select * from student";
			pstmt = conn.prepareStatement(sql);
			ResultSet srs = pstmt.executeQuery();
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

}
