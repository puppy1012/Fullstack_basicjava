package datastructure;

import java.util.ArrayList;

/*
 * �迭�� arraylist�� ��ȯ�ؼ� �����ϴ� �޼ҵ� ����
 * �޼ҵ�� -changeArrayList
 * �Ű����� -String[] arr
 * ����Ÿ���� ArrayList<String>
 */
public class ArrayListExam2 {
	public static void main(String[] args) {
		String[] strarr = { "java", "servlet", "jsp", "spring" };
		ArrayList<String> returnlist = new ArrayList<String>();
		returnlist = ChangeArrayList(strarr);
		for (String s : returnlist) {
			System.out.println(s);
		}
	}

	public static ArrayList<String> ChangeArrayList(String[] arr) {
		ArrayList<String> list = new ArrayList<String>();
		for (String s : arr) {
			list.add(s);
		}
		return list;

	}
}
