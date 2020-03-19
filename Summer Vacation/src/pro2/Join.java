package pro2;

import java.sql.*;

class Join {
	private pcManagement pcm;
	public boolean join(String name, String id, String ps, String pay, Connection conn, PreparedStatement pstmt) {

		try {
			String sql = "insert into pcmember (name, id, password, time, payment, money) values(?, ?, ?, '00:00', ?, '0')";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			pstmt.setString(3, ps);
			pstmt.setString(4, pay);
			
			pstmt.executeUpdate();
			System.out.println("dsfa");
			
			sql = "select * from pcmember";
			pstmt = conn.prepareStatement(sql);
			ResultSet srs = pstmt.executeQuery();
			while(srs.next()) {
				System.out.print(srs.getString("name")+" ");
				System.out.print(srs.getString("id")+" ");
				System.out.print(srs.getString("payment")+" ");
				System.out.println();
			}
		}catch(SQLException ex) {
			System.out.println("SQLException:" + ex);
		}catch(Exception ex) {
			System.out.println("Exception:" + ex);
		}
		return true;
	}
}
