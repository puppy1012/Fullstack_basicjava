package chap04;

public class MultiForGuGu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
		System.out.println("===============================================");
		for(int row=1;row<10;row++) {
			for(int cal=2;cal<10;cal++) {
				System.out.print(cal+"*"+row+"="+cal*row+"\t");
			}
			System.out.println();
		}
	}

}
