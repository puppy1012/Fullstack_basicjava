package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * ����ó����������
 * ����ڰ� ������ �Է��ϸ� �Է°��� ���������� ��µǰ�
 * ���ڸ� �Է��ϸ� "�߸��Է��߽��ϴ�."�޽����� ��µɼ� �ֵ��� ����
 * ����
 */
public class ExceptionExam1 {
	public static void main(String[] args) {
		Scanner key= new Scanner(System.in);
		try {
			System.out.println("�����Է�:");
			int data=key.nextInt();
			System.out.println("�Է°�:"+data);
			//ArithmeticException	���(����) ��� �� ����
			//InputMismatchException	����ڰ� �Է��� ���� ���� Ÿ�԰� �ٸ� ��
		}catch(InputMismatchException e){
			System.out.println("�߸��Է��߽��ϴ�.");
		}
	}
}
