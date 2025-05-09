package Switch;

import java.util.Scanner;

public class Exam0429 {
	//자바_제어구문연습 1번
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("2~100사이의 정수를 입력하세요. :");
		int num=scan.nextInt();
		if(num>=2&num<=100) {
			boolean result=true;
			for(int i=2;i<num;i++) {
				//소수와 i가 나누어지면 소수가 아니다
				if(num%i ==0) {
					result=false;
					break;
				}
			}
			//삼항연산처리
			System.out.println(num+(result ? "는(은)소수입니다." : "는(은)소수가 아닙니다."));
		}else {
			System.out.println("잘못된 정수입력");
		}
	}
}