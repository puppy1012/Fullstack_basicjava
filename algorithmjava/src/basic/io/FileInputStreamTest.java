package basic.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//���Ϸκ��� �б� -byte������ �б�
public class FileInputStreamTest {
	public static void main(String[] args) {

		try {
			//1.���� ����(OS�� ����ϸ鼭 ���� ���ҽ��� ����� �� �ֵ��� �㰡)
			//			------------------------------
			//			OS�� ����ϰų� ������ �����ϴ� �۾��� FileInputStream�����ڿ� ����
			FileInputStream fi = new FileInputStream("test.txt");
			FileInputStream fi2 = new FileInputStream("./src/test2.txt");
			while(true) {
				
			//api �����ص� �ڵ� ����
				int data= fi.read();
				if(data==-1) {
					break;
				}
//			System.out.println(data);
				System.out.print((char)data);
			}
			
		} catch (FileNotFoundException e) {//���Ͽ����Ҷ� ���� �߻�
			// TODO Auto-generated catch block
			System.out.println("���ϸ��� Ʋ�Ƚ��ϴ�.");
		}catch(IOException e) {//���� ������ �����߻�
			System.out.println("�����б� ����");
		}
	}
}
