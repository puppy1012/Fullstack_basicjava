package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedLoginTest {
	public static void main(String[] args) {
		PreparedLoginTest pt = new PreparedLoginTest();
		Scanner sc = new Scanner(System.in);
		System.out.println("*****�α���*****");
		System.out.println("���̵� : ");
		String id = sc.nextLine();
		System.out.println("�н����� : ");
		String pass = sc.next();
		pt.Login(id, pass);
	}

	public void Login(String id, String pass) {
		String url = "jdbc:mysql://127.0.0.1:3306/shop?serverTimezone=UTC";
		String user = "shop";
		String password = "shop";
//		String sql = "select * from customer where id='" + id + "' and pass='" + pass + "'";
		String sql= "select * from customer where id=? and pass=?";
		try {
			// 1.����̹� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			try (// 2.DBMS�� ����
				Connection con = DriverManager.getConnection(url, user, password);
				// 3. SQL���� �����ϱ� ���� ��ü�� ����
				PreparedStatement pstmt=con.prepareStatement(sql);
				) {
				pstmt.setString(1, id);
				pstmt.setString(2,pass);
				// 4. SQL�� ����
				
				try(ResultSet rs = pstmt.executeQuery();){
					// ��� �����Ϳ� ������ �ϴ°� �ƴ϶� sql���������� ������ �ɾ��
					// rs.next()�� true�̸� ����,false�̸� ����
					if (rs.next()) {
						System.out.println("�α��μ���");
					} else {
						System.out.println("�α��ν���");
					}
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}