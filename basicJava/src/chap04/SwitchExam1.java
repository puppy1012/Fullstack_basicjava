package chap04;

import java.util.Scanner;

public class SwitchExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�Է�:");
		// StringŸ�� ó��
		String num= key.nextLine();
		char gender=num.charAt(6);
		switch(gender) {
			case '1','3':
				System.out.println("����");
				break;
			case '2','4' :
				System.out.println("����");
				break;
			default:
				System.out.println("��Ÿ");
	
		}

	}

}
