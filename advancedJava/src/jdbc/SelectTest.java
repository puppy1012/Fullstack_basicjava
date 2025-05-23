package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {
	public static void main(String[] args) {
		String url="jdbc:mysql://127.0.0.1:3306/shop?serverTimezone=UTC";
		String user="shop";
		String password="shop";
		String sql="select * from customer";
		
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
			//5. ������ ó�� - ���ڵ尡 �����ϴ� ���� �ݺ�����
			while(rs.next()) {//���ڵ尡 ������ true, ������ false ��ȯ
				System.out.print(rs.getString(1)+"\t");//�������� 0�� �ƴ� 1���� , ��ȸ�� ���̺��� 1���÷� �б�
				System.out.print(rs.getString("pass")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.print(rs.getDate(5)+"\t");
				System.out.println();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
