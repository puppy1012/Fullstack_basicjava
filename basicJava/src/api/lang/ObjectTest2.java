package api.lang;
//equals�׽�Ʈ
//object�� equals�޼ҵ�� ��ü�� ���� �ƴ϶� �ּҸ� ���ϴ� �޼ҵ�
//�ڹٿ��� ��������� ��� Ŭ������ �ֻ���Ŭ������ object Ŭ������ equals�� ==�����ڿ� ���� �ǹ�
//=>��ü�� �������¤� ���Ѵ�.
public interface ObjectTest2 {
	public static void main(String[] args) {
		Object obj1=new Object();
		Object obj2=new Object();
		System.out.println(obj1);
		System.out.println(obj2);
		if(obj1==obj2) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		System.out.println("=========================");
		if(obj1.equals(obj2)) {
			System.out.println("���ٱ�");
		}else {
			System.out.println("�ٸ��ٱ�");
		}
		System.out.println("=========================");
		Person p1 = new Person("BTS","����",901112);
		Person p2 = new Person("BTS","����",901112);
		if(p1.equals(p2)) {
			System.out.println("������ü");
		}else {
			System.out.println("�ٸ���ü");
		}
	}
}
