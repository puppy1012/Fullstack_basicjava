package chap05;

public class Array2DTest3 {
	public static void main(String[] args) {
		String[][]myarr= {
				{"*"},
				{"*","*"},
				{"*","*","*"},
				{"*","*","*","*"},
				{"*","*","*","*","*"}
		};
		System.out.println(myarr[4].length);
		for(int row=0;row<myarr.length;row++) {
			for(int i=0;i<myarr[row].length;i++) {
				System.out.print(myarr[row][i]);
			}
			System.out.println();
		}
	}
}
