package oop.basic.chap05;

public class Staff{
	private String name;
	private int age;
	private String job;
	public Staff() {
		
	}
	public Staff(String name,int age, String dept) {
		super();
		this.name=name;
		this.age=age;
		this.job=job;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.printf("�̸� : %s ���� : %d ��     ��: %s\n",name,age,job);
	}

}