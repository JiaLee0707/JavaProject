package jdbc;

import java.sql.*;
import java.util.*;

public class StudentUpdate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Connection conn=null;
		PreparedStatement pstmt = null;
		
		System.out.println("변경하실 데이터의 학번을 입력하세요. >> ");
		String id=sc.next();
		//System.out.println("변경하실 데이터의 항목를 고르시오. (name, dept, id) >>");
		//String choice = sc.next();
		System.out.println("학번을 어떻게 변경하시겠습니까? >> ");
		String change = sc.next();
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/javap", "root", "mirim2"); //DB연결
			System.out.println("DB 연결 완료");
			String sql = "update student set id = ? where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, change);
			pstmt.setString(2, id);
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
