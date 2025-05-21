package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Baek_2750 {
	public static void main(String[] args) throws IOException {
		ArrayList<Integer>arr= new ArrayList<Integer>();
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int num= Integer.parseInt(br.readLine());
		for(int i=0;i<num;i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		for(int i=0;i<num-1;i++) {
			for(int j=0;j<num-1-i;j++) {
				if(arr.get(j)>arr.get(j+1)) {
					int tmp= arr.get(j);
					arr.set(j,arr.get(j+1));
					arr.set(j+1, tmp);
				}
			}
		}
		for(int answer: arr) {
			System.out.println(answer);
		}
	}

}
