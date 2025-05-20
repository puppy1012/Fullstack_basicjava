package string;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baek_2164 {
	public static void main(String[] args) {
		Queue<Integer> queue =new LinkedList<Integer>();
		Scanner key= new Scanner(System.in);
		int num= key.nextInt();
		for(int i=1;i<=num;i++) {
			queue.add(i);
		}
		while(queue.size()!=1) {
			queue.poll();
			queue.add(queue.poll());
		}
		System.out.println(queue.poll());
	}
}
