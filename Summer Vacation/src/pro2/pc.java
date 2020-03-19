package pro2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class pc {
	
	private pcManagement pcm;
	
	public boolean pc(String num, String id, Connection conn, PreparedStatement pstmt) {
	
		try {
			
			String sql = "select * from pc where num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);
			ResultSet srs = pstmt.executeQuery();
			while(srs.next()) {
				if(srs.getString("id").equals(num)) {
					System.out.println("eeee");
					sql = "update pc set id=? where num=?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, id);
					pstmt.setString(2, num);
					
					pstmt.executeUpdate();
					return true;
				}
				else {					
					System.out.println("이미 사용중인 자리입니다."); return false;
				}
			}
		}catch(SQLException ex) {
			System.out.println("SQLException:" + ex);
		}catch(Exception ex) {
			System.out.println("asdf");
			System.out.println("Exception:" + ex);
		}
		return true;
	}
}
