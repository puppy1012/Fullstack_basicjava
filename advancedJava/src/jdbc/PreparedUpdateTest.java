package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
//sql문의 insert명령문을 실행
public class PreparedUpdateTest {
	public static void main(String[] args) {
		PreparedUpdateTest obj = new PreparedUpdateTest();
		Scanner sc = new Scanner(System.in);
		System.out.println("*****Update*****");
		System.out.println("아이디기준 업데이트");// id 기준 업데이트(기존)
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("현재 주소값만 변경가능\n 변경할 주소 : ");
		String addr=sc.next();

		obj.Update(id,addr);
	}
	public void Update(String id, String addr) {
		//localhost = 127.0.0.1
		String url="jdbc:mysql://127.0.0.1:3306/shop?serverTimezone=UTC";
		String user="shop";
		String password="shop";
		
		String sql="update customer set addr=? where id=?";

		//1. 드라이버로딩
		try {
			//1.드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			try (Connection con =DriverManager.getConnection(url,user,password);
				PreparedStatement pstmt =con.prepareStatement(sql);
				){
				pstmt.setString(1,addr);
				pstmt.setString(2, id);
				int result=pstmt.executeUpdate();
				//5.실행결과 처리
				if(result>0) {
					System.out.println(result+"개 update 성공");
				}else {
					System.out.println(result+"개 update 실패");
				}
			}
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
