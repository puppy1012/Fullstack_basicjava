package datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * src1.txt파일과 src2.txt파일을 비교해서 대소문자가 정확하게 일치하는 문자열만 ArrayList에 담아서 ㅣ턴하는
 * compareFile메소드를 구현하기
 * [메소드에서 작업]
 * 1.BufferedReader와 FileReader를 이용해서 src1.txt파일과 src2.txt파일을 읽기-출력해보기
 * 2.읽은 각각의 내용을 문자열 비교하기
 * 3.문자열이 대소문자까지 일치하면 ArrayList에 저장하기
 * 
 * [main메소드 작업]
 * compareFile을 호출하고 받은 ArrayList의 내용을 출력하기
 */
public class Exam2 {
	public static void main(String[] args) {
		try (BufferedReader br1 = new BufferedReader(new FileReader("./src/datafile/src1.txt"));
				BufferedReader br2 = new BufferedReader(new FileReader("./src/datafile/src2.txt"));) {
			ArrayList<String> list = compareFile(br1, br2);

			printlist(list);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static ArrayList<String> compareFile(BufferedReader br1, BufferedReader br2) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> returnlist = new ArrayList<String>();
		String line1, line2;

		while (true) {
			line1 = br1.readLine();
			line2 = br2.readLine();
			if (line1 == null || line2 == null) {
				break;
			}
			if (line1.equals(line2)) {
				returnlist.add(line1);
			}
		}

		return returnlist;
	}
	public static void printlist(ArrayList<String> list) {
		System.out.println("일치:");
		for(String s:list) {
			System.out.println(s);
		}
	}

}
