package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	public static void main(String[] args) {
		//localhost = 127.0.0.1
		String url="jdbc:mysql://192.168.0.107:3306/shop?serverTimezone=UTC";
		String user="shop";
		String password="shop";
		//1. 드라이버로딩
		try {
			//1.드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("MySQL드라이버 로딩 성공");
			//2.DBMS에 접속
			Connection con =DriverManager.getConnection(url,user,password);
			System.out.println("연결성공"+con);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//실무에서는 미리커넥션을 만들어놓고 요청이 들어오면 쳐내는형식
	}
}
