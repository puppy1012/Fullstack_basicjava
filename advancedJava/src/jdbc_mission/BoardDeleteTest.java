package jdbc_mission;

import java.sql.*;

public class BoardDeleteTest {
	public static void main(String[] args) {
		String url = "jdbc:mysql://127.0.0.1:3306/shop?serverTimezone=UTC";
		String user = "shop";
		String password = "shop";
		StringBuffer sql = new StringBuffer();
		sql.append("delete from board ");
		sql.append("where board_no=2 ");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try (Connection con = DriverManager.getConnection(url, user, password);
					Statement stmt = con.createStatement();) {
				int result = stmt.executeUpdate(sql.toString());
				if (result > 0) {
					System.out.println("성공 (" + result + "건 삭제)");
				} else {
					System.out.println("삭제할 데이터 없음");
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
