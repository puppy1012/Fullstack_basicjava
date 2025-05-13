package api.lang;
//equals테스트
//object의 equals메소드는 객체의 값이 아니라 주소를 비교하는 메소드
//자바에서 만들어지는 모든 클래스의 최상위클래스인 object 클래스의 equals는 ==연산자와 같은 의미
//=>객체의 참조갑승ㄹ 비교한다.
public interface ObjectTest2 {
	public static void main(String[] args) {
		Object obj1=new Object();
		Object obj2=new Object();
		System.out.println(obj1);
		System.out.println(obj2);
		if(obj1==obj2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		System.out.println("=========================");
		if(obj1.equals(obj2)) {
			System.out.println("같다구");
		}else {
			System.out.println("다르다구");
		}
		System.out.println("=========================");
		Person p1 = new Person("BTS","서울",901112);
		Person p2 = new Person("BTS","서울",901112);
		if(p1.equals(p2)) {
			System.out.println("같은객체");
		}else {
			System.out.println("다른객체");
		}
	}
}
