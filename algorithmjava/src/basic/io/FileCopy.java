package basic.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		FileWriter fw = null;
		int data;
		int count=0;
		long startTime=System.nanoTime();
		try  {
			fr = new FileReader("./src/basic/io/FileReaderTest.java");
			fw = new FileWriter("./src/datafile/output3.txt");
			while ((data = fr.read()) != -1) {
				fw.write(data);
//				System.out.print((char)data);
				count++;
			}
		} catch (IOException e) {
			System.out.println("Wrong excess");
		}
		long endTime= System.nanoTime();
		System.out.println("실행횟수=>"+count);
		System.out.println("실행시간=>"+(endTime-startTime));
		fr.close();
		fw.close();

	}
}
