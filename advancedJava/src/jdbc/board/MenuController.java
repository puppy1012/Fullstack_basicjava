package jdbc.board;
import java.util.List;
import java.util.Scanner;

public class MenuController {
	Scanner key = new Scanner(System.in);
	BoardDAOImpl dao = new BoardDAOImpl();
	public void insertMenu(){
		System.out.println("*******�Խñ۵��********");
		System.out.print("�۹�ȣ:");
		int boardNo = Integer.parseInt(key.nextLine());
		System.out.print("����:");
		String title = key.nextLine();
		System.out.print("�۾���:");
		String writer = key.nextLine();
		System.out.print("����:");
		String content = key.nextLine();
		BoardDTO board= new BoardDTO(boardNo,0,title,writer,content);
		int result=dao.insert(board);
		if(result>0) {
			System.out.println("========");
			System.out.println(result+"�� ��� ����");
			System.out.println("========");
		}else {
			System.out.println("========");
			System.out.println(result+"�� ��� ����");
			System.out.println("========");
		}
		
	}
	public void updateMenu(){
		System.out.println("*******�Խñۼ���********");
		System.out.print("�۹�ȣ:");
		String boardNo = key.next();
		System.out.print("����:");
		String title = key.next();
		System.out.print("����:");
		String content = key.next();
		
	
	}
	public void deleteMenu(){
		System.out.println("*******�Խñۻ���********");
		System.out.print("�����ұ۹�ȣ:");
		String boardNo = key.next();
	    
	}
	public void findByTitleMenu(){
		System.out.println("*******�Խñ۰˻�********");
		System.out.print("����:");
		String title = key.next();
		
	}
	
	public void selectMenu(){
		System.out.println("*******��ü����ȸ********");
		
		
	}
	public void myPageMenu() {
		System.out.println("*******�ۻ���ȸ********");
		System.out.print("�۹�ȣ:");
		String boardNo = key.next();
		

	}

	
}