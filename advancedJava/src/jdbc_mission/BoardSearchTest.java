package jdbc_mission;

import java.sql.*;

public class BoardSearchTest {
	public static void main(String[] args) {
		String url = "jdbc:mysql://127.0.0.1:3306/shop?serverTimezone=UTC";
		String user = "shop";
		String password = "shop";
		StringBuffer sql = new StringBuffer();
		sql.append("select * from board ");
		sql.append("where title='spring' ");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// �ڵ�ȭó�� �õ�
			try (Connection con = DriverManager.getConnection(url, user, password);
					Statement stmt = con.createStatement();
					ResultSet result = stmt.executeQuery(sql.toString());
			) {
				ResultSetMetaData rsmd = result.getMetaData();
				int columnCount = rsmd.getColumnCount();
				// ������ �÷���(�̷�)�� ������ Ȯ���ϰ� �����Ҽ��¾���
				while (result.next()) {
					for (int i = 1; i <= columnCount; i++) {
						String columnName = rsmd.getColumnName(i);
						String columnValue = result.getString(i);
						System.out.print(columnName + " : " + columnValue + "\t");
					}
					System.out.println();
				}
//				while(result.next()) {
//					ResultSetMetaData rsmd=result.getMetaData();
//					for(int i=1;i<=rsmd.getColumnCount();i++) {
//						System.out.print(result.getString(i)+"\t");
//					}
//				}
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
