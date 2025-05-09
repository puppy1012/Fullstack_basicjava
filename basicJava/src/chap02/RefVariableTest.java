package chap02;

import java.util.Random;

//���������� ���� ����
public class RefVariableTest {
	public static void main(String[] args) {
		//�⺻��
		int i=100;
		int size=0;
		System.out.println("���ڿ��� ����=>"+size);
		String a= "hello";
		String b= a;
		System.out.println(b);
		
//		String str = new String();
//		str.length();
		/*
		 * ���ڿ��� ó���ϴ� ����� ����ϱ� ���ؼ� String Ŭ������ jvm�� �ν��ϴ� �۾������� �Ҵ�
		 * 										   ---------------
		 * 											jvm�� ã�Ƽ� ����� �� �ֵ���
		 * 											�̸� ��ӵ� ����(heap)
		 * 
		 * [�⺻��]
		 * ������Ÿ�� ������ =��;
		 * 
		 * [������]
		 * Ŭ������ ����=new Ŭ������()
		 * 
		 * heap�� �Ҵ�� heap�� �Ҵ��ؼ� ����ϰ� ���� Ŭ������
		 * � Ŭ������
		 * ����� ������
		 * Ÿ���� ����
		 */
		//str������ heap�� �Ҵ�� StringŬ������ ����� ���ֵ��� �����ϴ� ����
		String str = new String("�ڹ�");
		str.length();
		//string�� ���ǵǾ� �ִ� length��� �޼ҵ带 ȣ��
		//length�޼ҵ��� �������� in���� ���̹Ƿ� ���� Ÿ���� ������ �����ؼ� ����� ����
		//����� �������������� �޼ҵ�������� ����Ҽ�����.
		int length=str.length();
		System.out.println("���ڿ��� ����=>"+length);
		
		//objectŬ������ ��� -java.lang��Ű��
		Object obj= new Object();
		
		//ThreadŬ������ ��� -java.lang��Ű��
		Thread t= new Thread();
		
		//RandomŬ������ ��� -java.utill��Ű��
		//jvm�� �⺻���� �ν��ϴ� ��Ű���� ��ġ�� ���� �۾���Ű��(chap02)�� java.lang��Ű����
		//�⺻���� �ν��ϴ� ��Ű�� �̿��� ��Ű���� jvm�� �ν��� �� �ֵ��� ó���ؾ��Ѵ�.
		//import��ɹ����� ��Ű���� ����
		/*
		 * package����
		 * import ��Ű����
		 * Ŭ���� ����
		 */
		
		Random rand = new Random();
		
		
		
		
		//���� ����
		int[] original= {1,2,3,4,5};
		int[] shallowcopy=original;
		shallowcopy[0]=100;
		System.out.println("original 0="+original[0]);
		System.out.println("shallowcopy 0="+shallowcopy[0]);
		//���� ����
		int[] original2 = {1, 2, 3};
		int[] deepCopy = new int[original2.length];

		for (int ii = 0; i < original2.length; ii++) {
		    deepCopy[ii] = original2[ii];
		}

		deepCopy[0] = 100;
		System.out.println("original 0="+original2[0]); // 1
		System.out.println("deepcopy 0="+deepCopy[0]);

	}
}
