package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginTest {
	public static void main(String[] args) {
		String url="jdbc:mysql://127.0.0.1:3306/shop?serverTimezone=UTC";
		String user="shop";
		String password="shop";
		String sql="select * from customer where id='bts1' and pass='1234'";
//		boolean found=false;
		try {
			//1.드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2.DBMS에 접속
			Connection con =DriverManager.getConnection(url,user,password);
			//3. SQL문을 실행하기 위한 객체를 생성
			Statement stmt =con.createStatement();
			//4. SQL문 실행
			ResultSet rs=stmt.executeQuery(sql);
			System.out.println("select실행결과=>"+rs);
			//모든 데이터에 접근을 하는게 아니라 sql문에서부터 조건을 걸어라
			//rs.next()가 true이면 성공,false이면 실패
			if(rs.next()) {
				System.out.println("로그인성공");
			}else {
				System.out.println("로그인실패");
			}
			//5. 실행결과 처리 - 레코드가 존재하는 동안 반복실행
//			while(rs.next()) {//레코드가 있으면 true, 없으면 false 반환
//				String id=rs.getString("id");
//				String pass=rs.getNString("pass");
//				if(id.equals("bts1")&&pass.equals("1234")) {
//					found=true;
//					break;
//				}
//			}
//			System.out.println(found ? "로그인성공" :"로그인실패");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
