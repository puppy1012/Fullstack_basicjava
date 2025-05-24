package jdbc_mission;

import java.sql.*;

public class BoardInsertTest {
	public static void main(String[] args) {
		String url="jdbc:mysql://127.0.0.1:3306/shop?serverTimezone=UTC";
		String user="shop";
		String password="shop";
		//board_id(int),hit(int),title(varchar)
		//writer(varchar),content(varchar),reg_date(sysdate())
		StringBuffer sql=new StringBuffer();
		sql.append("insert into board ");
		//primary key가 auto_increment Primary key처리가 안되어있기에 일일히 지정해서 입력중
		sql.append("values(7,345,'spring','java','spring is bestframework',sysdate())");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//드라이버로딩
			Connection con=DriverManager.getConnection(url,user,password);//dbms접속
			Statement stmt = con.createStatement();//sql실행객체
			int result=stmt.executeUpdate(sql.toString());//sql실행
			System.out.println("실행결과 : "+result);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
