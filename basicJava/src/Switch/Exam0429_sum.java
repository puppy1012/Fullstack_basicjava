package Switch;

import java.util.Scanner;

public class Exam0429_sum {
	//자바_제어구문연습 4번
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("[출력값]\n양의 정수를 입력하세요 :");
		int num=scan.nextInt();
		int num_count=0;
		int num_total=0;
		for(int i=1;i<=1000;i++) {
			if(i%num==0) {
				num_count+=1;
				num_total+=i;
			}
		}
		System.out.println("7의 배수 개수 ="+num_count);
		System.out.println("7의 배수 합 ="+num_total);
		
	}

}
