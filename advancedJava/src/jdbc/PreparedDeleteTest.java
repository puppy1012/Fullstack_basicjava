package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//sql문의 insert명령문을 실행
public class PreparedDeleteTest {
	public static void main(String[] args) {
		PreparedDeleteTest obj = new PreparedDeleteTest();
		Scanner sc = new Scanner(System.in);
		System.out.println("*****Delete*****");
		System.out.println("아이디 기준 삭제");// id 기준 삭제(기존)
		System.out.print("아이디 : ");
		String id = sc.next();

		obj.insert(id);
	}

	public void insert(String id) {
		// localhost = 127.0.0.1
		String url = "jdbc:mysql://127.0.0.1:3306/shop?serverTimezone=UTC";
		String user = "shop";
		String password = "shop";
		String sql = "delete from customer where id=? ";

		try {
			// 1.드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			try (// 2.DBMS에 접속
				Connection con = DriverManager.getConnection(url, user, password);
				// 3. SQL문을 실행하기 위한 객체를 생성
				PreparedStatement ptmt = con.prepareStatement(sql);
					) {
				ptmt.setString(1, id);
				// 4. SQL문 실행
				int result = ptmt.executeUpdate();
				// 5.실행결과 처리
				if(result>0) {
					System.out.println(result+"개 삭제 성공");
				}else {
					System.out.println(result+"개 삭제 실패");
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
