package jdbc_mission;

import java.sql.*;

public class BoardInsertTest {
	public static void main(String[] args) {
		String url="jdbc:mysql://127.0.0.1:3306/shop?serverTimezone=UTC";
		String user="shop";
		String password="shop";
		//board_id(int),hit(int),title(varchar)
		//writer(varchar),content(varchar),reg_date(sysdate())
		StringBuffer sql=new StringBuffer();
		sql.append("insert into board ");
		//primary key�� auto_increment Primary keyó���� �ȵǾ��ֱ⿡ ������ �����ؼ� �Է���
		sql.append("values(7,345,'spring','java','spring is bestframework',sysdate())");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//����̹��ε�
			Connection con=DriverManager.getConnection(url,user,password);//dbms����
			Statement stmt = con.createStatement();//sql���ఴü
			int result=stmt.executeUpdate(sql.toString());//sql����
			System.out.println("������ : "+result);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
