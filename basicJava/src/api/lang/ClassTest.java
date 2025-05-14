package api.lang;

import java.lang.reflect.*;


public class ClassTest {
	String addr;
	String name;
	int age;
	public void test() {
		
	}
	public void run() {
		
	}
	public static void main(String[] args) {
		ClassTest obj= new ClassTest();
		Class myclass = obj.getClass();
		System.out.println(myclass.getName());
		System.out.println(myclass.getPackageName());
		Field[] farr=myclass.getFields();
		Method[] marr = myclass.getMethods();
		for(Field f: farr) {
			System.out.println(f.getName());
		}
		System.out.println("=========================");
		for(Method m:marr) {
			System.out.println(m.getName());
		}
	}
}
