package chap04;

import java.util.Random;

//��øif
//if�� ���ο� if���� ��ø�ؼ� ���
//num�� -10���� 120���� �������� �߻����� �����ϱ�
//90���� ũ�ų� ������ pass���
//90���� ������ fail���
//��,num�� 0���� �۰ų� 100���� ū ���� �Է� ������ "�߸��Է¸޽����� ����ϱ�
//	num�� 0���� ũ�ų� ���� 100���� �۰ų� ���� ��쿡�� pass/fail���ϱ�
public class IfTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand= new Random();
		int num=rand.nextInt(-10, 121);
		System.out.println(num);
		if(num<0 |num>100) {
			System.out.println("�߸��Է�");

		}else {
			if(num>=90) {
				System.out.println("pass");
			}else {
				System.out.println("fail");
			}
		}
		System.out.println("===============================================");
		if(num>=0&&num<100) {
			if(num>=90) {
				System.out.println("pass");
			}else {
				System.out.println("fail");
			}
		}else {
			System.out.println("�߸��Է�");
		}
	}

}
