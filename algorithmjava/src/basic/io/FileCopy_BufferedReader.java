package basic.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//BufferedReader�� �̿��ؼ� ���� ����
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
		System.out.println("����Ƚ��=>"+count);
		System.out.println("����ð�=>"+(endTime-startTime));


	}
}
