package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//sql���� insert��ɹ��� ����
public class InsertTest {
	public static void main(String[] args) {
		//localhost = 127.0.0.1
		String url="jdbc:mysql://127.0.0.1:3306/shop?serverTimezone=UTC";
		String user="shop";
		String password="shop";
		String sql="insert into customer values('test','1234','����','�λ�',sysdate());";
//		String sq2="insert into customer values('bts1','1234','����','����',sysdate());"
		//1. ����̹��ε�
		try {
			//1.����̹� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("MySQL����̹� �ε� ����");
			//2.DBMS�� ����
			Connection con =DriverManager.getConnection(url,user,password);
			System.out.println("���Ἲ��"+con);
			//3. SQL���� �����ϱ� ���� ��ü�� ����
			Statement stmt =con.createStatement();
			System.out.println("Statement��ü����=>"+stmt);
			//4. SQL�� ����
			int result=stmt.executeUpdate(sql);
			//5.������ ó��
			System.out.println(result+"�� �� ���Լ���");
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
