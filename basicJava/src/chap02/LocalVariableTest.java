package chap02;



/*
 * ���ú���(��������)�� Ư¡
 * 1.���������� ����ϱ����� �ݵ�� �ʱ�ȭ�� �ؾ��Ѵ�.
 */
public class LocalVariableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		int num;
		System.out.println("i="+i);
		{
			int j=100;
		}
		int j=200;
		System.out.println("j="+j);
	}

}
