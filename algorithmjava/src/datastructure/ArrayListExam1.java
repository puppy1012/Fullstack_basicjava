package datastructure;

import java.util.ArrayList;

/*
 * 1���� 100���� ������ 5���� �̿��ؼ� ArrayList�� �����ϰ� ex(58 88 79 100 49)
 * 58 --(¦��)
 * 88 --(¦��)
 * 79 --(Ȧ��)
 * 
 * 
 * ����:__
 * ���:__
 */
public class ArrayListExam1 {
	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		int total=0;
		String name="";
		for(int i=0;i<5;i++) {
			int num=(int) (Math.random()*100+1);
			if(num%2==0) {
				name="¦��";
			}else {
				name="Ȧ��";
			}
			System.out.println(num+"---"+name);
			list.add(num);
			total+=num;
			
		}
//		System.out.println("����: " + list.stream().mapToInt(Integer::intValue).sum());
		System.out.println("����:"+total);
		System.out.println("���:"+total/list.size());
	}
}
