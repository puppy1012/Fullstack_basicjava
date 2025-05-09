package chap03;

import java.util.Scanner;

public class Ifexam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		System.out.print("숫자입력:");
		int num=key.nextInt();
		if(num>=0) {
			if(num%5==0) {
				System.out.print("입력한숫자는 5의 배수입니다");
			}
			else {
				System.out.print("입력한 숫자는 5의 배수가 아닙니다");
			}
		}

	}

}
