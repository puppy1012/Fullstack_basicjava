package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//sql���� insert��ɹ��� ����
public class PreparedDeleteTest {
	public static void main(String[] args) {
		PreparedDeleteTest obj = new PreparedDeleteTest();
		Scanner sc = new Scanner(System.in);
		System.out.println("*****Delete*****");
		System.out.println("���̵� ���� ����");// id ���� ����(����)
		System.out.print("���̵� : ");
		String id = sc.next();

		obj.insert(id);
	}

	public void insert(String id) {
		// localhost = 127.0.0.1
		String url = "jdbc:mysql://127.0.0.1:3306/shop?serverTimezone=UTC";
		String user = "shop";
		String password = "shop";
		String sql = "delete from customer where id=? ";

		try {
			// 1.����̹� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			try (// 2.DBMS�� ����
				Connection con = DriverManager.getConnection(url, user, password);
				// 3. SQL���� �����ϱ� ���� ��ü�� ����
				PreparedStatement ptmt = con.prepareStatement(sql);
					) {
				ptmt.setString(1, id);
				// 4. SQL�� ����
				int result = ptmt.executeUpdate();
				// 5.������ ó��
				if(result>0) {
					System.out.println(result+"�� ���� ����");
				}else {
					System.out.println(result+"�� ���� ����");
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
