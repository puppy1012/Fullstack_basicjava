package Switch;
/*
 * 1부터 100까지 합,홀수합,짝수합
 * 
 * 출력형식
 * 총합:
 * 홀수합:
 * 짝수합:
 */
public class ForExam_Hap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0,even=0,odd=0;
		for(int i=1;i<101;i++) {
			total+=i;
			if(i%2==0) {
				even+=i;
			}else {
				odd+=i;
			}
		}
		System.out.println("총합:"+total);
		System.out.println("홀수합:"+odd);
		System.out.println("짝수합:"+even);
	}
}
