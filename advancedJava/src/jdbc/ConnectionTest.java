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
		//1. ����̹��ε�
		try {
			//1.����̹� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("MySQL����̹� �ε� ����");
			//2.DBMS�� ����
			Connection con =DriverManager.getConnection(url,user,password);
			System.out.println("���Ἲ��"+con);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//�ǹ������� �̸�Ŀ�ؼ��� �������� ��û�� ������ �ĳ�������
	}
}
