package oop.basic.chap05;

public class StaticMethodDemo {
	public StaticMethodDemo() {
		System.out.println("StaticMethodDemo ����");
	}
	public static void print(){//����
		System.out.println("+++++++++print++++++++");
		display();
	}
	public static void display(){//�����޼ҵ�
		System.out.println("+++++++++display++++++++");
		StaticMethodDemo obj= new StaticMethodDemo();
		obj.test();
	}
	public void test(){//�ν��Ͻ��޼ҵ�
		System.out.println("+++++++++test++++++++");
	}
	public static void show(){//�����޼ҵ�
		System.out.println("+++++++++show++++++++");
	}
	public void change(){//�ν��Ͻ��޼ҵ�
		System.out.println("+++++++++change++++++++");
		//2.non-static �޼ҵ忡�� non-static�޼ҵ带 ȣ���ϴ� �����
		//=>�Ϲ����� ������� �޼ҵ� ȣ��
		this.test();
		show();
	}
}
