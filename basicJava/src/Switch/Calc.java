package Switch;

import java.util.Scanner;

//public class Calc {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("*******�̴ϰ���*******");
//		System.out.println("1.���ϱ�\n2.���ϱ�\n3.����\n4.������");
//		Scanner key = new Scanner(System.in);
//		System.out.print("�����ڸ� �����ϼ���.");
//		int type=key.nextInt();
//		key.nextLine();
//		System.out.print("���ڸ� �Է��ϼ���");
//		String number=key.nextLine();
//		String[] split_number=number.split(" ");
//		//���ڰ� �ΰ��� ���´ٴ� ����
//		double answer=0;
//		int first_one= Integer.parseInt(split_number[0]);
//		int second_one= Integer.parseInt(split_number[1]);
//		if(type==1) {
//			answer=first_one+second_one;
//		}else if(type==2) {
//			answer=first_one*second_one;
//		}else if(type==3) {
//			answer=first_one-second_one;
//		}else if(type==4) {
//			answer=(double)first_one/second_one;
//		}else {
//			System.out.println("�߸��ȿ������Դϴ�");
//			return;
//		}
//		
//		System.out.println("�����=>"+answer);
//	}
//}
public class Calc {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("***********�̴ϰ���***********");
		System.out.println("1.���ϱ�");
		System.out.println("2.���ϱ�");
		System.out.println("3.����");
		System.out.println("4.������");
		System.out.print("�����ڸ� �����ϼ���.");
		int opr = key.nextInt();
		
		if(opr>=1 & opr<=4) {
			System.out.print("���ڸ� �Է��ϼ���");
			int num1 = key.nextInt();
			int num2 = key.nextInt();
			//�������� ������ ���� �����ϱ�
			//�޼ҵ带 ȣ���ؼ� ����ϱ�
			int result = MyMethodDemo.Calc(opr, num1, num2);
			
			
			System.out.println("�����=>"+result);
		}else {
			System.out.println("�����ڸ� �߸� �����߽��ϴ�.");
		}
	}
}