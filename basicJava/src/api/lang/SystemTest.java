package api.lang;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class SystemTest {
	public static void main(String[] args) {
		//ǥ���Է°� ǥ������� ���
		System.out.println(Math.PI);
		double mypi = Math.PI;
		System.out.println(mypi);
		InputStream myin=System.in;
		PrintStream myout = System.out;
		
		myout.println("���������� ������ �ְ� �۾��� �� �ִ�");
		Scanner key = new Scanner(myin);
		System.out.println("�� �Է�:");
		int data= key.nextInt();
		System.out.println("�Է��� ����:"+data);
		long time1=System.currentTimeMillis();
		long nanotime1=System.nanoTime();
		
		for(int i=0;i<data;i++) {
//			System.out.println("i="+i);
			if(i==10000) {
				System.exit(0);
			}
		}
		long time2=System.currentTimeMillis();
		long nanotime2=System.nanoTime();
		System.out.println(time2-time1);
		System.out.println(nanotime2-nanotime1);
	}
}
