package sort;

import java.util.Arrays;

public class SwapTest {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		System.out.println(Arrays.toString(arr));
		//1����ҿ� 2����Ҹ� ���� �ٲٰ���� ���
		int tmp=arr[1];
		arr[1]=arr[2];
		arr[2]=tmp;
		System.out.println(Arrays.toString(arr));
	}
}
