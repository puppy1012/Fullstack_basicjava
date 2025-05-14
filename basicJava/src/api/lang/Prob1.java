package api.lang;
public class Prob1 {
    public static void main(String[] args) {
        System.out.println("문자열에 특정문자 변경하는 테스");
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
        // 이 부분을 구현하시오.
    	//반환용 String변수
    	String result="";
    	for(int i=0;i<str.length();i++) {
    		//비교연산을 위한 char변환처리
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