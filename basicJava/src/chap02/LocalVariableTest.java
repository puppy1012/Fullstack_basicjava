package chap02;



/*
 * 로컬변수(지역변수)의 특징
 * 1.지역변수는 사용하기전에 반드시 초기화를 해야한다.
 */
public class LocalVariableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		int num;
		System.out.println("i="+i);
		{
			int j=100;
		}
		int j=200;
		System.out.println("j="+j);
	}

}
