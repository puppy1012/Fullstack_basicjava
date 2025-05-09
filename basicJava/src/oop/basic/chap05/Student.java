package oop.basic.chap05;

public class Student {
	
	private String name;
	private int age;
	private int id;

	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public int getId() {
		return id;
	}
	public String getStudent() {
		return name;
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.printf("이름 : %s 나이 : %d 학     번: %d\n",name,age,id);
	}

}


