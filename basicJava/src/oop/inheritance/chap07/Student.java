package oop.inheritance.chap07;

public class Student extends Person{

	private int id;
	public Student() {
		
	}
	public Student(String name,int age,int id) {
		super(name,age);
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public void display() {
		super.display();
		System.out.println("\t��   ��:"+id);
	}
	
}