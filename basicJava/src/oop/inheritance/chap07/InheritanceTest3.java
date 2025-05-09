package oop.inheritance.chap07;
/*
 * <<��Ӱ��迡�� �����ڰ� ���� Ư¡>>
 * 1. �ڹٷ� ��������� ��� Ŭ������ �ֻ��� Ŭ������ java.lang.ObjectŬ�����̴�
 * => �ڹٿ����� ��ü�� �����ִ� ������ Ư������ java.lang.ObjectŬ������ �����س��� ����ϴ� Ŭ������ ����
 * 	  ���� ��� �����Ϸ��� ���ؼ� �ڵ����� ��ӹ޵��� �ϰ� �ִ�.
 * 2.�����ڰ� ��������� ������ ȣ�⹮�� ���������ʴ� ��� ��� �������� ù��° ���忡�� �θ��� �⺻�����ڸ� ȣ���ϴ�
 * ��ɹ��� �����Ǿ��ֵ�.
 * 	=>����Ŭ������ ���ǵ� ����� ����Ŭ�������� ����� �� �ֵ��� �Ϸ��� ����Ŭ������ �޸𸮿� �Ҵ�Ǿ���Ѵ�.
 * 	=>super()�� �����Ϸ��� �߰��� �־� �ڵ����� �θ�ü�� �����ϵ��� �⺻���� ����
 * 3. ���� �ڹٿ��� ����Ŭ������ �̿��ؼ� ��ü������ �����ʰ� ����Ŭ������ ��ü�� �����ؼ� ����ϴ°��� �Ϲ����̴�.
 * 	=>����Ŭ������ �Ϲ����� ������ ��� �ִ� Ŭ������ �ϼ����� �ʴ� �����ϼ� �����Ƿ� ���� ���� ���ϴ� ��찡 �Ϲ���
 * 	=>���� ����Ŭ������ �����Ҷ� ����Ŭ������ �����ִ� ��� �ʵ��� ���� �����ؼ� �����ؾ��Ѵ�.
 * 	=> ����Ŭ���� ������ ���ο��� �θ�ü�� �����ɶ� �ʿ��� �θ��� ����ʵ尡 ���õǵ��� ó���Ѵ�.
 * 
 * 	super(�Ű�����1,�Ű�����2,...)
 */

class SuperA extends Object{
	String name;
	int age;
//	SuperA(){
//		super();

//	}
	public SuperA() {
		
	}
	public SuperA(String name,int age) {
		super();
		this.name=name;
		this.age=age;
//		System.out.println("�θ�Ŭ������ ������");
	}
}
class SubA extends SuperA{
	String subdata;
	public SubA() {}
	public SubA(String name,int age,String subdata) {
		super(name,age);
		this.subdata=subdata;
		
	}
//
//	SubA(){
//		super();
//		System.out.println("�ڽ�Ŭ������ ������");
//	}
}
public class InheritanceTest3 {
	public static void main(String[] args) {
		SubA obj=new SubA("����",30,"������");
		System.out.println("����:"+obj.name+"����:"+obj.age+"����:"+obj.subdata);
	}
}
