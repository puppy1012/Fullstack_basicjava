package search;

import java.util.Scanner;

public class SequenceSearchTest_Sentinel_Test {
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.println("ã�� ����: ");
		int searchValue=key.nextInt();
		int[] arr= {77,19,22,23,7,4,5,searchValue};
		long start=System.nanoTime();
		int position=search(arr,searchValue);
		long end=System.nanoTime();
		System.out.println("Ž���ð�:"+(end-start));
		//ã�� ���ڰ� �迭�� ������ index�̸� ã�°��� index�� ���ٴ� �ǹ�
		if(position==arr.length-1) {
			System.out.println("ã�� �����Ͱ� �����ϴ�");
		}else {
			System.out.println("�������� ��ġ:"+position);
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
