package basic.io;
//파일출력하기 -3단계

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest {
	public static void main(String[] args) {
		FileWriter fw= null;
		try {
			//1. 파일 오픈
			//=> 출력할 파일과 연결
			//파일이 존재하지않으면 파일을 생성해서 작업
			//파일의 출력의 기본은 덮어쓰기
			//덮어쓰지않고 append하고싶으면 append를 지원하는 생성자를 사용해야한다
			fw = new FileWriter("./src/datafile/output2.txt",true);//true사용시 append가 실행된다
			//2.파일 엑세스
			//=> write 메소드는 newline이 포함되지 않음
			//=> 출력스트림의 내부에 파일에 쓰기 위한 데이터를 쌓아놓은 것
			fw.write("젠존제하실래오?\n");
			fw.write("this is spaghetti\n");
			fw.write("java programming 123");
			//3. 파일의 자원을 반납
			//=> 오픈된 파일을 닫고 OS에게 점유했던 파일리소스를 반납해야
			// 모든 내용이 파일에 쓰여진다.
		}catch(IOException e) {
			System.out.println("출력 오류");
		}finally {
			//3. 파일의 자원을 반납
			//=> 오픈된 파일을 닫고 OS에게 점유했던 파일리소스를 반납해야
			// 모든 내용이 파일에 쓰여진다.
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("잘못된 저장시도");
			}
		}
	}
	public static void ZZZ() throws IOException {
		FileWriter fw= null;
		fw=new FileWriter("output.txt");
		fw.write("젠존제하쉴?");
		fw.close();
	}
}
