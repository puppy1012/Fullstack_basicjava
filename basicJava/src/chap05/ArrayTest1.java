package chap05;

public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarr;
		myarr = new int[5];
		System.out.println(myarr);
		
		//배열의 선언과 생성을 한번에 작업하기
		//=>String객체 3개를 저장할수있는 배열객체를 힙에 만들고 strArr변수가 참조
		
		String[] strArr=new String[3];
		System.out.println(strArr);
		
		myarr[1]=100;
		System.out.println();
	}

}
