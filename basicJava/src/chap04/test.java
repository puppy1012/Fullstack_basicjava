package chap04;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		String[] arr = {"apple", "banana", "cherry"};
		List<String> list = new ArrayList<>();
		for(String i:arr) {
			list.add(i);
		}
		System.out.println(list);
	}

}
