package exception;

import java.io.FileReader;
import java.io.IOException;
import java.net.Socket;
import java.sql.DriverManager;
import java.util.Scanner;

//���߽����� �߻��� �� �ִ� ������ ������
public class ExceptionTest1 {
	public static void main(String[] args) throws IOException {
		//1.�����ڰ� �Ǽ��� �� �ִ� �κ�
		System.out.println("*********���α׷�����**********");
		int[] myarr=new int[3];//index : 0~length-1
//		System.out.println(myarr[2]); //ArrayIndexOutofBoundsException
//		System.out.println(10/0);//ArithmethicException
		String str= null;//NullPointerException
//		str.length();
		System.out.println("*********���α׷� ������*********");
		//2. �ܺο����̳� ������� �Ǽ��� �߻��� �� �ִ� Exception
		Scanner key = new Scanner(System.in);
		System.out.println("���Է�(�����Է�):");
		int data =key.nextInt();
		System.out.println("����ڰ� �Է��� ��=>"+data);
		System.out.println("���� working directory: " + System.getProperty("user.dir"));

		//3. API���� �����Ǵ� �޼ҵ带 ����Ҷ� �߻��ϴ� ����
		//=> �����Ͻ����� ���ܸ� üũ�ϴ� ���
		//=> �޼ҵ峪 ������ ����ο� XXXException�� throw�ϴ� �ڵ尡 �ִ� �͵��� �� �޼ҵ带 ����ϴ� �߿�
		//	 XXXException�� �߻��� ���ɼ��� �ִٴ� �ǹ�
		//	 RuntimeException�� ���� Exception�� �ƴ� ��� ���� ó���� �ϵ��� ���������� �߻���Ų��.
		//=> RuntimeException�����̰ų� �ƴϰų� ���ܹ߻����ɼ��� �ִ� �޼ҵ带 ����ϴ� ��� ��� ����ó���� �ϴ� ���� �Ϲ���
		FileReader fr= new FileReader("test.txt");
		System.out.println((char)fr.read());
		System.out.println(Integer.parseInt("1000")+200);
//		DriverManager.getConnection("");
//		Socket sock=new Socket("",5000);
	}
}
