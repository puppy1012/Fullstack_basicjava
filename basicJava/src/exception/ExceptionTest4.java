package exception;

import java.util.Scanner;

public class ExceptionTest4 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int i=1;
//		try {
//			while(i<=5) {
//				System.out.println("i="+i);
//				System.out.println("���� ���� �Է�:");
//				int num= key.nextInt();
//				System.out.println("�����=>"+(i/num));
//				i++;
//			}
//		}catch(ArithmeticException e) {
//			System.out.println("��꿡 ������ �߻��߽��ϴ�.~~~~~~~~");
//		}
		while(i<=5) {
			System.out.println("i="+i);
			System.out.println("���� ���� �Է�:");
			int num= key.nextInt();
			try {
				System.out.println("�����=>"+(i/num));
			}catch(ArithmeticException e) {
				System.out.println("��꿡 ������ �߻��߽��ϴ�.");
			}
			i++;
		}
	}
}
