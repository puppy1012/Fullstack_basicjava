package oop.basic.chap05.prob;

//���� 1��
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
		System.out.printf("%s ���� �������� %s �̰� ������� %d �̸� ȯ�ޱ��� %.1f �Դϴ�.",name,subject,fee,returnFee);
	}

	public void calcReturnFee() {
		// TODO Auto-generated method stub
		if(subject.equals("javaprogram")) {
			returnFee=fee*0.25;
		}else if(subject.equals("jspprogram")){
			returnFee=fee*0.20;
		}else {
			System.out.println("�׷� �������� �����ϴ�");
		}
	}

	public static void main(String args[]){
		Student stu = new Student("�嵿��", "jspprogram",500000);
		stu.calcReturnFee();
		stu.print();
	}


}  
