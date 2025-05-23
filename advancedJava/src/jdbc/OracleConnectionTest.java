package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleConnectionTest {
	public static void main(String[] args) {
		String url="jdbc:oracle:thin:@192.168.45.195:1521:xe";
        String user="scott";
        String password="tiger";
        String sql="select * from customer";
        try {
            //1. ����̹��ε�
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("����̹��ε�����!!");
            //2. ����
            Connection con = DriverManager.getConnection(url, user, password);
            //����Ÿ������ ����������(con) ���� ����Ǵ� ���� ��ӹ��� ����Ŭ������ Connection��ü�� ����
            System.out.println("���Ἲ��!!"+con);
			Statement stmt =con.createStatement();
			System.out.println("Statement��ü����=>"+stmt);
			ResultSet rs=stmt.executeQuery(sql);
			System.out.println("select������=>"+rs);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
}