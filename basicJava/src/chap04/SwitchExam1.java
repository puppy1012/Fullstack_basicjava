package chap04;

import java.util.Scanner;

public class SwitchExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		System.out.print("주민번호입력:");
		// String타입 처리
		String num= key.nextLine();
		char gender=num.charAt(6);
		switch(gender) {
			case '1','3':
				System.out.println("남자");
				break;
			case '2','4' :
				System.out.println("여자");
				break;
			default:
				System.out.println("기타");
	
		}

	}

}
