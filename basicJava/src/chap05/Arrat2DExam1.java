package chap05;

public class Arrat2DExam1 {
	public static void main(String[] args) {
		int[][] myarr=new int[3][3];
		int num=100;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==j) {
					myarr[i][j]=num;
					num+=100;
				}
				System.out.print(myarr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
