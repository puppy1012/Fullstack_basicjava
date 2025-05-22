package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciRecursionTest {
	static int[] memo;
//	static {Arrays.fill(memo, -1);};
	public static void main(String[] args) {
		Scanner key= new Scanner(System.in);
		int num=key.nextInt();
		memo=new int[num+1];
		Arrays.fill(memo, -1);
		int result=getFibonacci(num);
		System.out.println(result);
	}
	public static int getFibonacci(int i) {
		//피보나치의 0번째는 0 1번째는 1이 고정
		if(i==0 || i==1)return i;
		if (memo[i] != -1) return memo[i];
		return memo[i]=getFibonacci(i-1)+getFibonacci(i-2);
	}
}
