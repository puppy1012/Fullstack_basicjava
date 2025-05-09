package chap04;
//switch문의 특징
/*
 * =>switch문 내부에서 평가할 수 있는 데이터 타입
 * =>switch내부에서 평가 할 수있는 값은 int로 자동 캐스팅이 되는 타입(byte,short,int,char)
 * 이거나 String
 * =>case문에는 조건식을 사용할 수 없다.
 */
public class SwitchTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte data=10;
		switch(data) {
			case 10:
				System.out.println("예시1");
		}
		int data2=10;
		switch(data2) {
			case 10:
				System.out.println("예시1");
				break;
		}
	}

}
