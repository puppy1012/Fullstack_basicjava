package practice;

import java.util.ArrayList;
import java.util.List;

public class BookMgr {
//	private Book[] booklist;
//
//	public BookMgr(Book[] inputbooklist) {
//		//�迭�̴ϱ� �� ���� ���������� �Ҵ�ó�� ����
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
		//�������� book�����̴� getter setter����ó��
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
		System.out.println("��ü å ������ �� : "+total);
	}

	public List<Book> getBooklist() {
		return booklist;
	}

	public void setBooklist(List<Book> booklist) {
		this.booklist = booklist;
	}
	//CRUD
	//insert select update delete
	//CLRUD -insert, L-������ ����� ��ȸ, R- �ϳ��� ���ڵ常 ��ȸ, update, delete
	//1. ArryaList�� Book������ �����ϱ�
	public void addBook(Book book) {
		booklist.add(book);
	}
	//2. ��ü Booklist��ȸ
	public void print() {
		for(Book book:booklist) {
			System.out.println("å����: "+book.getTitle()+
					",����:"+book.getPrice());
			
		}
	}
}
