package chap05;

public class ArrayExam3 {
	public static void main(String[] args) {
		int[] scoreArr= {98,99,100,89,88};
		int total=0;
		int avg=0;	
		for(int i:scoreArr) {
			total+=i;
		}
		avg=total/scoreArr.length;
		System.out.println("√—«’:"+total+"\n∆Ú±’:"+avg);
	}
}
