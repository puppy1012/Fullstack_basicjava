package exception;

import javax.swing.JOptionPane;

public class ExceptionTest2 {
	public static void main(String[] args) {
		try {
			//���ܹ߻� ���ɼ��� �ִ� �ڵ�
			System.out.println("try�� ����");
			System.out.println(10/0);
			System.out.println("try�� ����");
		}catch(ArithmeticException e) {
			//���ܰ� �߻��ϸ� ó���� ������ ����
//			JOptionPane.showMessageDialog(null, "���ܰ� �߻��ƽ��ϴ�.");
			System.out.println("���ܹ߻�");
			//���ܸ޼���
			System.out.println("���ܸ޽���:"+e.getMessage());
			//�����ڰ� �����߿� ���� ���� ����ϴ� ����ó���ڵ�
			//���ܸ� �����ؼ� �ֿܼ� ���ܰ� �߻��� �޼ҵ��� ���γѹ��� ���
			//��, ��� ���ܰ� �߻��ϴ��� ��ġ�� Ȯ�� �� �� �ִ�.
			e.printStackTrace();
		}
	}
}
