package chap05;

public class ArrayExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list=new int[3];
		list[0]=1000;
		list[2]=2000;
//		for(int i:list) {
//			System.out.println(i);
//		}
		for(int i=0;i<list.length;i++) {
			System.out.println(i+"번째 요소="+list[i]);
		}
	}

}
