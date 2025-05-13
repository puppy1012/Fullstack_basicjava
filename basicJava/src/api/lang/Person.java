package api.lang;

public class Person {
	private String name;
	private String addr;
	private int age;
	public Person() {}
	public Person(String name, String addr, int age) {
		super();
		this.name = name;
		this.addr = addr;
		this.age = age;
	}
	/*
	 * equals�޼ҵ带 �������̵��ϴ� ������ ��ü�� ���� �ִ� ���� ���ϱ� ���ؼ� �������̵�
	 * jdk���ο��� ����ϴ� �پ��� Ŭ������� ���̺귯�� ���ο��� ��ü�� ������ ���ϱ����� object�� �����ִ�
	 * equals�޼ҵ带 ȣ���ؼ� ó��
	 * ��ü�� ���� �ִ� ���� ���Ҷ� ó���ǹǷ� �������̵�
	 * 1.this��obj�� ���� ��ü���� ��(�ּ�)
	 * 2.obj�� null�� �ƴϰ� ������ Ŭ�����̈� ��
	 * 3.��ü�� �����ִ� �Ӽ��� ��
	 */
	public boolean equals(Object obj) {
		if(this==obj)return true;
		if(obj==null|this.getClass()!=obj.getClass())return false;
		//��ü�� ��������� ��(name,age,addr)
		//this�� �Ű����� obj�� �����ִ� name,age,addr�� ���ؾ� �ϹǷ� obj�� person���� ĳ����
		if(obj instanceof Person) {//person��ü�� �ν��Ͻ����� ��
			Person p =(Person)obj;
			//��ü�� �����ִ� ��簪�� ��
			if(this.name.equals(p.name)&this.addr.equals(p.addr)&this.age==p.age) {
				return true;
			}
		}
		return false;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString(){
		return getName()+","+getAddr()+","+getAge();
	}
}
