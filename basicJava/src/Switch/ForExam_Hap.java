package Switch;
/*
 * 1���� 100���� ��,Ȧ����,¦����
 * 
 * �������
 * ����:
 * Ȧ����:
 * ¦����:
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
		System.out.println("����:"+total);
		System.out.println("Ȧ����:"+odd);
		System.out.println("¦����:"+even);
	}
}
