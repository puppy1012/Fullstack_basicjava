package oop.basic.chap05.prob;
public class Exam1 {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.setId("12345");
		emp.setName("ȫ�浿");
		emp.setBaseSalary(50000);
		System.out.println( emp.toString() );
		System.out.println( "���� = " + emp.getSalary( 30 ) );
		
	}

}
