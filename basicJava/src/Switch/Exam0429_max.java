package Switch;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam0429_max {
	//자바_제어구문연습 3번
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		
		//입력을 3번 받는다고 가정
		System.out.println("[입력값]");
		ArrayList<Integer> result= new ArrayList<>();
		
		for(int i=0;i<3;i++) {
			String input=scan.nextLine();
			String[]input_parts=input.split(",");
			
			int number1=Integer.parseInt(input_parts[0].trim());
			int number2=Integer.parseInt(input_parts[1].trim());
			int gdc=findGDC(number1,number2);
			result.add(gdc);
		}
		System.out.println("[실행결과]");
		for(int i:result) {
			System.out.println(i);
		}
		
		
	}
	//재귀함수 처리
	public static int findGDC(int number1,int number2) {
		if(number2==0) {
			return number1;
		}
		return findGDC(number2,number1%number2);
	}

}
