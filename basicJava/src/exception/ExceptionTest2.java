package exception;

import javax.swing.JOptionPane;

public class ExceptionTest2 {
	public static void main(String[] args) {
		try {
			//예외발생 가능성이 있는 코드
			System.out.println("try블럭 시작");
			System.out.println(10/0);
			System.out.println("try블럭 종료");
		}catch(ArithmeticException e) {
			//예외가 발생하면 처리할 문장을 정의
//			JOptionPane.showMessageDialog(null, "예외가 발생됐습니다.");
			System.out.println("예외발생");
			//예외메세지
			System.out.println("예외메시지:"+e.getMessage());
			//개발자가 개발중에 가장 많이 사용하는 예외처리코드
			//예외를 추적해서 콘솔에 예외가 발생한 메소드의 라인넘버를 출력
			//즉, 어디서 예외가 발생하는지 위치를 확인 할 수 있다.
			e.printStackTrace();
		}
	}
}
