package chap03;

import java.util.Random;
import java.util.Scanner;

public class IfExam01 {

	public static void main(String[] args) {
/*		TODO Auto-generated method stub
		Random rand= new Random();
		int num= rand.nextInt(100)+1;
		System.out.println(num);
		if(num%5==0) {
			System.out.println("�Է��Ѽ��ڴ� 5�� ����Դϴ�");
		}
		else {
			System.out.println("�Է��� ���ڴ� 5�� ����� �ƴմϴ�");
		}
*/	
		Scanner key = new Scanner(System.in);
		System.out.println("�����Է�:");
		int intVal=key.nextInt();
		
		if(intVal%5==0) {
			System.out.println("�Է��Ѽ��ڴ� 5�� ����Դϴ�");
		}
		else {
			System.out.println("�Է��� ���ڴ� 5�� ����� �ƴմϴ�");
		}
	}

}
