package api.lang;
//String ��ü�� ��
//	-���ͷ��� ����
//	-new�����ڸ� �̿��ؼ� ����
public class StringTest2 {
	public static void main(String[] args) {
		String str1= new String("java");
		String str2= new String("java");
		String str3="java";
		String str4="java";
		
		if(str1==str2) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		System.out.println("==============================");
		if(str3==str4) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		System.out.println("==============================");
		if(str1==str4) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		System.out.println("==============================");
	}
}
