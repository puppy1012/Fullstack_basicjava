package chap03;

import java.util.Random;

//1부터 100까지 랜덤수를 발생시켜서 숫자를 num변수에 저장하기
//num변수의 값이 90보다 크면 "테스트작업완료 메시지를 출력하기
public class IfTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int num=rand.nextInt(100)+1;
		System.out.println("num=>"+num);
		if(num>90) {
			System.out.println("테스트작업완료");
			System.out.println("처리진행중");
		}
		System.out.println("작업종료");
	}

}
