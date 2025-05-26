package jdbc.customer;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuController {
	Scanner key = new Scanner(System.in);
	CustomerDAOImpl dao = new CustomerDAOImpl();
	public void insertMenu(){//ȸ�����
		System.out.println("*******�����********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�н�����:");
		String pass = key.next();
		System.out.print("����:");
		String name = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		CustomerDTO cdto= new CustomerDTO(id,pass,name,addr);
		int result=dao.insert(cdto);
		if(result>=1) {
			System.out.println("=========================");
			System.out.println("�α����ؼ� ���������� �̵�");
			System.out.println("=========================");
		}else {
			System.out.println("--------------------------");
			System.out.println("���и� �˷� �� �� �ִ� alert����");
			System.out.println("�ٽ� ȸ�������� �� �ִ� �������� �̵�");
			System.out.println("--------------------------");
		}
		
	}
	public void updateMenu(){//ȸ����������
		System.out.println("*******����������********");
		System.out.print("�ּ�:");
		String addr = key.next();
		System.out.print("���̵�:");
		String id = key.next();
		//1~2�������� �׳� �ٷ� �Է��ص� ������.
		String result=dao.Update(id, addr);
		if(result!=null) {
			System.out.println(result);
		}else {
			System.out.println("����");
		}
	}
	public void deleteMenu(){//ȸ��Ż��
		System.out.println("*******��Ż��********");
		System.out.print("������id:");
		String id = key.next();
		int result=dao.delete(id);
		if(result>0) {
			System.out.println("================");
			System.out.println(result+"�� ���� ����");
			System.out.println("================");
		}else {
			System.out.println("================");
			System.out.println(result+"�� ���� ����");
			System.out.println("================");
		}
	}
	public void findByAddrMenu(){
		System.out.println("*******���˻�********");
		System.out.print("�ּ�:");
		String addr = key.next();
		ArrayList<CustomerDTO> list=dao.findByArr(addr);
		for(CustomerDTO customer:list) {
			System.out.println("���̵� : "+customer.getId());
			System.out.println("�н����� : "+customer.getPass());
			System.out.println("���� : "+customer.getName());
			System.out.println("�ּ� : "+customer.getAddr());
			System.out.println("���Գ�¥ : "+customer.getRegDate());
			System.out.println("============================");
		}
		
	}
	public void loginMenu() {
		System.out.println("*******�α���********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�н�����:");
		String pass = key.next();
//		String loginUser=dao.Login(id, pass);
//		//�α��� �����ϸ� �α��μ���!!�޽����� �α����� ������� ��� ������ ���(printȣ��)
//		if(loginUser!=null) {
//			System.out.println("�α��μ���");
//			print(loginUser);
//		}else {
//			System.out.println("�α��ν���");
//		}
		//�α��� �����ϸ� �α��ν���!!�޽����� ���
	}
	public void selectMenu(){
		System.out.println("*******�����ȸ********");
		//���⿡��MemberDAO�� �޼ҵ带 ȣ���ϼ��� - ��ü�����ȸ
		ArrayList<CustomerDTO> list=dao.Select();
		for(CustomerDTO customer: list) {
			System.out.println("���̵� : "+customer.getId());
			System.out.println("�н����� : "+customer.getPass());
			System.out.println("���� : "+customer.getName());
			System.out.println("�ּ� : "+customer.getAddr());
			System.out.println("���Գ�¥ : "+customer.getRegDate());
			System.out.println("============================");
		}
	}
	public void myPageMenu() {
		System.out.println("*******����������********");
		System.out.print("���̵�:");
		String id = key.next();
		
//		if(user==null) {
//			System.out.println("��ġ�ϴ� ����ڰ� �����ϴ�.");
//		}else {
//			print(user);
//		}
	}
//	public void print(MemberDTO user) {
//		System.out.print(user.getId()+"\t");
//		System.out.print(user.getPass()+"\t");
//		System.out.print(user.getName()+"\t");
//		System.out.print(user.getAddr()+"\t");
//		System.out.print(user.getRegDate()+"\t");
//	
//	}
	
	
}













