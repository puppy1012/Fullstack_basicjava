package jdbc.board;

import java.util.Scanner;
public class BoardSystem {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("******�Խñ�********");
		System.out.println("1. �Խñ۵��");
		System.out.println("2. �Խñ۸����ȸ");
		System.out.println("3. �Խñ���ȸ");
		System.out.println("4. �Խñۼ���");

		System.out.print("���ϴ� �۾��� �����ϼ���:");
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



