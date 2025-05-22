package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek_1920_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int datasize = Integer.parseInt(br.readLine());
		String[] strArr = br.readLine().split(" ");
		int[] dataarr = new int[datasize];
		for (int i = 0; i < datasize; i++) {
			dataarr[i] = Integer.parseInt(strArr[i]);
		}
		Arrays.sort(dataarr);
		int searchsize = Integer.parseInt(br.readLine());
		String[] searchValueline = br.readLine().split(" ");
		StringBuilder builder=new StringBuilder();
		for (String searchValue : searchValueline) {
			builder.append(binarysearch(dataarr,Integer.parseInt(searchValue))).append("\n");
		}
		System.out.println(builder.toString());
	}

	public static int binarysearch(int[] Ilist1, int key) {

		int start = 0;
		int end = Ilist1.length - 1;
		int result = 0;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (Ilist1[mid] == key) {
				result = 1;
				break;
			} else if (Ilist1[mid] < key) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return result;

	}
}
