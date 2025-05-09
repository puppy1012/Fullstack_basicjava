package chap04;

import java.util.Scanner;

public class WhileExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("´Ü:");
		int dan= scan.nextInt();
		int i=1;
		while(i<=9) {
			System.out.println(dan+"*"+i+" = "+(dan*i));
			i+=1;
		}
	}

}
