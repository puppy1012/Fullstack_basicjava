package oop.polymorphism.chap07;
/*
 * �߻�Ŭ����
 * => �̿ϼ��� Ŭ������ ��ü�� ������ �� ���� Ŭ����
 * 		������ �����Ǿ� ���� ���� �޼ҵ带 �����ϰ� �ִ� Ŭ������ �߻�Ŭ������ �Ѵ�.
 * 		-------------------------
 * 		�߻�޼ҵ�(body�� ���� �޼ҵ�)
 * 	1) �߻�޼ҵ带 �����ϴ� ���
 * 		���������� abstract ����Ÿ�� �޼ҵ��(�ŰԺ���1,�ŰԺ���2.....);
 * 	2) �߻�Ŭ������ Ư¡
 * 		-�߻�޼ҵ尡 �ϳ��� ���ǵǾ������� �߻�Ŭ������ �ȴ�.
 * 		-�߻�Ŭ������ �ݵ�� Ŭ���� ����ο� abstract�� �߰��ؾ��Ѵ�.
 * 		-�߻�Ŭ�������� �߻�޼ҵ�� �Ϲݸ޼ҵ带 ������ �� �ִ�.
 * 		-�߻�Ŭ������ ��� �޴� Ŭ������ extends�ϸ� ���������� �߻�
 * 		=> SubA�� SuperA�� ����ϸ� SuperA�� ��� ����� SubA�� ������ �ȴ�.
 * 			�Ϲݸ޼ҵ嵵 ��ӹ����� �߻�޼ҵ嵵 ��ӹ����鼭 �߻�޼ҵ��� dsplay�� ��ӵȴ�.
 * 			���� SubA�� �߻�Ŭ������ �ȴ�.
 * 
 * 		[���������ذ���]
 * 		- SubA�� �����ϴ� ����ο� abstract�� �߰�
 * 		- SubA�� ��ӹ޴� �߻�޼ҵ带 �����ؼ� ������ �����Ѵ�.
 * 		             -------------
 * 						�������̵�
 * 		
 */		
abstract class SuperA{
	public void test() {
		System.out.println("test");
	}
	public abstract void display(String data);
}
class SubA extends SuperA{
	//������̼�
	//�����Ϸ����� ������ �˷��ش�.
	//@Override �� �����Ϸ����� �̸޼ҵ�� �������̵��� �޼ҵ��°��� �˷��ִ� ��ȣ
	@Override
	public void display(String data) {
		System.out.println("�θ𿡰� ��ӹ��� �߻�޼ҵ带 ������ �޼ҵ�");
	}
}
public class AbstractTest {
	public static void main(String[] args) {
		SubA obj= new SubA();
		obj.display(null);
//		SuperA obj2 = SuperA();
	}
}
