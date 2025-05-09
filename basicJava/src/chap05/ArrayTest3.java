package chap05;

public class ArrayTest3 {

	public static void main(String[] args) {
		int[] myarr = new int[999];
		myarr[0]=1000;
		myarr[1]=2000;
		myarr[2]=3000;
		
		for(int i=0;i<999;i++) {
			System.out.println(i+"번요소=>"+myarr[i]);
		}
		System.out.println("배열의 요소의 갯수=>"+myarr.length);
	}
}
