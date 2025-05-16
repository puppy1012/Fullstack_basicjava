package datastructure;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("java");
		list.add("mysql");
		list.add("github");
		list.add("linux");
		list.add("algorithm");
		list.add("algorithm");
		System.out.println("사이즈=>"+list.size());
		display(list);
		list.set(4, "spring & spring boot");
		display(list);
		list.add("android");
		display(list);
		list.add(3,"javaprogramming");
		display(list);
		for(int i=0;i<list.size();i++) {
			if(list.get(i).equals("mysql")) {
				list.remove(i);
			}
		}
		
		display(list);
		System.out.println(list.contains("java"));
		System.out.println(list.contains("hadoop"));
		System.out.println(list.isEmpty());
		
	}
	public static void display(List<String> list) {
		System.out.println("=================");
		for(String data:list) {
			System.out.println(data);
		}
		System.out.println("사이즈=>"+list.size());
	}
}
