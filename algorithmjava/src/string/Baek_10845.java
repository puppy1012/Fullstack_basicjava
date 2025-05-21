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
		StringBuilder builder= new StringBuilder();
		int back=-1;
		for(int i=0;i<num;i++) {
			String input=br.readLine();
			String[] is=input.split(" ");
			if(is[0].equals("push")) {
				int value=Integer.parseInt(is[1]);
				queue.add(value);
				back=value;
			}else if(is[0].equals("empty")) {
				if(queue.isEmpty()) {
					builder.append("1").append("\n");
				}else {
					builder.append("0").append("\n");
				}
			}else if(is[0].equals("size")) {
				builder.append(queue.size()).append("\n");
			}else if(is[0].equals("pop")) {
				if(queue.isEmpty()) {
					builder.append("-1").append("\n");
				}else {
					builder.append(queue.poll()).append("\n");
				}
			}else if(is[0].equals("front")) {
				if(queue.isEmpty()) {
					builder.append("-1").append("\n");
				}else {
					//poll이 아닌 peek
					builder.append(queue.peek()).append("\n");
				}
			}else if(is[0].equals("back")) {
				if(queue.isEmpty()) {
					builder.append("-1").append("\n");
				}else {
					//queue는 deque도 가능하다. 이때 getLast가 가능하지만 LinkedList형식일때만 가능하기에 cast처리
					builder.append(((LinkedList<Integer>) queue).getLast()).append("\n");
				}
			}
		}
		System.out.println(builder.toString());
	}
}
