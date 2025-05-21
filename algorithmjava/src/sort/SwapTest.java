package sort;

import java.util.Arrays;

public class SwapTest {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		System.out.println(Arrays.toString(arr));
		//1번요소와 2번요소를 서로 바꾸고싶은 경우
		int tmp=arr[1];
		arr[1]=arr[2];
		arr[2]=tmp;
		System.out.println(Arrays.toString(arr));
	}
}
