package chap02;
//������ ����ȯ�� ���ؼ� ���캸��
//�ڵ�����ȯ�� ���������ȯ�� �ִ�.
public class TypeCastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ڵ�����ȯ
		byte b=100;
		short s=b;
		int i =s;
		long l=i;
		float f=l;
		double d=f;
		System.out.println(d);
		char c='a';
		int data = c;
		System.out.println(data);
		char c2=(char)data;
		System.out.println(c2);
		
		byte bytedata=(byte)128;
		System.out.println(bytedata);
	}

}
