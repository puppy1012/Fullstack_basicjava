package oop.basic.chap05;
public class TestSchool {
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setName("�̽���");
		s.setAge(31);
		s.setId(202001);

		Teacher t = new Teacher ();
		t.setName("�賲��");
		t.setAge(30);
		t.setSubject("JAVA");

		Staff  e = new Staff();
		e.setName("������");
		e.setAge(25);
		e.setJob("�۰");
		
		s.display();
		t.display();
		e.display();
	}

}
