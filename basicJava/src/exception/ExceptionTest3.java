package exception;
//try catch Finally�� ����
//�ڿ��ݳ�?
//���ܰ� �߻��ϰų� �߻������ʰų� ������ ����Ǿ���ϴ� ��ɹ��� finally�� �߰�
public class ExceptionTest3 {
	public static void main(String[] args) {
		try {
			//���ܹ߻� ���ɼ��� �ִ� �ڵ�
			System.out.println("try�� ����");
			System.out.println(10/0);
			System.out.println("try�� ����");
		}catch(ArithmeticException e) {
			System.out.println("���ܹ߻�");
		}finally {
			System.out.println("������ ����Ǵ� �ڵ� - �ڿ��ݳ�");
		}
	}
}
