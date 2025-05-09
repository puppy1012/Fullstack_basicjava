package oop.inheritance.chap07;


public class TestSchool {
	public static void main(String[] args) {
		
		Student s = new Student("±è¼®Áø",31,202001);
		Teacher t = new Teacher("±è³²ÁØ",30,"JAVA");
		Staff  e = new Staff("ÀüÁ¤±¹",25,"ÀÛ°î°ú");
	
		s.display();
		t.display();
		e.display();
	}

}
