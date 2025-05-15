package basic.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
//	public static void main(String[] args) {
//		try {
//			FileReader fr= new FileReader("test.txt");
//			while(true) {
//				int data= fr.read();
//				if(data==-1) {break;}
//				System.out.print((char)data);
//			}
//			
//			
//		} catch (FileNotFoundException e) {
//			System.out.println("Wrong excess");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			System.out.println("Wrong filetype");
//		}
//		
//	}
	public static void main(String[] args) throws FileNotFoundException, IOException {

		FileReader fr = new FileReader("test.txt");
		while (true) {
			int data = fr.read();
			if (data == -1) {
				break;
			}
			System.out.print((char) data);
		}

	}

}
