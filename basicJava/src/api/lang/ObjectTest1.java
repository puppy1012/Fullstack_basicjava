package api.lang;

import java.util.ArrayList;

public class ObjectTest1 {
	public static void main(String[] args) {
		Person p1 = new Person("BTS","����",901112);
		Person p2 = new Person("BTS","����",901112);
		test(p1);
		test(p2);
		/*
		 * 1.toString()
		 * =>��ü�� �Ҵ�Ǵ� �Ĥ����� �ּ�
		 * 			------------
		 * 			��ü�� ���� �ִ� �Ӽ���� �޸��ּҸ� ������� ��ȯ�� ������ ���
		 * => Object Ŭ������ ���� �ִ� �޼ҵ� �� �⺻ �޼ҵ�(�⺻�޼ҵ��̹Ƿ� ������ ����)
		 * 
		 */
		System.out.println("----------------------------");
		Object obj1=new Object();
		Object obj2=new Object();
		System.out.println(obj1);
		System.out.println(obj1.toString());
		System.out.println(obj2);
		System.out.println(obj2.toString());
	    System.out.println("-------------------------------");
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("sql");
        list.add("linux");
        list.add("jdbc");
        System.out.println(list);
	}
	public static void test(Person p) {
		System.out.println(p);
		//�Է°��� ����
		
	}
}
