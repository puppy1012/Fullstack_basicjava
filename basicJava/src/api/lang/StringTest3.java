package api.lang;
//StringŬ������ �߿��� �޼ҵ� ���캸�� -1
public class StringTest3 {
	public static void main(String[] args) {
		String str1=new String("java programming");
		String str2="��մ�.";
		System.out.println("str1.charAt(1)=>"+str1.charAt(1));
		System.out.println("str1.concat(str2)=>"+str1.concat(str2));
		System.out.println("str1.indexOf('a')=>"+str1.indexOf('a'));
		System.out.println("str1.indexOf(\"a\")=>"+str1.indexOf("a"));
		System.out.println("str1.indexOf(\"��\")=>"+str1.indexOf("��"));
		System.out.println("str1.indexOf(\"pr\",0)=>"+str1.indexOf("pr",0));

		System.out.println("str1.indexOf(\"pr\",8)=>"+str1.indexOf("pr",8));
		System.out.println("str1.lastIndexOf('a')=>"+str1.lastIndexOf('a'));
		System.out.println("str1.lastIndexOf(\"a\")=>"+str1.lastIndexOf("a"));
		
		System.out.println("str1.length()=>"+str1.length());
		
		System.out.println("str1.equals(\"java programming\"))=>"+str1.equals("java programming"));
		System.out.println("str1.equals(\"Java programming\"))=>"+str1.equals("Java programming"));
		System.out.println("str1.equalsIgnoreCase(\"java programming\"))=>"+str1.equalsIgnoreCase("java programming"));
		
		System.out.println("str1.equalsIgnoreCase(\"Java programming\"))=>"+str1.equalsIgnoreCase("Java programming"));

		//��ҹ��� ��ȯ
		System.out.println("str1.toUpperCase()=>"+str1.toUpperCase());
		System.out.println("����=>"+str1);
		System.out.println("str1.toLowerCase()=>"+str1.toLowerCase());

	}
}
