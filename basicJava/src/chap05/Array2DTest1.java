package chap05;

public class Array2DTest1 {
	public static void main(String[] args) {
		int[][] myarr= new int[3][2];
		System.out.println(myarr);
		System.out.println("각 요소가 참조하는 배열:"+myarr[0]);
		System.out.println("각 요소가 참조하는 배열:"+myarr[1]);
		System.out.println("각 요소가 참조하는 배열:"+myarr[2]);
		
		System.out.println(myarr[0][0]);
		System.out.println(myarr[1][0]);
		System.out.println(myarr[2][0]);
		
		for(int row=0;row<3;row++) {
			for(int col=0;col<2;col++) {
				System.out.print(myarr[row][col]+"\t");
			}
			System.out.println();
		}
	}
}
