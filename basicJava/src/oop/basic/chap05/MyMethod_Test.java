package oop.basic.chap05;
//MyMethodŬ�������� ���ǵ� �޼ҵ带 ���
//=> �޼ҵ� ȣ��
public class MyMethod_Test {
	public static void main(String[] args) {
		MyMethod obj= new MyMethod();
		System.out.println("���α׷�����");
		System.out.println("step1");
		obj.display();
		obj.display();
		System.out.println("step2");

		obj.display("*");
		obj.display("#");
		obj.display("*");
		System.out.println("step3");
		obj.display("backend_10 ", 20);
		
		
		
		
		//4��.�Ű�����,���ϰ��� ��� �ִ� �޼ҵ�
		//	1)���ϰ��� �ִ� �޼ҵ带 ȣ���ϴ� ��� ����Ÿ�԰� ������ Ÿ���� ������ �����ؼ� ���ϰ��� �����Ѵ�.
		int result=obj.add(1000, 2000);
		System.out.println(result);
		
		//	2)�޼ҵ��� ȣ������ �ٸ� �޼ҵ��� �Űܺ����� �����ϰų�, �ٷ� ȣ���ؼ� �۾��� �����ϴ�.
		//	=>void�޼ҵ�� �ٸ��޼ҵ��� �ŰԺ����� ����� �� ����.
		System.out.println("�����=>"+obj.add(3000, 4000));
		if(obj.add(3000, 4000)>3000) {
			System.out.println("���");
		}else {
			System.out.println("�ٽ��۾�");
		}
		
		
		
		
//		MyMethod.Star();
	}
}
