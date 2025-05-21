package sort;

import java.util.Arrays;

public class SelectionSortTest {
	public static void main(String[] args) {

		int[] arr = { 77, 19, 22, 23, 7, 4, 5 };

		for (int i = 0; i < arr.length - 1; i++) {
			int select = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[select]) {
					select = j;
				}
			}
			if (arr[i] < arr[select]) {
				int tmp = arr[i];
				arr[i] = arr[select];
				arr[select] = tmp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
