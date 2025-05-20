package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Cal {

	public String count(String vps) {
		int count = 0;
		for (int i = 0; i < vps.length(); i++) {
			if (vps.charAt(i)=='(') {
				count++;
			} else {
				count--;
			}
			if(count<0) {
				return "NO";
			}
		}
		if (count == 0) {
			return "YES";
		} else {
			return "NO";
		}
	}
}

public class Baek_9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		Cal cal= new Cal();
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < num; i++) {
			String vps = br.readLine();
			builder.append(cal.count(vps)+"\n");
		}
		System.out.println(builder.toString());
	}
}
