package sort;

import java.util.Arrays;

public class InsertionSrotTest_2 {
	public static void main(String[] args) {
		int[] arr= {77,19,22,23,7,4,5};
		for(int i=1; i<arr.length;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j-1]>arr[j]) {
					int tmp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=tmp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("======================");
		System.out.println(Arrays.toString(arr));
	}
}
