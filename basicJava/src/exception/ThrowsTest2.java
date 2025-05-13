package exception;

import java.io.FileNotFoundException;

import javax.swing.JOptionPane;

public class ThrowsTest2 {
	public static void main(String[] args) {
		//울산의 개발자가 메소드를 호출
		ThrowTest obj= new ThrowTest();
		obj.test("test3.txt");
		try {
			obj.test2("test2.txt");
			
		}catch(FileNotFoundException e) {
			JOptionPane.showMessageDialog(null,"파일명이 틀렸습니다.");
		}
	}
}
