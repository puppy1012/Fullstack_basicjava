package search;

import java.util.Scanner;

public class SequenceSearchTest {
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
		int result=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==searchValue) {
				result=i;
				break;
			}
		}
		return result;
		
	}
}
