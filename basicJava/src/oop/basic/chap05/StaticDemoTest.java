package oop.basic.chap05;
//static�� �߰��� Ŭ���������� �ν��Ͻ������� �� ��ȭ
public class StaticDemoTest {
	public static void main(String[] args) {
		StaticDemo obj1= new StaticDemo();
		System.out.println(obj1);
		obj1.display();
		//��ü�ܺο��� ��ü�� �ν��Ͻ������� Ŭ���������� �����ϴ� ����� �ٸ���.
		//=>	�ν��Ͻ������� ��ü(�ν��Ͻ�)�� �����̹Ƿ� ��ü�� �����ϴ� ������ �� ������
		//=>	static������ Ư�� �ν��Ͻ��� ������ �ƴ϶� Ŭ����������(Ŭ������ ��Ÿ������) �ö���°��� �Ҵ�Ǵ� ������
		//		��� �ν��Ͻ��� �����ؼ� ����ϴ� �����̹Ƿ� � ��ü�� ������ �ƴϴ�.
		//��
		System.out.println("�ν��Ͻ�����=>"+obj1.num+",Ŭ��������=>"+StaticDemo.staticNum);
		
		StaticDemo obj2= new StaticDemo();
		System.out.println(obj2);
		obj2.display();
		
		System.out.println("�ν��Ͻ�����=>"+obj2.num+",Ŭ��������=>"+StaticDemo.staticNum);
		
		StaticDemo obj3= new StaticDemo();
		System.out.println(obj3);
		obj3.display();
		System.out.println("�ν��Ͻ�����=>"+obj3.num+",Ŭ��������=>"+StaticDemo.staticNum);
		
		System.out.println("----------------------------------------");
		obj3.num=10000;
		StaticDemo.staticNum=1500;
		obj1.display();
		obj2.display();
		obj3.display();
	}
}
