package recursion;

public class RecursionExam1 {
	public static void main(String[] args) {
		int result= length("java");
		System.out.println("���ڿ��� ����=>"+result);
	}
	public static int length(String str) {
		//String Ÿ���� ���ͼ� ����Ը� ���� 
		if(str.equals("")) {
			return 0;
		}
		return  1+length(str.substring(1));
	}
}
