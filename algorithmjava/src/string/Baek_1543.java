package string;

import java.util.Scanner;

public class Baek_1543 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String word1 = key.nextLine();
		String word2 = key.nextLine();
		int count = 0;
		// word1의 길이와 word2의 길이를 합하면 오류가 발생,의미없음
		// 비교가 가능한 길이만큼 for문
		for (int i = 0; i <= word1.length() - word2.length();) {
			// 매칭되는지 안되는지 boolean처리
			boolean match = true;
			// word2의 길이만큼 word1과 word2를 비교해서 한번이라도 틀리면 false,break
			for (int j = 0; j < word2.length(); j++) {
				if (word1.charAt(i + j) != word2.charAt(j)) {
					match = false;
					break;
				}
			}
			// true이면 count+1,중복제외를 위한 word2길이만큼 i값 증가
			if (match) {
				count += 1;
				i += word2.length();
			} else {
				// 안맞으면 그냥 i값 증가
				i++;
			}
		}
		System.out.println(count);
	}
}
