package oop.basic.chap05;

public class Teacher{
	private String name;
	private String subject;
	private int age;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setSubject(String subject) {
		this.subject=subject;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getName() {
		return this.name;
	}
	public String getSubject() {
		return this.subject;
	}
	public int getAge() {
		return this.age;
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.printf("이름 : %s 나이 : %d 담당과목: %s\n",name,age,subject);
	}
}