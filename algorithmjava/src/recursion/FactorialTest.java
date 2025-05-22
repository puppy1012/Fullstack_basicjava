package recursion;

public class FactorialTest {
	public static void main(String[] args) {
		System.out.println("5!="+factorial(5));
		//재귀없이 작업...
		int sum=1;
		for(int i=1;i<=5;i++) {
			System.out.println("sum=sum*"+i);
			sum=sum*i;
		}
		System.out.println(sum);

	}
	public static int factorial(int i) {
		if(i==1) {
			return 1;
		}
		return i*factorial(i-1);
		
	}
}
