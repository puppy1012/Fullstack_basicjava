package chap03;

import java.util.Scanner;

public class Ifexam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		System.out.print("�����Է�:");
		int num=key.nextInt();
		if(num>=0) {
			if(num%5==0) {
				System.out.print("�Է��Ѽ��ڴ� 5�� ����Դϴ�");
			}
			else {
				System.out.print("�Է��� ���ڴ� 5�� ����� �ƴմϴ�");
			}
		}

	}

}
