package oop.basic.chap05;

public class PersonTest2 {
	public static void main(String[] args) {
		Person2 obj= new Person2("RM","����ó����",28);
//		obj.setName("RM");
//		obj.setAddr("����� �����");
//		obj.setAge(28);
		System.out.println(obj.getName());
		System.out.println(obj.getAddr());
		System.out.println(obj.getAge());
		obj.display();
	}
}
