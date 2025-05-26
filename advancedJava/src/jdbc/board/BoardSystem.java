package jdbc.board;

import java.util.Scanner;
public class BoardSystem {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("******게시글********");
		System.out.println("1. 게시글등록");
		System.out.println("2. 게시글목록조회");
		System.out.println("3. 게시글조회");
		System.out.println("4. 게시글수정");

		System.out.print("원하는 작업을 선택하세요:");
		int choice  = key.nextInt();
		show(choice);
	}
	public static void show(int choice){
		MenuController ui = new MenuController();
		switch(choice){
			case 1:
				ui.insertMenu();
				break;
			case 2:
				ui.selectMenu();
				break;
			case 3:
				ui.updateMenu();
				break;
			case 4:
				ui.deleteMenu();
				break;
			
			case 7:
				ui.myPageMenu();
				break;
		}
	}
}



