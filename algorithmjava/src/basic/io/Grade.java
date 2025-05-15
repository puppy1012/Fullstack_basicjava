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
		/* �̰��� ���α׷��� �ϼ��Ͻʽÿ�. */
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		int total = 0;
		int count = 0;
		String line="";
		while ((line=br.readLine())!=null) {
			String[] student = line.split(",");
			System.out.println(student[0] + "�� ������ " + student[1] + "�� �Դϴ�.");
			total += Integer.parseInt(student[1]);
			count++;
		}
		System.out.println("����� ������ " + total + "�� �Դϴ�.");
		System.out.println("����� ����� " +(total / count) + "�� �Դϴ�.");
		br.close();
	}

}