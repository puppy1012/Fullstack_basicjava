package Switch;

import java.util.Scanner;

public class Exam0429 {
	//�ڹ�_��������� 1��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("2~100������ ������ �Է��ϼ���. :");
		int num=scan.nextInt();
		if(num>=2&num<=100) {
			boolean result=true;
			for(int i=2;i<num;i++) {
				//�Ҽ��� i�� ���������� �Ҽ��� �ƴϴ�
				if(num%i ==0) {
					result=false;
					break;
				}
			}
			//���׿���ó��
			System.out.println(num+(result ? "��(��)�Ҽ��Դϴ�." : "��(��)�Ҽ��� �ƴմϴ�."));
		}else {
			System.out.println("�߸��� �����Է�");
		}
	}
}