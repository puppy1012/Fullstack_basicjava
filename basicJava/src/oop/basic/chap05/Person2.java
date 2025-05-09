package oop.basic.chap05;
//�ڹ��� Ư¡�� �°� Ŭ������ ����
//Ŭ������ �����Ҷ� ��������� private���� �����ؼ� �ܺο��� ������ �� ������ ��������
//�ܺο��� ���ٺҰ��̹Ƿ�,�ʿ�� public �޼ҵ带 ���ؼ� �����ϵ��� ����
public class Person2 {
	private String name;
	private String addr;
	private int age;
	
	//��� ��������� private���� ����Ǿ� �����Ƿ� �޼ҵ带 �����ؼ� �������� �� �ֵ��� �޼ҵ带 ����
	// ��������� ���� �����ϱ� ���� �޼ҵ� setter�޼ҵ�
	//�޼ҵ��: set+���� ����� ��������� ù ���ڸ� �빮�ڷ� �����ؼ� ����
	//ex)name������ ���� �����ϱ� ���� �޼ҵ�
	public Person2(String name,String addr,int age) {
		this.name=name;
		this.addr=addr;
		this.age=age;
	}
	public void setName(String name) {
		this.name= name;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return this.addr;
	}
	public int getAge() {
		return this.age;
	}
	public String getName() {
		return this.name;
	}
	public void display() {
		System.out.printf("name= %s , addr= %s , age= %d",name,addr,age);
	}
}
