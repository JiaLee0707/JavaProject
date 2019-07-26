package jdbc;

import java.util.*;
import java.sql.*;

public class Student {

	public Connection conn=null;
	public PreparedStatement pstmt = null;
	
	public void Insert(String name, String dept, String id) {
		try {
			String sql = "insert into student (name, dept, id) values(?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, dept);
			pstmt.setString(3, id);
			
			pstmt.executeUpdate();			
		}catch(SQLException ex) {
			System.out.println("SQLException:" + ex);
		}catch(Exception ex) {
			System.out.println("Exception:" + ex);
		}
	}
	
	public void select(String name, String dept, String id) {
		try {
			String sql = "select * from student";
			pstmt = conn.prepareStatement(sql);
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
		}
	}
	
	public void ConditionSelect(String name, String dept, String id) {
		condition
	}

}
