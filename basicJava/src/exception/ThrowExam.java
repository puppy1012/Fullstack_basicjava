package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowExam {
	// throws�� �̿��ؼ� ���ܸ� ȣ���Ѱ����� ó���ϵ��� �۾��ϼ���
	public void test()throws Exception {
		Scanner key = new Scanner(System.in);
		String str = null;
		System.out.println("�����Է�:");
		try {
			int data = key.nextInt();
			System.out.println("�Է��� ���ڴ� :" + data);

			System.out.println(str.length());
//		}
		}catch(InputMismatchException e) {
			throw new InputMismatchException();
		}
		catch(NullPointerException e) {
			throw new NullPointerException();
		}
		finally {
			key.close();
		}
		
	}

	public static void main(String[] args) {
		// ȣ���Ѱ����� ���ܸ� ó���մϴ�.
		ThrowExam obj = new ThrowExam();
		try {
			obj.test();
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