package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Prob{
	static BookMgr mgr;
	public static void main(String[] args) {
		//Prob booksystem=new Prob();
		//책 초기화
		//booksystem.init();
		init();
		while(true) {
			Scanner key = new Scanner(System.in);
	        System.out.println("*********서점시스템********");
	        System.out.println("1. 로그인");
	        System.out.println("2. 책등록");
	        System.out.println("3. 책조회");
	        System.out.println("4. 책정보수정");
	        System.out.println("5. 종료");
	        System.out.print("원하는 작업을 선택하세요:");
	        int job=key.nextInt();
	        if(job==2) {
	        	//BookMgr의 addBook메소드를 이용해서 책 등록
	        	System.out.println("책제목:");
	        	key.nextLine(); 
	        	String title= key.nextLine();
	        	System.out.println("가격:");
	        	key.nextLine(); 
	        	int price = key.nextInt();
	        	System.out.println("장르");
	        	key.nextLine(); 
	        	String category=key.nextLine();
	        	mgr.addBook(new ITBook(title,price,category));
	        	
	        	System.out.println("전체 책 정보 조회");
	        	//mgr.print();
	        }else if(job==3) {
	        	//BookMgr의 print메소드를 호출해서 조회
	        	mgr.print();
	        }else if(job==5) {
	        	System.exit(0);
	        }
		}
				
	}
	public static void init() {
		ArrayList<Book>booklist = new ArrayList<Book>();
		booklist.add(new ITBook("java프로그래밍",23000,"java"));
		booklist.add(new ITBook("안드로이드로 앱 만들기",25000,"android"));
		booklist.add(new ITBook("재미있는 스프링",30000,"java"));
		booklist.add(new ITBook("파이썬으로 AI익히기",23000,"python"));
		booklist.add(new ITBook("서블릿jsp",23000,"java"));
		mgr= new BookMgr(booklist);
	}
}