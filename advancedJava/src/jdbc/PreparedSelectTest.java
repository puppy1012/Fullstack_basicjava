package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedSelectTest {
	public static void main(String[] args) {
		PreparedSelectTest pt = new PreparedSelectTest();
		Scanner sc = new Scanner(System.in);
		System.out.println("*****Select*****");
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		System.out.println("패스워드 : ");
		String pass = sc.next();
		pt.Login(id, pass);
	}

	public void Login(String id, String pass) {
		String url = "jdbc:mysql://127.0.0.1:3306/shop?serverTimezone=UTC";
		String user = "shop";
		String password = "shop";
//		String sql = "select * from customer where id='" + id + "' and pass='" + pass + "'";
		String sql= "select * from customer where id=? and pass=?";
		try {
			// 1.드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			try (// 2.DBMS에 접속
				Connection con = DriverManager.getConnection(url, user, password);
				// 3. SQL문을 실행하기 위한 객체를 생성
				PreparedStatement pstmt=con.prepareStatement(sql);
				) {
				pstmt.setString(1, id);
				pstmt.setString(2,pass);
				// 4. SQL문 실행
				ResultSet rs = pstmt.executeQuery();
				ResultSetMetaData rsmd = rs.getMetaData();
				int columnCount = rsmd.getColumnCount();
				// 모든 데이터에 접근을 하는게 아니라 sql문에서부터 조건을 걸어라
				while (rs.next()) {
					for (int i = 1; i <= columnCount; i++) {
						String columnName = rsmd.getColumnName(i);
						String columnValue = rs.getString(i);
						System.out.print(columnName + " : " + columnValue + "\t");
					}
					System.out.println();
				}

			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}