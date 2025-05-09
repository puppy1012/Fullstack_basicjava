package chap04;

public class MultiForGuGu_Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int dan=2;dan<=9;dan++) {
//			if(dan==5) {
//				continue;
//			}
			for(int i=1;i<=9;i++) {
				if(dan==5) {
					break;
				}
				System.out.print(dan+" * "+i+" = "+(dan*i)+"\t");
			}
			System.out.println();
		}
	}

}
