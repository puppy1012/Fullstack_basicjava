package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
//sql문의 insert명령문을 실행
public class PreparedInsertTest {
	public static void main(String[] args) {
		PreparedInsertTest obj= new PreparedInsertTest();
		Scanner sc= new Scanner(System.in);
		System.out.println("*****회원가입*****");
		System.out.print("아이디 : ");
		String id= sc.next();
		System.out.print("패스워드 : ");
		String pass= sc.next();
		System.out.print("성명 : ");
		String name= sc.next();
		System.out.print("주소 : ");
		String addr= sc.next();
		obj.insert(id,pass,name,addr);
	}
	public void insert(String id, String pass,String name,String addr) {
		//localhost = 127.0.0.1
		String url="jdbc:mysql://127.0.0.1:3306/shop?serverTimezone=UTC";
		String user="shop";
		String password="shop";
//		String sql="insert into customer values('test','1234','석진','부산',sysdate())";
//		String sql="insert into customer values('"+id+"','"+pass+"','"+name+"','"+addr+"',sysdate())";
//		StringBuilder sql2=new StringBuilder();
//		sql2.append("insert into customer values('");
//		sql2.append(id).append("','");
//		sql2.append(pass).append("','");
//		sql2.append(name).append("','");
//		sql2.append(addr).append("','");
		String sql="insert into customer values('?','?','?'.'?',sysdate()";
		Connection con=null;
		PreparedStatement ptmt=null;
		try {
			//1.드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("MySQL드라이버 로딩 성공");
			//2.DBMS에 접속
			con =DriverManager.getConnection(url,user,password);
			System.out.println("연결성공"+con);
			//3. SQL문을 실행하기 위한 객체를 생성
			ptmt =con.prepareStatement(sql);
			System.out.println("Statement객체생성=>"+ptmt);
			ptmt.setString(1,id);
			ptmt.setString(2, pass);
			ptmt.setString(3,name);
			ptmt.setString(4, addr);
			//4. SQL문 실행
			int result=ptmt.executeUpdate();
			//5.실행결과 처리
			System.out.println(result+"개 행 삽입성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(ptmt!=null) ptmt.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
