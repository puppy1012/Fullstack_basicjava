package api.lang;

public class StringTest4 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2="Àç¹Õµû.";
		System.out.println("str1.startsWith(\"java\")"+str1.startsWith("java"));
		System.out.println("str1.startsWith(\"test\")"+str1.startsWith("test"));
		System.out.println("str1.endsWith(\"ing\")"+str1.endsWith("ing"));
		System.out.println("str1.endsWith(\"java\")"+str1.endsWith("test"));
		System.out.println("str1.contains(\"ja\")"+str1.contains("ja"));
		System.out.println("str1.contains(\"  \")"+str1.contains("  "));
		
		System.out.println("str1.substring(5)=>"+str1.substring(5));
		System.out.println("str1.substring(5,8)=>"+str1.substring(5,8));
		
		System.out.println("str1.replace('a','A')=>"+str1.replace('a','A'));
		System.out.println(str1);
	}
	
}
