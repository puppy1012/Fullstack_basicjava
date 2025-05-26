package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
//sql���� insert��ɹ��� ����
public class PreparedUpdateTest {
	public static void main(String[] args) {
		PreparedUpdateTest obj = new PreparedUpdateTest();
		Scanner sc = new Scanner(System.in);
		System.out.println("*****Update*****");
		System.out.println("���̵���� ������Ʈ");// id ���� ������Ʈ(����)
		System.out.print("���̵� : ");
		String id = sc.next();
		System.out.print("���� �ּҰ��� ���氡��\n ������ �ּ� : ");
		String addr=sc.next();

		obj.Update(id,addr);
	}
	public void Update(String id, String addr) {
		//localhost = 127.0.0.1
		String url="jdbc:mysql://127.0.0.1:3306/shop?serverTimezone=UTC";
		String user="shop";
		String password="shop";
		
		String sql="update customer set addr=? where id=?";

		//1. ����̹��ε�
		try {
			//1.����̹� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			try (Connection con =DriverManager.getConnection(url,user,password);
				PreparedStatement pstmt =con.prepareStatement(sql);
				){
				pstmt.setString(1,addr);
				pstmt.setString(2, id);
				int result=pstmt.executeUpdate();
				//5.������ ó��
				if(result>0) {
					System.out.println(result+"�� update ����");
				}else {
					System.out.println(result+"�� update ����");
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//�ǹ������� �̸�Ŀ�ؼ��� �������� ��û�� ������ �ĳ�������
	}
}
