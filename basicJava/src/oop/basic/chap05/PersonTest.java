package oop.basic.chap05;

public class PersonTest {
	public static void main(String[] args) {
		Person p1= new Person();
		System.out.println("����:"+p1.name);
		System.out.println("�ּ�:"+p1.addr);
		System.out.println("����:"+p1.age);
		System.out.println("����Ʈ:"+p1.point);
		System.out.println("==============");
		p1.name="��";
		p1.addr="����";
		p1.age=30;
		p1.point=10000;
		System.out.println("����:"+p1.name);
		System.out.println("�ּ�:"+p1.addr);
		System.out.println("����:"+p1.age);
		System.out.println("����Ʈ:"+p1.point);
		
		System.out.println("===================");
		Person p2=new Person();
		p2.name="����ȩ";
		p2.addr="����";
		p2.age=28;
		p2.point=10000;
		System.out.println("����:"+p2.name);
		System.out.println("�ּ�:"+p2.addr);
		System.out.println("����:"+p2.age);
		System.out.println("����Ʈ:"+p2.point);
	}
}
