package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
//sql���� insert��ɹ��� ����
public class PreparedInsertTest {
	public static void main(String[] args) {
		PreparedInsertTest obj= new PreparedInsertTest();
		Scanner sc= new Scanner(System.in);
		System.out.println("*****ȸ������*****");
		System.out.print("���̵� : ");
		String id= sc.next();
		System.out.print("�н����� : ");
		String pass= sc.next();
		System.out.print("���� : ");
		String name= sc.next();
		System.out.print("�ּ� : ");
		String addr= sc.next();
		obj.insert(id,pass,name,addr);
	}
	public void insert(String id, String pass,String name,String addr) {
		//localhost = 127.0.0.1
		String url="jdbc:mysql://127.0.0.1:3306/shop?serverTimezone=UTC";
		String user="shop";
		String password="shop";
//		String sql="insert into customer values('test','1234','����','�λ�',sysdate())";
//		String sql="insert into customer values('"+id+"','"+pass+"','"+name+"','"+addr+"',sysdate())";
//		StringBuilder sql2=new StringBuilder();
//		sql2.append("insert into customer values('");
//		sql2.append(id).append("','");
//		sql2.append(pass).append("','");
//		sql2.append(name).append("','");
//		sql2.append(addr).append("','");
		String sql="insert into customer values('?','?','?'.'?',sysdate()";
		Connection con=null;
		PreparedStatement ptmt=null;
		try {
			//1.����̹� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("MySQL����̹� �ε� ����");
			//2.DBMS�� ����
			con =DriverManager.getConnection(url,user,password);
			System.out.println("���Ἲ��"+con);
			//3. SQL���� �����ϱ� ���� ��ü�� ����
			ptmt =con.prepareStatement(sql);
			System.out.println("Statement��ü����=>"+ptmt);
			ptmt.setString(1,id);
			ptmt.setString(2, pass);
			ptmt.setString(3,name);
			ptmt.setString(4, addr);
			//4. SQL�� ����
			int result=ptmt.executeUpdate();
			//5.������ ó��
			System.out.println(result+"�� �� ���Լ���");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(ptmt!=null) ptmt.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
