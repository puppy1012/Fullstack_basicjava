package Switch;

import java.util.Scanner;

public class Exam0429_GuGu {
	//�ڹ�_��������� 2��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("1����ũ�� 20���� ���� ������ �Է��ϼ���.:");
		int num=scan.nextInt();
		if(num>1&num<20) {
			for(int i=1;i<10;i++) {
				System.out.println((num+2)+" * "+i+" = "+(num+2)*i);
			}
		}else {
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
		}
	}

}
