package chap03;

import java.util.Random;

//1���� 100���� �������� �߻����Ѽ� ���ڸ� num������ �����ϱ�
//num������ ���� 90���� ũ�� "�׽�Ʈ�۾��Ϸ� �޽����� ����ϱ�
public class IfTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int num=rand.nextInt(100)+1;
		System.out.println("num=>"+num);
		if(num>90) {
			System.out.println("�׽�Ʈ�۾��Ϸ�");
			System.out.println("ó��������");
		}
		System.out.println("�۾�����");
	}

}
