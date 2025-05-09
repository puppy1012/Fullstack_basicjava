package oop.inheritance.chap07;

public class Staff extends Person{
	private String job;
	public Staff() {
		
	}
	
	public Staff (String name, int age, String job) {
		super(name,age);
		this.job = job;
	}

	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public void display() {
		super.display();
		System.out.println("\tºÎ   ¼­:"+job);
	}
	
}