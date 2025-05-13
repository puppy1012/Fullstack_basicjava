package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowExam {
	// throws를 이용해서 예외를 호출한곳에서 처리하도록 작업하세요
	public void test()throws Exception {
		Scanner key = new Scanner(System.in);
		String str = null;
		System.out.println("숫자입력:");
		try {
			int data = key.nextInt();
			System.out.println("입력한 숫자는 :" + data);

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
		// 호출한곳에서 예외를 처리합니다.
		ThrowExam obj = new ThrowExam();
		try {
			obj.test();
		} catch (InputMismatchException e) {
			System.out.println("잘못된 입력값입니다.");
		} catch (NullPointerException e) {
			System.out.println("Null값입니다.");
		} catch(Exception e) {
			System.out.println("기타예외");
		}
		finally {
			System.out.println("완료");
		}

	}

}