package basic.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * BufferedReader
 * �߰������ �����ϴ� IOŬ����
 * =>����� �۾��� ȿ���� ���̱� ���ؼ� ���� �����͸� �ӽ÷� ������ �� �ִ� ���۶�� ���� ����Ұ� ����
 * =>���� ������ ���ۿ� �ְ� �ѹ��� ó���ϴ� ����� �����Ѵ�.
 * =>BufferReader�� �̿��ؼ� ���Ͽ� ������ �����͸� ���� �� �����Ƿ�
 * 	�׻� FileReader�� �Բ� ����Ѵ�.
 */
public class BufferedReaderTest {
	public static void main(String[] args) {
//		FileReader fr=null;
		BufferedReader br=null;
		try {
//			fr= new FileReader("src/datafile/test.txt");
//			br= new BufferedReader(fr);//FileReader�� �̿��ؼ� BufferedReader�� ����
			br= new BufferedReader(new FileReader("src/datafile/test.txt"));
			while(true) {
				String line= br.readLine();
				if(line==null){//read�޼ҵ�� ASCII�� ��ȯ�ϹǷ� ���� ������ ������ -1�� �ۿ��Ѵ�.
					break;
					
				}
			System.out.println(line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
