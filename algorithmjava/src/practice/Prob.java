package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Prob{
	static BookMgr mgr;
	public static void main(String[] args) {
		//Prob booksystem=new Prob();
		//å �ʱ�ȭ
		//booksystem.init();
		init();
		while(true) {
			Scanner key = new Scanner(System.in);
	        System.out.println("*********�����ý���********");
	        System.out.println("1. �α���");
	        System.out.println("2. å���");
	        System.out.println("3. å��ȸ");
	        System.out.println("4. å��������");
	        System.out.println("5. ����");
	        System.out.print("���ϴ� �۾��� �����ϼ���:");
	        int job=key.nextInt();
	        if(job==2) {
	        	//BookMgr�� addBook�޼ҵ带 �̿��ؼ� å ���
	        	System.out.println("å����:");
	        	key.nextLine(); 
	        	String title= key.nextLine();
	        	System.out.println("����:");
	        	key.nextLine(); 
	        	int price = key.nextInt();
	        	System.out.println("�帣");
	        	key.nextLine(); 
	        	String category=key.nextLine();
	        	mgr.addBook(new ITBook(title,price,category));
	        	
	        	System.out.println("��ü å ���� ��ȸ");
	        	//mgr.print();
	        }else if(job==3) {
	        	//BookMgr�� print�޼ҵ带 ȣ���ؼ� ��ȸ
	        	mgr.print();
	        }else if(job==5) {
	        	System.exit(0);
	        }
		}
				
	}
	public static void init() {
		ArrayList<Book>booklist = new ArrayList<Book>();
		booklist.add(new ITBook("java���α׷���",23000,"java"));
		booklist.add(new ITBook("�ȵ���̵�� �� �����",25000,"android"));
		booklist.add(new ITBook("����ִ� ������",30000,"java"));
		booklist.add(new ITBook("���̽����� AI������",23000,"python"));
		booklist.add(new ITBook("����jsp",23000,"java"));
		mgr= new BookMgr(booklist);
	}
}