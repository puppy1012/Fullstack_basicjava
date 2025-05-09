package oop.basic.chap05;

public class PersonTest2 {
	public static void main(String[] args) {
		Person2 obj= new Person2("RM","서울시노원구",28);
//		obj.setName("RM");
//		obj.setAddr("서울시 노원구");
//		obj.setAge(28);
		System.out.println(obj.getName());
		System.out.println(obj.getAddr());
		System.out.println(obj.getAge());
		obj.display();
	}
}
