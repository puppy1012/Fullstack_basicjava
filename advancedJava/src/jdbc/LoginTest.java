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
			//1.����̹� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2.DBMS�� ����
			Connection con =DriverManager.getConnection(url,user,password);
			//3. SQL���� �����ϱ� ���� ��ü�� ����
			Statement stmt =con.createStatement();
			//4. SQL�� ����
			ResultSet rs=stmt.executeQuery(sql);
			System.out.println("select������=>"+rs);
			//��� �����Ϳ� ������ �ϴ°� �ƴ϶� sql���������� ������ �ɾ��
			//rs.next()�� true�̸� ����,false�̸� ����
			if(rs.next()) {
				System.out.println("�α��μ���");
			}else {
				System.out.println("�α��ν���");
			}
			//5. ������ ó�� - ���ڵ尡 �����ϴ� ���� �ݺ�����
//			while(rs.next()) {//���ڵ尡 ������ true, ������ false ��ȯ
//				String id=rs.getString("id");
//				String pass=rs.getNString("pass");
//				if(id.equals("bts1")&&pass.equals("1234")) {
//					found=true;
//					break;
//				}
//			}
//			System.out.println(found ? "�α��μ���" :"�α��ν���");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
