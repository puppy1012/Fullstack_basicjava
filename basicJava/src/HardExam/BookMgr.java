package HardExam;
public class BookMgr {
	private Book[] booklist;
	
	public BookMgr(Book[] booklist) {
		this.booklist=booklist;
	}
	public BookMgr() {
		
	}	
	//1차원 배열 처리
	public void printBooklist(){
//		for(int i=0;i<booklist.length;i++) {
//			System.out.println(booklist[i].getTitle());
//		}
		for(Book i:booklist) {
			System.out.println(i.getTitle());
		}
	}
	
	public void printTotalPrice(){
		int total=0;
		for(Book i:booklist) {
			total+=i.getPrice();
		}
		System.out.println(total);
	}
}
