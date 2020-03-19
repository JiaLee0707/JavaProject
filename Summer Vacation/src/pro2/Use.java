package pro2;

import java.sql.*;
import java.util.*;

class Use {
	public void use(String id, String password) {
		Connection conn=null;
		PreparedStatement pstmt = null;
		
		Scanner sc=new Scanner(System.in);
		
		String way, time = null;
		Timer timer = new Timer();
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/javap", "root", "mirim2");
			System.out.println("Use DB 연결 완료");
			
			String sql = "select * from pcmember where id = ? and password =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			
			ResultSet srs = pstmt.executeQuery();
			while(srs.next()) {
				way = srs.getString("payment");
				if(way.equals("선불")) {
					
					System.out.println("몇시간을 넣으시겠습니까?(1시간에 1000원)(단위:60분)\n 종료를 원하시면 0");
					time=sc.next();
					int t = Integer.parseInt(time);
					int count;
					for(count=0; t >=60; count++) {
						t-=60;
					}
					String money = Integer.toString(count*1000);
					sql = "update pcmember set time = ?, money = ? where id = ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, time);
					pstmt.setString(2, money);
					pstmt.setString(3, id);
					pstmt.executeUpdate(); //실행시키는 거
					timer.run(way, time);
				}
				else if(way.equals("후불")) {
					System.out.println("종료를 원하시면 0을 누르세요");
					timer.run(way, time);
					
				}
			}
		}catch(SQLException ex) {
			System.out.println("SQLException:" + ex);
		}catch(Exception ex) {
			System.out.println("Exception:" + ex);
		}
	}
}
