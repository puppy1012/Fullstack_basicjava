package oop.basic.chap05;
//자바의 특징에 맞게 클래스를 정의
//클래스를 정의할때 멤버변수는 private으로 선언해서 외부에서 접근할 수 없도록 정보은닉
//외부에서 접근불가이므로,필요시 public 메소드를 통해서 접근하도록 정의
public class Person2 {
	private String name;
	private String addr;
	private int age;
	
	//모든 멤버변수가 private으로 선언되어 있으므로 메소드를 정의해서 엑세스할 수 있도록 메소드를 구현
	// 멤버변수에 값을 설정하기 위한 메소드 setter메소드
	//메소드명: set+값이 저장될 멤버변수의 첫 글자를 대문자로 변경해서 연결
	//ex)name변수에 값을 설정하기 위한 메소드
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
