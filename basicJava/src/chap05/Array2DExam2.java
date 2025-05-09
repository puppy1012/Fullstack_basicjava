package chap05;

public class Array2DExam2 {
	public static void main(String[] args) {
		int[][] num_list={{90,89,100} , {98,89,97}};
		//단,classArr와 jumsuArr연관성이 있으므로 
		//classArr의 요소 갯수와 jumsArr의 바깥족 요소의 갯수가 동일해야한다.
		String[] classArr= {"A반","B반"};
		for(int row=0;row<num_list.length;row++) {
			int sum=0,avg=0;
			if(row==0) {
				System.out.print(classArr[row]+": ");
			}else {
				System.out.print(classArr[row]+": ");
			}
			for(int col=0;col<num_list[row].length;col++) {
				System.out.print(num_list[row][col]+"\t");
				sum+=num_list[row][col];
			}
			System.out.printf("합계:%d 평균:%d\n",sum,(sum/num_list[row].length));
		}
		System.out.println("==========================================");
		for(int row=0;row<num_list.length;row++) {
			int sum=0;
			if(row==0) {
				System.out.printf("[%s]\n",classArr[row]);
			}else {
				System.out.printf("[%s]\n",classArr[row]);
			}
			for(int col=0;col<num_list[row].length;col++) {
				sum+=num_list[row][col];
			}
			System.out.printf("합계:%d\n평균:%f\n",sum,(double)sum / num_list[row].length);
			System.out.println("----------------------------------------");
		}
	}
}
