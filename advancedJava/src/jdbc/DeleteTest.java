package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTest {
	public static void main(String[] args) {
		String url="jdbc:mysql://127.0.0.1:3306/shop?serverTimezone=UTC";
		String user="shop";
		String password="shop";
		StringBuffer sql=new StringBuffer();
		sql.append("delete from customer ");
		sql.append("where id='test' ");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("MySQL드라이버 로딩 진입");
			
			Connection con=DriverManager.getConnection(url, user, password);
			System.out.println("연결성공 ,결과:"+con);
			
			Statement stmt=con.createStatement();
			System.out.println("Statement객체 생성시도=>"+stmt);
			
			int result= stmt.executeUpdate(sql.toString());
			
			System.out.println(result+"개 행 삭제 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
