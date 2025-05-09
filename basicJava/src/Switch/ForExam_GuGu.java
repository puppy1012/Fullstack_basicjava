package Switch;

import java.util.Scanner;

/*
 * scanner로 입력 받은 구구단을 출력하세요
 * 
 * 출력형식
 * 단:___
 * 7*1=7
 * 7*2=14
 * ...
 * 7*9=63
 */
public class ForExam_GuGu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner value=new Scanner(System.in);
		int num=value.nextInt();
		MyMethodDemo.printGuGu(num);
	}


}
