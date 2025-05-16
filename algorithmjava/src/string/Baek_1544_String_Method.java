package string;

import java.util.Scanner;

public class Baek_1544_String_Method {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String word1 = key.nextLine();
		String word2 = key.nextLine();
		int count = 0;
		int startIndex=0;
		while(true) {
			int findIndex= word1.indexOf(word2,startIndex);
//			System.out.println(findIndex);
			if(findIndex<0) {
				break;
			}
			startIndex=findIndex+word2.length();
			count++;
		}
		System.out.println(count);
	}
}
