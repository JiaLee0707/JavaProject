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
			System.out.println("Use DB ���� �Ϸ�");
			
			String sql = "select * from pcmember where id = ? and password =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			
			ResultSet srs = pstmt.executeQuery();
			while(srs.next()) {
				way = srs.getString("payment");
				if(way.equals("����")) {
					
					System.out.println("��ð��� �����ðڽ��ϱ�?(1�ð��� 1000��)(����:60��)\n ���Ḧ ���Ͻø� 0");
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
					pstmt.executeUpdate(); //�����Ű�� ��
					timer.run(way, time);
				}
				else if(way.equals("�ĺ�")) {
					System.out.println("���Ḧ ���Ͻø� 0�� ��������");
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
