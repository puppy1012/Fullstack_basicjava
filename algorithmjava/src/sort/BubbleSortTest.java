package sort;

import java.util.Arrays;

//버블정렬
//인접한 요소의 값을 비교해서 swap
public class BubbleSortTest {
	public static void main(String[] args) {
		int[] arr= {77,19,22,23,7,4,5};
		//버블정렬알고리즘으로 오름차순정렬하기
		//몇번째 회차인지 나타내기위한 for
		for(int i=0;i<arr.length-1;i++) {
			//외부for문의 반복이 i번째일때 이미 뒤족 i개는 정렬이 완료된상태이므로
			//i를 빼고 반복해야해서 내부for의 조건을 만들때 빼준다.
			//j가 비교할 숫자들에 대한 index
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("======================");
		System.out.println(Arrays.toString(arr));
	}
}
