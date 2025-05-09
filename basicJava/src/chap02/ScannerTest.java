package chap02;

import java.util.Scanner;

//scanner 클래스를 연습하기 위한 클래스
/*
 * scanner는 사용자가 입력하는 값을 읽어서 처리하기 위한 기능을 포함하는 클래스
 */
public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		//Scanner에서 제공되는 메소드들은 키보드로 입력하는 값을 타입에 따라서 읽을 수 있도록
		//메소드를 제공
		//spacebar키나 enter키가 눌려지기 전까지 입력한 값을 읽어서 반환
		System.out.println("단어입력");
		String val=key.next();
		System.out.println("사용자가 입력한 값:"+val);
		
		System.out.println("숫자입력:");
		int intVal=key.nextInt();
		System.out.println("사용자가 입력한 숫자값:"+intVal);
	}

}
