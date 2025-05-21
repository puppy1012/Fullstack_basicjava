package search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTest {
	public static void main(String[] args) {
		int[] arr= {77,19,22,23,7,4,5};
		Scanner key = new Scanner(System.in);
		System.out.println("ã�� ����: ");
		int searchValue=key.nextInt();
		long start=System.nanoTime();
		int position=search(arr,searchValue);
		long end=System.nanoTime();
		System.out.println("Ž���ð�:"+(end-start));
		if(position==-1) {
			System.out.println("ã�� �����Ͱ� �����ϴ�");
		}else {
			System.out.println("�������� ��ġ:"+position);
		}
	}
	//serarchValue�� ��ġ�� ����, ������ -1�� ����
	//arr�� ã������ �ϴ� ���� ����� �迭
	//searchValue�� ���� ã�� ��
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
