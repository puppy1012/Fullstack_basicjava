package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * ó���ؾ��ϴ� Exception�� ���� ���
 * ������ ���ܿ� ���� �ٸ��� ó���ϰ� ���� ��� ���� catch���� �̿��Ѵ�.
 * =>���� catch���� �̿��ϴ� ��� ����Ŭ������ �ش��ϴ� Exception�� ���� �Ʒ��ʿ� ������.
 */
public class ExceptionTest5 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		try {
			System.out.println("����");
			System.out.println("����");
			System.out.println("��������:");
			int num=key.nextInt();
			System.out.println(10/0);
			if(num%2==0) {
				System.out.println(args[0]);
			}else {
				String str=null;
				System.out.println(str.length());
			}
		}catch(ArithmeticException e) {
			System.out.println("0���� ������ �ȵǿ�");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�����Ű���������~~");
		}catch(InputMismatchException e) {
			System.out.println("���ڸ� �Է��ϼ���~");
		//�θ�Ÿ��
		}catch(Exception e) {
			System.out.println("��Ÿ����ó��");
		}finally {
			System.out.println("�����ǽ���");
		}
	}
}
