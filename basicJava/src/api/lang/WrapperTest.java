package api.lang;

public class WrapperTest {
	public static void main(String[] args) {
//		Integer inobj = new Integer(1000);
		Integer in=100;//5.0���� ���� -����ڽ�
						//�����Ϸ��� �ڵ����� int�����͸� Integer��ü�� �����ϴ� �۾��� ����
		test(10000);
		
		int data= 10000+Integer.parseInt("100");
		System.out.println(data);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println("Character.isUpperCase('a')=>"+Character.isUpperCase('a'));
		System.out.println(Character.isAlphabetic(67));
		System.out.println(Character.toUpperCase('a'));
	}
	public static void test(Integer data) {
		//�����ڽ� - �����Ϸ��� �������� Integer��ü�� ���� intValue�� �����Ͽ� ����
		int result=100+data;
		System.out.println(result);
	}
}
