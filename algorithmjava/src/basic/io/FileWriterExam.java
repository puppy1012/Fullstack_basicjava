package basic.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExam {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("gugudan.txt",true);
			for (int i = 1; i < 10; i++) {
				for (int j = 1; j < 10; j++) {
					String str = i + "*" + j + "=" + i * j + "\n";
					fw.write(str);
				}
				fw.write("=========================\n");
			}

		} catch (IOException e) {
			System.out.println("출력 오류");
		} finally {

			try {
				if(fw!=null) {fw.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("잘못된 저장시도");
			}
		}
	}
}
