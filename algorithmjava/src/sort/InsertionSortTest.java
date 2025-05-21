package sort;

import java.util.Arrays;

public class InsertionSortTest {
	public static void main(String[] args) {
		/*
		 * 0��° ��Ҵ� ���ĵ� ���̶� �Ǵ��� �۾�
		 * �ٱ� for���� �迭�� 1�� �ε������� ������ �ݺ��Ѵ�.(���ĵ������� ����)
		 * �� �ݺ����� arr[i]�� ���� ������ ���(key) �� �ȴ�.
		 * ���� for���� i ������ ���� ���ĵ� ������ Ž���Ѵ�.
		 * ���� ���� ���� ������ ũ��, ���������� �� ĭ �о��.
		 * ������ ��ġ�� ã���� key�� �ű⿡ �����Ѵ�.
		 */
		int[] arr= {77,19,22,23,7,4,5};
		//i: ������ ���� �ε��� (1������ ����)
		for (int i = 1; i < arr.length; i++) {
			//j: �� ���� �� �ڸ��� ã�� ���� �������� �� �̵�
		    for (int j = i; j > 0; j--) {
		    	//����: arr[j - 1] > arr[j]�� �� swap (�� ū ���� ���������� �о)
		        if (arr[j - 1] > arr[j]) {
		            // swap: �� ū ���� �ڷ� ������
		            int temp = arr[j];
		            arr[j] = arr[j - 1];
		            arr[j - 1] = temp;
		        } else {
		        	//break: ���ĵ� ���¸� ������ ���� (����ȭ)
		            //���ĵ� �����̹Ƿ� �� �̻� ������ ����
		            break;
		        }
		    }
		}
		
		System.out.println("======================");
		System.out.println(Arrays.toString(arr));
	}
}
