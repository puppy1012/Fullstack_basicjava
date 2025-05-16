package datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * src1.txt���ϰ� src2.txt������ ���ؼ� ��ҹ��ڰ� ��Ȯ�ϰ� ��ġ�ϴ� ���ڿ��� ArrayList�� ��Ƽ� �����ϴ�
 * compareFile�޼ҵ带 �����ϱ�
 * [�޼ҵ忡�� �۾�]
 * 1.BufferedReader�� FileReader�� �̿��ؼ� src1.txt���ϰ� src2.txt������ �б�-����غ���
 * 2.���� ������ ������ ���ڿ� ���ϱ�
 * 3.���ڿ��� ��ҹ��ڱ��� ��ġ�ϸ� ArrayList�� �����ϱ�
 * 
 * [main�޼ҵ� �۾�]
 * compareFile�� ȣ���ϰ� ���� ArrayList�� ������ ����ϱ�
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
		System.out.println("��ġ:");
		for(String s:list) {
			System.out.println(s);
		}
	}

}
