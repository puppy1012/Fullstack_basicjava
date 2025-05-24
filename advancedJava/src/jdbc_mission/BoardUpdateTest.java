package jdbc_mission;

import java.sql.*;

public class BoardUpdateTest {
	public static void main(String[] args) {
		String url="jdbc:mysql://127.0.0.1:3306/shop?serverTimezone=UTC";
		String user="shop";
		String password="shop";
		//board_id(int),hit(int),title(varchar)
		//writer(varchar),content(varchar),reg_date(sysdate())
		StringBuffer sql=new StringBuffer();
		sql.append("update board ");
		sql.append("set title='spring test' ");
		sql.append("where board_no=1 ");
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
