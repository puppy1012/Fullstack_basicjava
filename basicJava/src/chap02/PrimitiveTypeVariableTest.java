package chap02;
//�⺻���� ���ͷ�
public class PrimitiveTypeVariableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ڰ� �Է��ϴ� ���� ���ͷ��̶� �Ѵ�.
		/*
		 * ������
		 * ������ ���ͷ��� �⺻Ÿ���� int
		 * int i=10
		 * 	   - --
		 * 	   ���� ���ͷ�
		 * 
		 */
		byte b=127;
		short s=32767;
		int i=2147483647;
		long l=2147483647L;//int�� ����� long���� �����ؾ��Ѵ�.
							//L�̳�l�� �߰��ؼ� long���� ���ͷ��� ����
		System.out.println(b);
		
		//[�Ǽ���]
		//�Ǽ��� ���ͷ��� �⺻Ÿ���� double
		float f=10.5f;
		double d=10;
		System.out.println(d/3);
		//double���� ������ �Ҵ�ǹǷ� double�������� ���ͷ��� ����ȴ�.
		int data=10;
		double result=data/3;
		System.out.println(result);
		//���꿡 ���Ե� ���� double�� ����Ǹ鼭 ��� ������ double������ �ȴ�.
		System.out.println((double)35/100);
		
		//[���ڿ�]
		//char�� ���ڸ� �����ϱ� ���� ������ Ÿ��
		//���ͷ��� ��������ǥ�� ǥ��
		char c='a';
		char c2 ='��';
		System.out.println(c);
		//char�� Ÿ���� int������ ��ȯ�� �����ϴ�
		//int=char
		int chardata='c';
		//���� c�� ��� 'a'�� int������ ���� ��ȯ
		System.out.println((int)'z');
		System.out.println((int)'A');
		System.out.println((int)'Z');	
		
		//[boolean]
		//yes or no,on/off
		//boolean���ͷ��� true/false
		boolean bool=true;
		System.out.println(bool);
		
		
	}

}
