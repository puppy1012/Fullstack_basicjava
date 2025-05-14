package api.lang;
//데이터의 변환
public class StringTest5 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("java mysql linux html5 css");
		
		//1. String -> byte[]
		byte[] arr1 = str1.getBytes();
		for(byte b:arr1) {
			System.out.println(b);
		}
		System.out.println("=======================");
		//2. String ->char[]
		char[] arr2= str1.toCharArray();
		for(char c:arr2) {
			System.out.println(c);
		}
		System.out.println("=======================");
		
		//3. String ->String[]
		String[] arr3= str2.split(" ");
		for(String s:arr3) {
			System.out.println(s);
		}
		System.out.println("=======================");
		
		//4.기본형데이터 ->String
		String data = String.valueOf(100);
		data=String.valueOf(100.123);
		data=100+"";
		data=10.5+"";
		System.out.println(data);
	}
}
