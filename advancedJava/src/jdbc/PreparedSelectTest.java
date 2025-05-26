package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedSelectTest {
	public static void main(String[] args) {
		PreparedSelectTest pt = new PreparedSelectTest();
		Scanner sc = new Scanner(System.in);
		System.out.println("*****Select*****");
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
				ResultSet rs = pstmt.executeQuery();
				ResultSetMetaData rsmd = rs.getMetaData();
				int columnCount = rsmd.getColumnCount();
				// ��� �����Ϳ� ������ �ϴ°� �ƴ϶� sql���������� ������ �ɾ��
				while (rs.next()) {
					for (int i = 1; i <= columnCount; i++) {
						String columnName = rsmd.getColumnName(i);
						String columnValue = rs.getString(i);
						System.out.print(columnName + " : " + columnValue + "\t");
					}
					System.out.println();
				}

			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}