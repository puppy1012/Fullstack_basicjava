package basic.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//BufferedReader를 이용해서 파일 복사
public class FileCopy_BufferedReader {
	public static void main(String[] args) throws IOException {
		BufferedReader  br= new BufferedReader(new FileReader("./src/basic/io/FileReaderTest.java"));
		FileWriter fw = new FileWriter("./src/datafile/output4.txt");
		String data="";
		int count=0;
		long startTime=System.nanoTime();
		try  {
			
			while ((data = br.readLine())!=null) {
				fw.write(data);
//				System.out.println(data);
				count++;
			}
		} catch (IOException e) {
			System.out.println("Wrong excess");
		}
		long endTime= System.nanoTime();
		System.out.println("실행횟수=>"+count);
		System.out.println("실행시간=>"+(endTime-startTime));


	}
}
