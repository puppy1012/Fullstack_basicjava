package api.lang;

import java.util.Scanner;

public class StringExam1 {
	public static void main(String[] args) {
		Scanner key= new Scanner(System.in);
		System.out.println("문자열입력:");
		//next메소드는 spacebar나 enter를 만나기전까지의 문자열만 읽어서 리턴
		//한줄전체를 읽고 싶은 경우
//		String data=key.next();
		String data=key.nextLine();

		//미션
		//입력받은 문자열을 대문자로 변경하여 거꾸로 출력하라
		data=data.toUpperCase();
		String reverse="";
		for(int i= data.length()-1;i>=0;i--) {
			reverse+=data.charAt(i);
		}
		System.out.println(reverse);
	}
}
