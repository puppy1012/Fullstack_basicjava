package sort;

import java.util.Arrays;

public class InsertionSortTest {
	public static void main(String[] args) {
		/*
		 * 0번째 요소는 정렬된 값이라 판단후 작업
		 * 바깥 for문은 배열의 1번 인덱스부터 끝까지 반복한다.(정렬되지않은 영역)
		 * 매 반복에서 arr[i]는 현재 삽입할 대상(key) 이 된다.
		 * 안쪽 for문은 i 이전의 왼쪽 정렬된 영역을 탐색한다.
		 * 왼쪽 값이 현재 값보다 크면, 오른쪽으로 한 칸 밀어낸다.
		 * 적절한 위치를 찾으면 key를 거기에 삽입한다.
		 */
		int[] arr= {77,19,22,23,7,4,5};
		//i: 삽입할 값의 인덱스 (1번부터 시작)
		for (int i = 1; i < arr.length; i++) {
			//j: 그 값이 들어갈 자리를 찾기 위해 왼쪽으로 비교 이동
		    for (int j = i; j > 0; j--) {
		    	//조건: arr[j - 1] > arr[j]일 때 swap (더 큰 값을 오른쪽으로 밀어냄)
		        if (arr[j - 1] > arr[j]) {
		            // swap: 더 큰 값을 뒤로 보내기
		            int temp = arr[j];
		            arr[j] = arr[j - 1];
		            arr[j - 1] = temp;
		        } else {
		        	//break: 정렬된 상태를 만나면 멈춤 (최적화)
		            //정렬된 상태이므로 더 이상 비교하지 않음
		            break;
		        }
		    }
		}
		
		System.out.println("======================");
		System.out.println(Arrays.toString(arr));
	}
}
