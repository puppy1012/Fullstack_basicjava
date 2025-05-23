package datastructure;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest2 {
	public static void main(String[] args) {
		HashSet<String> set1 = new HashSet<String>();
		set1.add("java");
        set1.add("mysql");
        set1.add("servlet");
        set1.add("jdbc");
        set1.add("jsp");
        set1.add("spring");
        set1.add("css");
		display(set1);
		// 합집합 -Set을 생성할때 매개변수로 다른 set을 정의
		HashSet<String> set2 = new HashSet<String>(set1);
		set2.add("hadoop");
		set2.add("kafka");
		set2.add("spark");
		display(set2);
		//교집합
		HashSet<String> set3 = new HashSet<String>();
		set3.add("java");
        set3.add("servlet");
        set3.add("python");
        set3.add("Raspberry PI");
        display(set3);
        System.out.println("set1과set3의 교집합");
        //교집합을 하게되면 교집합이 set3에 새로 셋팅된다.
        //set3.retainAll(set1);
        display(set3);
        System.out.println("set2와 set3의 합집합");
        set2.addAll(set3);
        display(set2);
	}
	public static void display(Set<String> list) {
		System.out.println("=================");
		for(String data:list) {
			System.out.println(data);
		}
		System.out.println("사이즈=>"+list.size());
	}
}
