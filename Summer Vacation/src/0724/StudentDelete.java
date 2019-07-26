package jdbc;

import java.util.*;
import java.sql.*;

public class StudentDelete {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("삭제하실 데이터의 학번을 입력하시오. >> ");
		String id = sc.next();
		
		Connection conn=null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/javap", "root", "mirim2"); //DB연결
			System.out.println("DB 연결 완료");
			String sql = "delete from student where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			pstmt.executeUpdate(); //실행시키는 거
			
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
