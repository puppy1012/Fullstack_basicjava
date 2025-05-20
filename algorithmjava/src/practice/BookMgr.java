package practice;

import java.util.ArrayList;
import java.util.List;

public class BookMgr {
//	private Book[] booklist;
//
//	public BookMgr(Book[] inputbooklist) {
//		//배열이니까 각 값에 직접적으로 할당처리 가능
//		booklist= new Book[inputbooklist.length];
//		for(int i=0;i<inputbooklist.length;i++) {
//			booklist[i]=inputbooklist[i];
//		}
//		// TODO Auto-generated constructor stub
//	}
	private List<Book> booklist;
	public BookMgr() {
		booklist=new ArrayList<Book>();
	}
	public BookMgr(List<Book> booklist) {
		super();
		this.booklist=booklist;
		
	}

	public void printBooklist() {
		// TODO Auto-generated method stub
		//값형식이 book형식이니 getter setter참조처리
		for(Book i:booklist) {
			System.out.println(i.getTitle());
		}
	}

	public void printTotalPrice() {
		// TODO Auto-generated method stub
		int total=0;
		for(Book i:booklist) {
			total+=i.getPrice();
		}
		System.out.println("전체 책 가격의 합 : "+total);
	}

	public List<Book> getBooklist() {
		return booklist;
	}

	public void setBooklist(List<Book> booklist) {
		this.booklist = booklist;
	}
	//CRUD
	//insert select update delete
	//CLRUD -insert, L-여러개 목록이 조회, R- 하나의 레코드만 조회, update, delete
	//1. ArryaList에 Book데이터 저장하기
	public void addBook(Book book) {
		booklist.add(book);
	}
	//2. 전체 Booklist조회
	public void print() {
		for(Book book:booklist) {
			System.out.println("책제목: "+book.getTitle()+
					",가격:"+book.getPrice());
			
		}
	}
}
