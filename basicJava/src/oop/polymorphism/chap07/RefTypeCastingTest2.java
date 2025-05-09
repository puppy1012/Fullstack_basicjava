package oop.polymorphism.chap07;
class Super{
	String data="����Ŭ����";
	public void display() {
		System.out.println("super�� display");
	}
}
class Sub extends Super{
	String data="����Ŭ����";
	public void display() {
		System.out.println("sub�� display");
	}
	public void test() {
		System.out.println("sub�� test");
	}
}
public class RefTypeCastingTest2 {
	public static void main(String[] args) {
		System.out.println("1. SuperŸ���� ���������� Super��ü�� ���");
		Super obj1= new Super();
		obj1.display();
		System.out.println(obj1.data);
		System.out.println("***********************");
		System.out.println("2. SubŸ���� ���������� Sub��ü�� ���");
		Sub obj2= new Sub();
		obj2.display();
		System.out.println(obj2.data);
		System.out.println("***********************");
		System.out.println("3. SuperŸ���� ���������� Sub��ü�� ���");
		Super obj3= new Sub();
		obj3.display();
		System.out.println(obj3.data);
		System.out.println("***********************");
		
		//obj3�� SuperŸ���� �������������� ���� �����ϰ��ִ� ������ ��ü�� Sub��ü�̹Ƿ� obj�� ���갴ü����������
		//��ȯ�� �����ϴ�.-�ٿ�ĳ����
		((Sub)obj3).test();
		
		//Super�� Sub�� �ƴϹǷ� ��ȯ�� �� ����.
		//Super�� ���� ��ȯ�Ϸ��� �ϴ� Sub�� ���� �� ���� ������ �����Ƿ� �Ϻ��ϰ� ��ȯ�� �� ����.
		
		System.out.println("4. SubŸ���� ���������� Super��ü�� ���");
		
		System.out.println("***********************");
		
		System.out.println("5. Sub ���� = Super��ü�� �����ϴ� ����");
		//��������� ĳ���ý� �����Ϸ��� ���� �� �ִ�.
		//obj1�� �����ϴ� ��ü�� Super�̹Ƿ� Sub������ ��� �����Ҷ� ĳ������ �� �� ���� ������ �߻��Ѵ�.
//		Sub obj5=(Sub)obj1;
		System.out.println("6. Sub ���� =Sub��ü�� �����ϴ� Super����");
		Sub obj6=(Sub)obj3;
		System.out.println();
	}
}
