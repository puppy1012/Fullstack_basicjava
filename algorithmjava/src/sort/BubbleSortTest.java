package sort;

import java.util.Arrays;

//��������
//������ ����� ���� ���ؼ� swap
public class BubbleSortTest {
	public static void main(String[] args) {
		int[] arr= {77,19,22,23,7,4,5};
		//�������ľ˰������� �������������ϱ�
		//���° ȸ������ ��Ÿ�������� for
		for(int i=0;i<arr.length-1;i++) {
			//�ܺ�for���� �ݺ��� i��°�϶� �̹� ���� i���� ������ �Ϸ�Ȼ����̹Ƿ�
			//i�� ���� �ݺ��ؾ��ؼ� ����for�� ������ ���鶧 ���ش�.
			//j�� ���� ���ڵ鿡 ���� index
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
