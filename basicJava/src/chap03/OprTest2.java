package chap03;
//��������,�񱳿�����
public class OprTest2 {
	//�񱳿�����= true/false�� ��ȯ�ϴ� ������
	public static void main(String[] args) {
		int num1=100;
		int num2=200;
		int num3=300;
		System.out.println("num1==num2 : "+(num1==num2));
		System.out.println("num1>=num2 : "+(num1>=num2));
		System.out.println("num1<=num2 : "+(num1<=num2));
		System.out.println("num1!=num2 : "+(num1!=num2));
		
		//������������ �ʱⰪ�� �ٶ� ���
		String str=null;
		//&&����
		System.out.println(num1<100&&(str.length()>10));
//		System.out.println(num1<100 &(str.length()>10));
		
		//||����� |������ ������ ����(or����)
		System.out.println(num1>=100|| str.length()>10);
		System.out.println(num1>=100|| str.length()>10);
		
		
		
	}

	
}
