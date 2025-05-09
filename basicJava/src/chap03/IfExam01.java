package chap03;

import java.util.Random;
import java.util.Scanner;

public class IfExam01 {

	public static void main(String[] args) {
/*		TODO Auto-generated method stub
		Random rand= new Random();
		int num= rand.nextInt(100)+1;
		System.out.println(num);
		if(num%5==0) {
			System.out.println("입력한숫자는 5의 배수입니다");
		}
		else {
			System.out.println("입력한 숫자는 5의 배수가 아닙니다");
		}
*/	
		Scanner key = new Scanner(System.in);
		System.out.println("숫자입력:");
		int intVal=key.nextInt();
		
		if(intVal%5==0) {
			System.out.println("입력한숫자는 5의 배수입니다");
		}
		else {
			System.out.println("입력한 숫자는 5의 배수가 아닙니다");
		}
	}

}
