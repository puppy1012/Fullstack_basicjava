package basic.io;
//��������ϱ� -3�ܰ�

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest {
	public static void main(String[] args) {
		FileWriter fw= null;
		try {
			//1. ���� ����
			//=> ����� ���ϰ� ����
			//������ �������������� ������ �����ؼ� �۾�
			//������ ����� �⺻�� �����
			//������ʰ� append�ϰ������ append�� �����ϴ� �����ڸ� ����ؾ��Ѵ�
			fw = new FileWriter("./src/datafile/output2.txt",true);//true���� append�� ����ȴ�
			//2.���� ������
			//=> write �޼ҵ�� newline�� ���Ե��� ����
			//=> ��½�Ʈ���� ���ο� ���Ͽ� ���� ���� �����͸� �׾Ƴ��� ��
			fw.write("�������ϽǷ���?\n");
			fw.write("this is spaghetti\n");
			fw.write("java programming 123");
			//3. ������ �ڿ��� �ݳ�
			//=> ���µ� ������ �ݰ� OS���� �����ߴ� ���ϸ��ҽ��� �ݳ��ؾ�
			// ��� ������ ���Ͽ� ��������.
		}catch(IOException e) {
			System.out.println("��� ����");
		}finally {
			//3. ������ �ڿ��� �ݳ�
			//=> ���µ� ������ �ݰ� OS���� �����ߴ� ���ϸ��ҽ��� �ݳ��ؾ�
			// ��� ������ ���Ͽ� ��������.
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("�߸��� ����õ�");
			}
		}
	}
	public static void ZZZ() throws IOException {
		FileWriter fw= null;
		fw=new FileWriter("output.txt");
		fw.write("�������Ͻ�?");
		fw.close();
	}
}
