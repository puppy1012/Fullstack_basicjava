package search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTest {
	public static void main(String[] args) {
		int[] arr= {77,19,22,23,7,4,5};
		Scanner key = new Scanner(System.in);
		System.out.println("찾을 숫자: ");
		int searchValue=key.nextInt();
		long start=System.nanoTime();
		int position=search(arr,searchValue);
		long end=System.nanoTime();
		System.out.println("탐색시간:"+(end-start));
		if(position==-1) {
			System.out.println("찾는 데이터가 없습니다");
		}else {
			System.out.println("데이터의 위치:"+position);
		}
	}
	//serarchValue의 위치를 리턴, 없으면 -1을 리턴
	//arr은 찾으려고 하는 값이 저장된 배열
	//searchValue가 실제 찾는 값
	public static int search(int[] arr,int searchValue) {
		Arrays.sort(arr);
		int searchIndex=-1;
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid= (low+high)/2;
			if(arr[mid]==searchValue) {
				searchIndex=mid;
				break;
			}else if(arr[mid]<searchValue){
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return searchIndex;
		
	}
}
