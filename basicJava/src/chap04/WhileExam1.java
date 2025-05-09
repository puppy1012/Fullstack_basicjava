package chap04;

public class WhileExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hap=0;
		int oddhap=0;
		int evenhap=0;
		int i=1;
		while(i<=100) {
			hap+=1;
			if(i%2==0) {
				evenhap+=i;
			}else {
				oddhap+=i;
			}
			i+=1;
		}
		System.out.println("ÃÑÇÕ = "+hap);
		System.out.println("È¦¼öÇÕ = "+oddhap);
		System.out.println("Â¦¼öÇÕ= "+evenhap);
	}
}
