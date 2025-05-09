package oop.inheritance.chap07;
/*
 * <<��Ӱ��迡�� ��������� ���� Ư¡>>
 * 1.��Ӱ��迡�� ����Ŭ������ ����� ��������� ����Ŭ�������� ������ �����ϴ�.
 * 2.����Ŭ����Ÿ���� ���������� �̿��ؼ� ����Ŭ������ ����� ��������� ������ �� �� �ֵ�.
 * 3.����Ŭ�������� ����� ���������� ������ �̸��� ��������� ����Ŭ�������� �����ϸ� ����Ŭ���� ���ο�����
 * 	�θ�Ŭ������ ��������� �ƴ϶� ����Ŭ������ ��������� �νĵȴ�.
 * 		[��ü���� �� ���]
 * 		-	��������� ����� Ŭ����Ÿ�Կ� ���� ����(�����Ͻ����� ����)
 * 		-	�޼ҵ�� ��������� ������ �����ϴ� ��ü�� Ÿ�Կ� ���� ����(�������ε�)
 * 4. ����Ŭ�������� ����Ŭ���� ����� �����ϰ� ���� ��� superŰ���带 �̿��ؼ� ����
 * 		this ->���� �۾����� �ڱ��ڽ��� ��ü�� Ī��
 * 		super->�θ�ü
 * 5. ����Ŭ������ ����� private���� ���ǵǾ������� ����Ŭ�������� �������� �� ����.
 * 	  (��ӵ����ʴ´�.)
 */
class Super {//����Ŭ����
	int num=100;
	String data="������";
}
class Sub extends Super {//����Ŭ����
	int num=10000;
	public void display() {
		System.out.println("---------------------------------------");
		System.out.println("num=>"+num);
		System.out.println("this�� num=>"+this.num);
		System.out.println("super�� num=>"+super.num);
		System.out.println("data=>"+data);
		System.out.println("super.data=>"+super.data);
		System.out.println("---------------------------------------");

	}
	
}
public class InheritanceTest1 {
	public static void main(String[] args) {
		Sub obj= new Sub();
		obj.display();
		System.out.println(obj.num);
	}
}
