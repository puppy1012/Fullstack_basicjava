package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * �Ʒ� �ڵ忡���� NullPointerException�� �߻��ϰ�
 * ����ڰ� � ���� �Է��ϳĿ� ���� ���ڸ� �Է��ϴ� ��� InputMismatchException�� �߻��մϴ�.
 * - Exception�� �߻��ϴ� ��� ���� �޽����� ��µ� �� �ֵ��� �ڵ带 �߰��ϼ���.
 * - Exception�� �߻��ϰų� �߻����� �ʰų� ������ "�Ϸ�"��� �޽����� ��µǵ��� �ڵ带 �߰��ϼ���. 
 */
public class ExceptionExam2 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String str = null;
		try {
			System.out.println("�����Է�:");
			int data = key.nextInt();
			System.out.println("�Է��� ���ڴ� :" + data);
			System.out.println(str.length());
		} catch (InputMismatchException e) {
			System.out.println("�߸��� �Է°��Դϴ�.");
		} catch (NullPointerException e) {
			System.out.println("Null���Դϴ�.");
		} catch(Exception e) {
			System.out.println("��Ÿ����");
		}
		finally {
			System.out.println("�Ϸ�");
		}
	}
}