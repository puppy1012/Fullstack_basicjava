package string;

import java.util.Scanner;

public class Baek_2744_String {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String str=key.nextLine();
		String result="";
//		for(int i=0;i<str.length();i++) {
//			char tmp=str.charAt(i);
//			if(Character.isUpperCase(tmp)) {
//				result+=Character.toLowerCase(tmp);
//			}else {
//				result+=Character.toUpperCase(tmp);
//			}
//		}
		for(int i=0;i<str.length();i++) {
			char tmp=str.charAt(i);
			if(('A'<=tmp)&&(tmp<='Z')) {
				result+=(char)(tmp+32);
			}else if(('a'<=tmp)&&(tmp<='z')) {
				result+=(char)(tmp-32);
			}else {
				result+=(char)(tmp);
			}
		}
		System.out.println(result);
	}
}
