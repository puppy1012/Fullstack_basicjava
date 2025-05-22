package recursion;

public class RecursionExam1 {
	public static void main(String[] args) {
		int result= length("java");
		System.out.println("문자열의 길이=>"+result);
	}
	public static int length(String str) {
		//String 타입이 들어와서 재귀함를 통해 
		if(str.equals("")) {
			return 0;
		}
		return  1+length(str.substring(1));
	}
}
