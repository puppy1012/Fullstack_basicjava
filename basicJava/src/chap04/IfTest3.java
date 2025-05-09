package chap04;

import java.util.Random;

//중첩if
//if문 내부에 if문을 중첩해서 사용
//num을 -10부터 120까지 랜덤수를 발생시켜 저장하기
//90보다 크거나 같으면 pass출력
//90보다 작으면 fail출력
//단,num은 0보다 작거나 100보다 큰 값을 입력 받으면 "잘못입력메시지를 출력하기
//	num이 0보다 크거나 같고 100보다 작거나 같은 경우에만 pass/fail평가하기
public class IfTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand= new Random();
		int num=rand.nextInt(-10, 121);
		System.out.println(num);
		if(num<0 |num>100) {
			System.out.println("잘못입력");

		}else {
			if(num>=90) {
				System.out.println("pass");
			}else {
				System.out.println("fail");
			}
		}
		System.out.println("===============================================");
		if(num>=0&&num<100) {
			if(num>=90) {
				System.out.println("pass");
			}else {
				System.out.println("fail");
			}
		}else {
			System.out.println("잘못입력");
		}
	}

}
