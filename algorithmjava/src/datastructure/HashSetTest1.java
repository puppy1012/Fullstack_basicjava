package datastructure;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTest1 {
	public static void main(String[] args) {
		//1.HashSet�� ����
		//2. HashSet�� ������ �߰�
		//3.HashSet�� ����� ����� ����
		//4. ��絥���� ���
		HashSet<String> set=new HashSet<String>();
		set.add("�ڹ�");
		set.add("����");
		set.add("������");
		set.add("�ȵ���̵�");
		set.add("�ڹ�");
		display(set);
		System.out.println(set.contains("������"));
		
	}
	public static void display(Set<String> list) {
		System.out.println("=================");
		for(String data:list) {
			System.out.println(data);
		}
		System.out.println("������=>"+list.size());
	}
}
