package recursion;

public class RecursionTest1 {
	public int test(int count) {
		if(count==5000) {
			return -1;
		}
//		if(count>10) {
//			return; //void �޼ҵ忡�� return;�ϸ� �޼ҵ� ������ �����ϰ� ȣ���� ������ �ǵ��ư���.
//		}
		System.out.println("��;˰���"+count);
		
		return test(count+1);
		
	}
	
	public static void main(String[] args) {
		RecursionTest1 obj= new RecursionTest1();
		obj.test(0);
		System.out.println("����");
	}
}
