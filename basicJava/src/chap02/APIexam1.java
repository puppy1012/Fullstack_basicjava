package chap02;

import java.util.Random;

//api ���� �����Ǵ� Ŭ������ ����ϱ�
public class APIexam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("���α׷� ����");
//		int i=100;
//		System.out.println("�⺻������=>"+i);
//		Random rand1=new Random();
//		Random rand2=new Random();
//		System.out.println("����������=>"+rand1);
//		System.out.println("����������=>"+rand2);
		/*
		 * [API�� ����ϴ� ���]
		 * java programming�̶�� ���ڿ��� �̿��ؼ� String��ü�� ����
		 * charAT�̶�� �޼ҵ带 ȣ���ؼ� ����� ����ϱ�
		 * charAT�� �ŰԺ����� 5�� ����
		 * 
		 * 1.StringŬ������ ����� ����ϱ����ؼ� StringŬ������ heap�� �Ҵ�
		 * 2.�Ҵ�� String��ü�� �޼ҵ带 ����ϱ����ؼ� .�����ڸ� �̿��ؼ� heap�� �Ҵ�� 
		 * 	string ��ü�� ����� �����ؼ� ���(�޼ҵ��� ȣ��)
		 * 3.�޼ҵ� ������(���ϰ�)�� ������ ����� ���� Ÿ���� ������ �����ؼ�
		 * 	�޼ҵ��� �������� ����
		 * 4. �޼ҵ��� �ŰԺ����� API�������� Ȯ���ϱ�
		 * 5. ����� sysout���� ����ϱ�
		 * �������
		 * 5����ġ�� ���ڿ�=>_____
		 */
		int point=5;
		String original= new String("java programming");
		char result = original.charAt(point);
		System.out.println(point+"��°��ġ�� ����=>"+result);
		
	}

}
