package oop.basic.chap05.prob;

//문제 1번
public class Student {
	private String name;
	private String subject;
	private int fee;
	private double returnFee;

	public Student(String name, String subject, int fee) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.subject=subject;
		this.fee=fee;
	}
	public void print() {
		// TODO Auto-generated method stub
		System.out.printf("%s 씨의 과정명은 %s 이고 교육비는 %d 이며 환급금은 %.1f 입니다.",name,subject,fee,returnFee);
	}

	public void calcReturnFee() {
		// TODO Auto-generated method stub
		if(subject.equals("javaprogram")) {
			returnFee=fee*0.25;
		}else if(subject.equals("jspprogram")){
			returnFee=fee*0.20;
		}else {
			System.out.println("그런 과정명은 없습니다");
		}
	}

	public static void main(String args[]){
		Student stu = new Student("장동건", "jspprogram",500000);
		stu.calcReturnFee();
		stu.print();
	}


}  
