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
			System.out.println("MySQL����̹� �ε� ����");
			
			Connection con=DriverManager.getConnection(url, user, password);
			System.out.println("���Ἲ�� ,���:"+con);
			
			Statement stmt=con.createStatement();
			System.out.println("Statement��ü �����õ�=>"+stmt);
			
			int result= stmt.executeUpdate(sql.toString());
			
			System.out.println(result+"�� �� ���� ����");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
