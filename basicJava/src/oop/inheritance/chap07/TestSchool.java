package oop.inheritance.chap07;


public class TestSchool {
	public static void main(String[] args) {
		
		Student s = new Student("�輮��",31,202001);
		Teacher t = new Teacher("�賲��",30,"JAVA");
		Staff  e = new Staff("������",25,"�۰��");
	
		s.display();
		t.display();
		e.display();
	}

}
