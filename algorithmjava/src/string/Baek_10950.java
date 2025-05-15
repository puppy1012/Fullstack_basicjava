package string;

import java.util.Scanner;

public class Baek_10950 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num= Integer.parseInt(key.nextLine());
		for(int i=0;i<num;i++) {
			System.out.println(key.nextInt()+key.nextInt());
		}
	}
}
