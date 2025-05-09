package oop.basic.chap05;
public class TestSchool {
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setName("ÀÌ½ÂÇö");
		s.setAge(31);
		s.setId(202001);

		Teacher t = new Teacher ();
		t.setName("±è³²ÁØ");
		t.setAge(30);
		t.setSubject("JAVA");

		Staff  e = new Staff();
		e.setName("ÀüÁ¤±¹");
		e.setAge(25);
		e.setJob("ÀÛ°î°¡");
		
		s.display();
		t.display();
		e.display();
	}

}
