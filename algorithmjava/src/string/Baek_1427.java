package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1427 {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		//입력되는 숫자를 문자형으로 입력받기
		String num=br.readLine();
		//배열에 split을 통해 각각 할당
		String[] num_split=num.split("");
		//각 문자열을 int형으로 치환후 int형 배열에 입력
		int[] list=new int[num_split.length];
		for(int i=0;i<num_split.length;i++) {
			list[i]=Integer.parseInt(num_split[i]);
		}
		//선택정렬 내림차순
		for (int i = 0; i < list.length; i++) {
		    // 현재 위치 i부터 마지막까지 중에서 가장 큰 값을 찾기 위해 초기 max 인덱스를 i로 설정
		    int max = i;

		    // i+1부터 배열 끝까지 탐색하며 가장 큰 값을 가진 인덱스를 찾음
		    for (int j = i + 1; j < list.length; j++) {
		        // list[j]가 현재 max보다 크다면 → 더 큰 값을 찾은 것이므로 max 인덱스를 갱신
		        if (list[j] > list[max]) {
		            max = j;  // 가장 큰 값의 인덱스를 max로 업데이트
		        }
		    }

		    // 찾은 최댓값(max 위치의 값)과 현재 i 위치의 값을 교환 → 가장 큰 값을 앞으로 보냄
		    int tmp = list[max];   // max 위치의 값을 임시 저장
		    list[max] = list[i];   // 현재 i 위치 값을 max 위치로 옮김
		    list[i] = tmp;         // max 값을 현재 i 위치에 넣음 (swap 완료)
		}
//		for (int i = 0; i < list.length; i++) {
//		    // 현재 위치 i부터 마지막까지 중에서 가장 작은 값을 찾기 위해 초기 min 인덱스를 i로 설정
//		    int min = i;
//
//		    // i+1부터 배열 끝까지 탐색하며 가장 작은 값을 가진 인덱스를 찾음
//		    for (int j = i + 1; j < list.length; j++) {
//		        // list[j]가 현재 min보다 작다면 → 더 작은 값을 찾은 것이므로 min 인덱스를 갱신
//		        if (list[j] < list[min]) {
//		            min = j;  // 가장 작은 값의 인덱스를 min으로 업데이트
//		        }
//		    }
//
//		    // 찾은 최솟값(min 위치의 값)과 현재 i 위치의 값을 교환 → 가장 작은 값을 앞에 배치
//		    int tmp = list[min];   // min 위치의 값을 임시 저장
//		    list[min] = list[i];   // 현재 i 위치 값을 min 위치로 옮김
//		    list[i] = tmp;         // min 값을 현재 i 위치에 넣음 (swap 완료)
//		}

		for(int number:list) {
			System.out.print(number);
		}
	}
}
