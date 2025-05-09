package oop.basic.chap05.constructor;

public class APIConstructor {
	public static void main(String[] args) {
		//String 클래스
		String str= new String("java");
		System.out.println(str);
		
		byte[] data1= {97,98,99,100};
		String str2= new String(data1);
		System.out.println(str2);
		//char 배열로
		char[] data2= {'j','a','v','a'};
		String str3= new String(data2);
		System.out.println(str3);
	}
}
