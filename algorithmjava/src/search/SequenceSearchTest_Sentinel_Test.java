package search;

import java.util.Scanner;

public class SequenceSearchTest_Sentinel_Test {
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.println("찾을 숫자: ");
		int searchValue=key.nextInt();
		int[] arr= {77,19,22,23,7,4,5,searchValue};
		long start=System.nanoTime();
		int position=search(arr,searchValue);
		long end=System.nanoTime();
		System.out.println("탐색시간:"+(end-start));
		//찾는 숫자가 배열에 마지막 index이면 찾는값이 index에 없다는 의미
		if(position==arr.length-1) {
			System.out.println("찾는 데이터가 없습니다");
		}else {
			System.out.println("데이터의 위치:"+position);
		}
	}

	public static int search(int[] arr,int searchValue) {
		int result=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==searchValue) {
				result=i;
				break;
			}
		}
		return result;
		
	}
}
