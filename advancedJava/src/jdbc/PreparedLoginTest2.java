package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedLoginTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****로그인*****");
		System.out.println("아이디 : ");
		String id = sc.next();
		System.out.println("패스워드 : ");
		String pass = sc.next();
		if(id==null||id.trim().isEmpty()||pass==null||pass.trim().isEmpty()) {
			System.out.println("아이디와 패스워드는 필수입니다.");
			return;
		}
		new PreparedLoginTest2().Login(id, pass);
	}

	public void Login(String id, String pass) {
		String url = "jdbc:mysql://127.0.0.1:3306/shop?serverTimezone=UTC";
		String user = "shop";
		String password = "shop";
		String sql = "select * from customer where id= ? and pass=?";

		try {
			// 1.드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			try (// 2.DBMS에 접속
					Connection con = DriverManager.getConnection(url, user, password);
					// 3. SQL문을 실행하기 위한 객체를 생성
					PreparedStatement pstmt = con.prepareStatement(sql);) {

				// 4. SQL문 실행
				// ?에 값 바인딩
				pstmt.setString(1, id);
				pstmt.setString(2, pass);
				try (ResultSet rs = pstmt.executeQuery()) {

					// 모든 데이터에 접근을 하는게 아니라 sql문에서부터 조건을 걸어라
					// rs.next()가 true이면 성공,false이면 실패
					if (rs.next()) {
						System.out.println("로그인성공");
					} else {
						System.out.println("로그인실패");
					}
				}

			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}