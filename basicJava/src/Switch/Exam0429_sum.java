package Switch;

import java.util.Scanner;

public class Exam0429_sum {
	//�ڹ�_��������� 4��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("[��°�]\n���� ������ �Է��ϼ��� :");
		int num=scan.nextInt();
		int num_count=0;
		int num_total=0;
		for(int i=1;i<=1000;i++) {
			if(i%num==0) {
				num_count+=1;
				num_total+=i;
			}
		}
		System.out.println("7�� ��� ���� ="+num_count);
		System.out.println("7�� ��� �� ="+num_total);
		
	}

}
