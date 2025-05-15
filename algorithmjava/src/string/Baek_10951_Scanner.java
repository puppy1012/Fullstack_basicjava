package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Baek_10951_Scanner {
	public static void main(String[] args) {
		Scanner key= new Scanner(System.in);
		while(key.hasNextInt()){
			System.out.println(key.nextInt()+key.nextInt());
		}
	}
	public static void main2(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String num_list="";
		while((num_list=br.readLine())!=null) {
			String[] num=num_list.split(" ");
			System.out.println(Integer.parseInt(num[0])+Integer.parseInt(num[1]));
		}
	}
}
