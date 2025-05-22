package recursion;

import java.util.Arrays;
import java.util.Scanner;

//피보나치수열을 배열로 처리
//첫째와 둘째 항을 1로
//i-1과 i-2의 합을 정의
//5
//1 1 2 3 5 ...
public class Fibonacci_ArrayTest {
	public static void main(String[] args) {
		Scanner key= new Scanner(System.in);
		int num=key.nextInt();
		int[]arr=new int[num+1];
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<num+1;i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("arr[num]="+arr[num]);
		System.out.println("fibonacci(num)="+fibonacci(num));
	}
	public static int fibonacci(int i) {
		if(i==0) {
			return 0;
		}else if(i==1) {
			return 1;
		}
		return fibonacci(i-1)+fibonacci(i-2);
	}
}
