package oop.basic.chap05.constructor;

public class ConstructorTest {
	public static void main(String[] args) {
		Constructor obj= new Constructor();
		System.out.println(obj);
		Constructor obj2= new Constructor();
		System.out.println(obj2);
		
		Constructor obj3= new Constructor("��","bts1","1234");
		System.out.println("����:"+obj3.getName()+",id:"+obj3.getId());
		System.out.println("------------------------------------------------------");
		Constructor obj4= new Constructor("��","bts1","1234","����","010","2001","��",20000);
		System.out.println("����:"+obj4.getName()+",id:"+obj3.getId());
	}
}
