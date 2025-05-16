package datastructure;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTest1 {
	public static void main(String[] args) {
		//1.HashSet을 생성
		//2. HashSet에 데이터 추가
		//3.HashSet에 저장된 요소의 갯수
		//4. 모든데이터 출력
		HashSet<String> set=new HashSet<String>();
		set.add("자바");
		set.add("서블릿");
		set.add("스프링");
		set.add("안드로이드");
		set.add("자바");
		display(set);
		System.out.println(set.contains("스프링"));
		
	}
	public static void display(Set<String> list) {
		System.out.println("=================");
		for(String data:list) {
			System.out.println(data);
		}
		System.out.println("사이즈=>"+list.size());
	}
}
