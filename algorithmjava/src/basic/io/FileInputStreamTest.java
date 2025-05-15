package basic.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//파일로부터 읽기 -byte단위로 읽기
public class FileInputStreamTest {
	public static void main(String[] args) {

		try {
			//1.파일 오픈(OS와 통신하면서 파일 리소스를 사용할 수 있도록 허가)
			//			------------------------------
			//			OS와 통신하거나 파일을 오픈하는 작업은 FileInputStream생성자에 구현
			FileInputStream fi = new FileInputStream("test.txt");
			FileInputStream fi2 = new FileInputStream("./src/test2.txt");
			while(true) {
				
			//api 변경해도 코드 실행
				int data= fi.read();
				if(data==-1) {
					break;
				}
//			System.out.println(data);
				System.out.print((char)data);
			}
			
		} catch (FileNotFoundException e) {//파일오픈할때 오류 발생
			// TODO Auto-generated catch block
			System.out.println("파일명이 틀렸습니다.");
		}catch(IOException e) {//파일 읽을때 오류발생
			System.out.println("파일읽기 실패");
		}
	}
}
