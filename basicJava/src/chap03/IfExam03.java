package chap03;

import java.util.Random;
import java.util.Scanner;

public class IfExam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		System.out.println("숫자입력:");
		int num=key.nextInt();
		if(num>0) {
			re_answer(num,"양수");
		}else {
			re_answer(num,"음수");
		}
	}
	public static void re_answer(int num,String answer) {
		if(num%2==0) {
			System.out.println(answer+"이면서 짝수");
		}else {
			System.out.println(answer+"이면서 홀수");
		}
	}
}
