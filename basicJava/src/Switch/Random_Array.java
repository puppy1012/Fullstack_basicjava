package Switch;

import java.util.ArrayList;
import java.util.Random;

public class Random_Array {
	public static void main(String[] args) {
		Random rand= new Random();
//		ArrayList<Integer> int_list=new ArrayList<>();
//		for(int i=0;i<5;i++) {
//			int_list.add(rand.nextInt(0, 100));
//		}
//		for(int j=0;j<5;j++) {
//			int num=int_list.get(j);
//			if(num%2==0) {
//				System.out.println(j+"�����->"+num+"¦��");
//			}else {
//				System.out.println(j+"�����->"+num+"Ȧ��");
//			}
//		}
		int[] int_list = new int[5];
		for(int i=0;i<5;i++) {
			int_list[i]=rand.nextInt(100);
			if(int_list[i]%2==0) {
				System.out.println(i+"�����->"+int_list[i]+"¦��");
			}else {
				System.out.println(i+"�����->"+int_list[i]+"Ȧ��");
			}
		}

	}
}
