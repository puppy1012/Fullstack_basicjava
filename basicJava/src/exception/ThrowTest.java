package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JOptionPane;

//throws�� �̿��ؼ� ���ܸ� ȣ���Ѱ����� �ѱ��
public class ThrowTest {
	//1.�޼ҵ� ������ ���ܸ� ó���ϱ� ���� ��� �� �ϳ��� ���ܰ� �߻��� ������ ���ܸ� ó���ϱ�
	// => ȣ���� ������ ���ܰ� �߻��Ѱ��� �� �� ����.
	// => �̹� ���ܿ� ���� ó���� ���� ���·� ������ �ǹǷ� ȣ���Ѱ����� �پ��ϰ� ó���ϱ� ��ƴ�.
	public static void test(String filename) {
		try {
			FileReader fr= new FileReader(filename);
		}catch(FileNotFoundException e) {
			System.out.println("���ϸ��� Ʋ�Ƚ��ϴ�");
		}

	}
	//2. ���ܰ� �߻��� ������ ���ܸ� ó�������ʰ� ȣ���� ������ ���ܸ� ó���ϵ��� �ϱ�
	// => ���ܰ� �߻��Ǵ��� ���ܰ� �߻��� ������ ó�������ʰ� ȣ��� ������ ���ܸ� ������
	// => �޼ҵ带 ȣ���Ѱ����� ���ܰ� �߻��ϹǷ� �پ��ϰ� ó���� �� �ִ�.
	public void test2(String filename)throws FileNotFoundException{
		FileReader fr= new FileReader(filename);
	}
	//2. ���ܰ� �߻��� ������ ���ܸ� ó�������ʰ� ȣ���Ѱ����� ���ܸ� ó���ϵ��� �ϱ�
	public static void main(String[] args) {
		//Aȸ���� �����ڰ� ���
		ThrowTest obj=new ThrowTest();
		obj.test("test2.txt");
		try {
			obj.test2("test2.txt");
			
		}catch(FileNotFoundException e) {
			JOptionPane.showMessageDialog(null,"���ϸ��� Ʋ�Ƚ��ϴ�.");
		}
		
	}
}
