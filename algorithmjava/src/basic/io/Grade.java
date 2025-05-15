package basic.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Grade {

	public static void main(String args[]) throws IOException {
		Grade grade = new Grade();
		String fileName = "./src/datafile/score.txt";
		grade.printGrade(fileName);

	}

	public void printGrade(String fileName) throws IOException {
		/* 이곳에 프로그램을 완성하십시오. */
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		int total = 0;
		int count = 0;
		String line="";
		while ((line=br.readLine())!=null) {
			String[] student = line.split(",");
			System.out.println(student[0] + "의 점수는 " + student[1] + "점 입니다.");
			total += Integer.parseInt(student[1]);
			count++;
		}
		System.out.println("모두의 총점은 " + total + "점 입니다.");
		System.out.println("모두의 평균은 " +(total / count) + "점 입니다.");
		br.close();
	}

}