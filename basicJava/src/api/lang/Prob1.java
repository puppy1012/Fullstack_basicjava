package api.lang;
public class Prob1 {
    public static void main(String[] args) {
        System.out.println("���ڿ��� Ư������ �����ϴ� �׽�");
        System.out.println("-------------Sample 1 --------------");
        String str1=myReplace("hello world",'l','*');
        System.out.println(str1);
        
        System.out.println("-------------Sample 2 --------------");
        String str2=myReplace("hello world",' ','-');
        System.out.println(str2);
        
        System.out.println("-------------Sample 3 --------------");
        String str3=myReplace("hello world",'a','*');
        System.out.println(str3);
        

    }
    public static String myReplace(String str, char oldChar, char newChar){
        // �� �κ��� �����Ͻÿ�.
    	//��ȯ�� String����
    	String result="";
    	for(int i=0;i<str.length();i++) {
    		//�񱳿����� ���� char��ȯó��
    		char chr=str.charAt(i);
    		if(chr==oldChar) {
    			result+=newChar;
    		}else {
    			result+=chr;
    		}
    	}
		return result;
    }
    
}