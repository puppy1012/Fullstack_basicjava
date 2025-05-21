package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek_11399 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//문제에서 제시하는 최소시간대의 경우 결국 크기가 작은순서대로 오름차 정렬을 하라는것이다
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		String list=br.readLine();
		String[] list_split=list.split(" ");
		int[] int_list= new int[num];
		for(int i=0;i<num;i++) {
			int_list[i]=Integer.parseInt(list_split[i]);
		}
//		for(int i=1;i<int_list.length;i++) {
//			for(int j=i;j>0;j--) {
//				if(int_list[j-1]>int_list[j]) {
//					int tmp=int_list[j];
//					int_list[j]=int_list[j-1];
//					int_list[j-1]=tmp;
//				}else {
//					break;
//				}
//			}
//		}
		Arrays.sort(int_list);
		int total=0;
		int sum=0;
		//sum은 i번째값의 합을 구하기
		//total은 sum의값을 더하기
//		for(int i=0;i<int_list.length;i++) {
//			sum+=int_list[i];
//			total+=sum;
//		}
		for(int i:int_list) {
			sum+=i;
			total+=sum;
		}
		System.out.println(total);
	}
}
