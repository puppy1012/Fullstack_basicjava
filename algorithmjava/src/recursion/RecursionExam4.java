package recursion;

public class RecursionExam4 {
	public static void main(String[] args) {
		System.out.println("гу:"+sum(10));
	}
	public static int sum(int i) {
		if(i==0) {
			return 0;
		}
		return i+sum(i-1);
		
	}
}
