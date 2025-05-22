package recursion;

public class RecrusionExam2 {
	public static void main(String[] args) {
		printStar(10);
	}
	public static int printStar(int i) {
		if(i==0) {
			return -1;
		}
		System.out.print("*");
		return printStar(i-1);
		
	}
}
