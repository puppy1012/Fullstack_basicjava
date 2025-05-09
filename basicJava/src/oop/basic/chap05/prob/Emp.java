package oop.basic.chap05.prob;
//문제 1번
public class Emp {
	private String id;
	private String name;
	private int baseSalary;

	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getBaseSalary() {
		return baseSalary;
	}
	public double getSalary(double bonus) {
		double salary= baseSalary+baseSalary*bonus;
		return (int)salary;
	}
	public String toString() {
		return name + "(" + id + ") 사원의 기본급은 " + baseSalary + "원 입니다.";
	}
}
