package basic.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//InputStream클래스 테스트
//~~~InputStream의 최상위 클래스
public class InputStreamReaderTest {
	public static void main(String[] args) {
//		InputStream myin =System.in;
		InputStreamReader reader=new InputStreamReader(System.in);
		try {
			while(true) {
				
			//api 변경해도 코드 실행
			int data=reader.read();
			if(data==10) {
				break;
			}
//			System.out.println(data);
			System.out.print((char)data);
			}
		}catch(IOException e) {
			System.out.println("입력오류....");
			e.printStackTrace();
		}
	}
}
