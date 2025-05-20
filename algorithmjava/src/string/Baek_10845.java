package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Baek_10845 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Queue<Integer> queue= new LinkedList<Integer>();
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int num= Integer.parseInt(br.readLine());
		for(int i=0;i<num;i++) {
			String input=br.readLine();
			String[] is=input.split(" ");
			if(is[0]=="push") {
				queue.add(Integer.parseInt(is[1]));
			}
		}
	}
}
