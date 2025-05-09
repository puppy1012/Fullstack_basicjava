package Switch;

import java.util.Scanner;

public class Exam0429_GuGu {
	//자바_제어구문연습 2번
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("1보다크고 20보다 작은 정수를 입력하세요.:");
		int num=scan.nextInt();
		if(num>1&num<20) {
			for(int i=1;i<10;i++) {
				System.out.println((num+2)+" * "+i+" = "+(num+2)*i);
			}
		}else {
			System.out.println("잘못된 숫자가 입력되었습니다.");
		}
	}

}
