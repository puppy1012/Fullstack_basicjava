package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2750_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int num= Integer.parseInt(br.readLine());
		int[] arr= new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=Integer.parseInt((br.readLine()));
		}
		for(int i=0;i<num-1;i++) {
			for(int j=0;j<num-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int tmp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		for(int answer: arr) {
			System.out.println(answer);
		}
	}
}
