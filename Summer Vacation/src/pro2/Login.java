package pro2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class Login {
	private pcManagement pcm;
	public boolean Login(String id, String ps, Connection conn, PreparedStatement pstmt) {
		
		try {
			String sql = "select * from pcmember where id=? and password=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, ps);
			ResultSet srs = pstmt.executeQuery();
			while(srs.next()) {
				System.out.print(srs.getString("name")+" ");
				System.out.print(srs.getString("id")+" ");
				System.out.print(srs.getString("password")+" ");
				System.out.println();
				if(srs.getString("id")!=null && srs.getString("password")!=null) {
					System.out.println("Login ¼º°ø");
					return true;
				}
			}
			
		}catch(SQLException ex) {
			System.out.println("SQLException:" + ex);
		}catch(Exception ex) {
			System.out.println("Exception:" + ex);
		}
		return false;
	}
}