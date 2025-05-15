package string;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num= key.nextInt();
		for(int i=0;i<num;i++) {
			System.out.println(key.nextInt()+key.nextInt());
		}
	}
}
