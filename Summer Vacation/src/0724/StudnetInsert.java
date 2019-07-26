package jdbc;
import java.util.*;
import java.sql.*;
public class StudnetInsert {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Connection conn=null;
		PreparedStatement pstmt = null;
		
		System.out.print("name, dept, id를 입력하시오. >>");
		String name = sc.next();
		String dept = sc.next();
		String id = sc.next();
		try {
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/javap", "root", "mirim2");
			System.out.println("DB 연결 완료");
			String sql = "insert into student (name, dept, id) values(?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, dept);
			pstmt.setString(3, id);
			
			pstmt.executeUpdate();
			
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
