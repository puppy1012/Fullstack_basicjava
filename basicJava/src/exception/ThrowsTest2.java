package exception;

import java.io.FileNotFoundException;

import javax.swing.JOptionPane;

public class ThrowsTest2 {
	public static void main(String[] args) {
		//����� �����ڰ� �޼ҵ带 ȣ��
		ThrowTest obj= new ThrowTest();
		obj.test("test3.txt");
		try {
			obj.test2("test2.txt");
			
		}catch(FileNotFoundException e) {
			JOptionPane.showMessageDialog(null,"���ϸ��� Ʋ�Ƚ��ϴ�.");
		}
	}
}
