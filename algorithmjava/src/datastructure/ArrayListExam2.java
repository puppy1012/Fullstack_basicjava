package datastructure;

import java.util.ArrayList;

/*
 * 배열을 arraylist로 변환해서 리턴하는 메소드 정의
 * 메소드명 -changeArrayList
 * 매개변수 -String[] arr
 * 리턴타입은 ArrayList<String>
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
