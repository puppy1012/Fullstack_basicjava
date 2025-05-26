package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedLoginTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****�α���*****");
		System.out.println("���̵� : ");
		String id = sc.next();
		System.out.println("�н����� : ");
		String pass = sc.next();
		if(id==null||id.trim().isEmpty()||pass==null||pass.trim().isEmpty()) {
			System.out.println("���̵�� �н������ �ʼ��Դϴ�.");
			return;
		}
		new PreparedLoginTest2().Login(id, pass);
	}

	public void Login(String id, String pass) {
		String url = "jdbc:mysql://127.0.0.1:3306/shop?serverTimezone=UTC";
		String user = "shop";
		String password = "shop";
		String sql = "select * from customer where id= ? and pass=?";

		try {
			// 1.����̹� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			try (// 2.DBMS�� ����
					Connection con = DriverManager.getConnection(url, user, password);
					// 3. SQL���� �����ϱ� ���� ��ü�� ����
					PreparedStatement pstmt = con.prepareStatement(sql);) {

				// 4. SQL�� ����
				// ?�� �� ���ε�
				pstmt.setString(1, id);
				pstmt.setString(2, pass);
				try (ResultSet rs = pstmt.executeQuery()) {

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