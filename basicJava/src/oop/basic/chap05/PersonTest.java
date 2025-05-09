package oop.basic.chap05;

public class PersonTest {
	public static void main(String[] args) {
		Person p1= new Person();
		System.out.println("성명:"+p1.name);
		System.out.println("주소:"+p1.addr);
		System.out.println("나이:"+p1.age);
		System.out.println("포인트:"+p1.point);
		System.out.println("==============");
		p1.name="진";
		p1.addr="서울";
		p1.age=30;
		p1.point=10000;
		System.out.println("성명:"+p1.name);
		System.out.println("주소:"+p1.addr);
		System.out.println("나이:"+p1.age);
		System.out.println("포인트:"+p1.point);
		
		System.out.println("===================");
		Person p2=new Person();
		p2.name="제이홉";
		p2.addr="광주";
		p2.age=28;
		p2.point=10000;
		System.out.println("성명:"+p2.name);
		System.out.println("주소:"+p2.addr);
		System.out.println("나이:"+p2.age);
		System.out.println("포인트:"+p2.point);
	}
}
