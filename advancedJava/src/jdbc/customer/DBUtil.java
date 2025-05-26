package jdbc.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * ����̹��ε�,Ŀ�ؼ�,�ڿ��ݳ� ��
 * ��� DAOŬ�������� �������� ó���ϴ� ����� ����
 * 1.����̹� �ε�
 * 	-�ѹ� ����
 * -static��
 * 2.DB���� ����
 * 	-sql���� ����ɶ����� �׻� DB������ ���� �����ؾ��ϹǷ� �޼ҵ帶�� ����
 * 	-�޼ҵ�� ����
 * 	-Connection�� ����
 * 	-static�޼ҵ�� ����
 * 3.�ڿ��ݳ�
 * 	-�޼ҵ帶�� �۾��� ������ ��� �ڿ��� �ݳ��ϵ��� ó��
 * 	-�޼ҵ带 ����
 * 	-��� �ڿ��� ���� �ݳ��� �ϳ��� �޼ҵ忡�� ó��)���� �ϳ��� ���� ����)
 * 	-static�޼ҵ�
 */
public class DBUtil {
	// ����̹��ε�
	// => Ŭ������ �ε��ɶ� �ѹ� ����ȴ�.
	static {
		System.out.println("static ��");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// DB���� �����ϱ�
	public static Connection getConnection() {
		Connection con = null;
		String url = "jdbc:mysql://127.0.0.1:3306/shop?serverTimezone=UTC";
		String user = "shop";
		String password = "shop";
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	// �ڿ� �ݳ�
	public static void close(ResultSet rs, Statement stmt, Connection con) {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (con != null)
				con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// ���� �۾��� ����
	// �ڿ� �ݳ� �޼��� �߰�
	public static void close_each(AutoCloseable ac) {
		if (ac != null) {
			try {
				ac.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
