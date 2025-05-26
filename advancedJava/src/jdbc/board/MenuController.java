package jdbc.board;
import java.util.List;
import java.util.Scanner;

public class MenuController {
	Scanner key = new Scanner(System.in);
	BoardDAOImpl dao = new BoardDAOImpl();
	public void insertMenu(){
		System.out.println("*******게시글등록********");
		System.out.print("글번호:");
		int boardNo = Integer.parseInt(key.nextLine());
		System.out.print("제목:");
		String title = key.nextLine();
		System.out.print("글쓴이:");
		String writer = key.nextLine();
		System.out.print("내용:");
		String content = key.nextLine();
		BoardDTO board= new BoardDTO(boardNo,0,title,writer,content);
		int result=dao.insert(board);
		if(result>0) {
			System.out.println("========");
			System.out.println(result+"개 등록 성공");
			System.out.println("========");
		}else {
			System.out.println("========");
			System.out.println(result+"개 등록 실패");
			System.out.println("========");
		}
		
	}
	public void updateMenu(){
		System.out.println("*******게시글수정********");
		System.out.print("글번호:");
		String boardNo = key.next();
		System.out.print("제목:");
		String title = key.next();
		System.out.print("내용:");
		String content = key.next();
		
	
	}
	public void deleteMenu(){
		System.out.println("*******게시글삭제********");
		System.out.print("삭제할글번호:");
		String boardNo = key.next();
	    
	}
	public void findByTitleMenu(){
		System.out.println("*******게시글검색********");
		System.out.print("제목:");
		String title = key.next();
		
	}
	
	public void selectMenu(){
		System.out.println("*******전체글조회********");
		
		
	}
	public void myPageMenu() {
		System.out.println("*******글상세조회********");
		System.out.print("글번호:");
		String boardNo = key.next();
		

	}

	
}