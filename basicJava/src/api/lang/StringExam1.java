package api.lang;

import java.util.Scanner;

public class StringExam1 {
	public static void main(String[] args) {
		Scanner key= new Scanner(System.in);
		System.out.println("���ڿ��Է�:");
		//next�޼ҵ�� spacebar�� enter�� �������������� ���ڿ��� �о ����
		//������ü�� �а� ���� ���
//		String data=key.next();
		String data=key.nextLine();

		//�̼�
		//�Է¹��� ���ڿ��� �빮�ڷ� �����Ͽ� �Ųٷ� ����϶�
		data=data.toUpperCase();
		String reverse="";
		for(int i= data.length()-1;i>=0;i--) {
			reverse+=data.charAt(i);
		}
		System.out.println(reverse);
	}
}
