package oop.basic.chap05;
//�޼ҵ带 �������� ����
public class MyMethod {
	//1.�Ű������� ���� ���ϰ��� ���� �޼ҵ�
	public  void display() {
		for(int i=0;i<=10;i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("----------------------");
	}
	//2. ���ϰ��� ���� �Ű������� 1���� �޼ҵ�
	public void display(String str) {
		for(int i=0;i<=10;i++) {
			System.out.print(str);
		}
		System.out.println();
		System.out.println("----------------------");
	}
	//3. ���ϰ��� ���� �ŰԺ����� 2���� �޼ҵ�
	//=> ����� ��ȣ�� ����� Ƚ���� �Ű������� ���޹޾Ƽ� ����� �� �ֵ��� �޼ҵ带 ����
	public void display(String str,int number) {
		for(int i=0;i<number;i++) {
			System.out.print(str);
		}
		System.out.println();
		System.out.println("------------------------");
	}
	//4��.�Ű�����,���ϰ��� ��� �ִ� �޼ҵ�
	//=> ����2��(����)�� �Ű������� ���� �޾Ƽ� ���� �� ����� �����ϴ¸޼ҵ�
	//=>�޼ҵ� ����ο� ����Ÿ������ ���ǵǴ� Ÿ�԰� ������ ������ Ÿ���� ��
	//	Ȥ�� ���� ����� ������ �����ؾ��Ѵ�.
	//=>�����ϴ� ���� ������ �Ѱ��� ������ �� �ִ�.
	//=>������ �޼ҵ��� ������ ��ɹ����� returnŰ����� �Բ� �����Ѵ�.
	//	�����ϴ� ���� ������ �Ѱ��� ������ �� �ִ�.
	public int add(int num1,int num2) {
		int result=0;
		result=num1+num2;
		return result;
		
	}
}
