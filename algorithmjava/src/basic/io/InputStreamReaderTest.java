package basic.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//InputStreamŬ���� �׽�Ʈ
//~~~InputStream�� �ֻ��� Ŭ����
public class InputStreamReaderTest {
	public static void main(String[] args) {
//		InputStream myin =System.in;
		InputStreamReader reader=new InputStreamReader(System.in);
		try {
			while(true) {
				
			//api �����ص� �ڵ� ����
			int data=reader.read();
			if(data==10) {
				break;
			}
//			System.out.println(data);
			System.out.print((char)data);
			}
		}catch(IOException e) {
			System.out.println("�Է¿���....");
			e.printStackTrace();
		}
	}
}
