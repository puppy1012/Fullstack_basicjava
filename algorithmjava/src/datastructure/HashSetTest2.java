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
		// ������ -Set�� �����Ҷ� �Ű������� �ٸ� set�� ����
		HashSet<String> set2 = new HashSet<String>(set1);
		set2.add("hadoop");
		set2.add("kafka");
		set2.add("spark");
		display(set2);
		//������
		HashSet<String> set3 = new HashSet<String>();
		set3.add("java");
        set3.add("servlet");
        set3.add("python");
        set3.add("Raspberry PI");
        display(set3);
        System.out.println("set1��set3�� ������");
        //�������� �ϰԵǸ� �������� set3�� ���� ���õȴ�.
        //set3.retainAll(set1);
        display(set3);
        System.out.println("set2�� set3�� ������");
        set2.addAll(set3);
        display(set2);
	}
	public static void display(Set<String> list) {
		System.out.println("=================");
		for(String data:list) {
			System.out.println(data);
		}
		System.out.println("������=>"+list.size());
	}
}
