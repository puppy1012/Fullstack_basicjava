package chap04;

import java.util.Scanner;

//�ֹι�ȣ�� 7��° ���� �Է¹޾� �������
/*
 * [�������]
 * 1,3�� �Է��ϴ°��
 * �ֹι�ȣ�Է�:_____
 * ����
 * 
 * 2,4�� �Է��ϴ� ���
 * �ֹι�ȣ�Է�:____
 * ����
 * 
 * �̿��� ���� �Է��ϴ°��
 * �ֹι�ȣ�Է�:___
 * ��Ÿ
 */
public class MultiExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�Է�:");
		/* StringŸ�� ó��
		String num= key.nextLine();
		char gender=num.charAt(6);
		if(gender=='1'||gender=='3') {
			System.out.println("����");
		}else if(gender=='2'|| gender=='4') {
			System.out.println("����");
		}else {
			System.out.println("��Ÿ");
		}
		*/
		/* long���� 9810121974567 �Է½� ó��
		long num= key.nextLong();
		long gender=(num/1000000)%10; //������ ������ ���� 1�� �ڸ����ڸ� ����
		System.out.println(gender);
		if(gender==1||gender==3) {
			System.out.println("����");
		}else if(gender==2|| gender==4) {
			System.out.println("����");
		}else {
			System.out.println("��Ÿ");
		}
		*/
	}

}
