package chap05;

import java.util.ArrayList;

//public class ArrayExam4 {
//	public static void main(String[] args) {
//		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
//		int[] ib = new int[]{1,2,3,4,5};
//		calc(ia,"ia");
//		calc(ib,"ib");
//	}
//	public static void calc(int[] num,String name) {
//		int odd=0;
//		int even=0;
//		for(int i:num) {
//			if(i%2==0) {
//				even+=i;
//			}else {
//				odd+=i;
//			}
//		}
//		System.out.printf("( �迭 %s )\n",name);
//		System.out.println("Ȧ���� �� : "+odd);
//		System.out.println("¦���� �� : "+even);
//	}
//}

import java.util.Random;

/*
 * [�̼�1]
 * ������ �����ϴ� ������ �Ʒ��� �������� ����ϼ���
 * RM - java
 * �� - servlet
 *   ....
 *   ....
 * ���� - raspberryPI
 * 
 * [�̼�2]
 * 5���� �̻��� ������ �����ϴ� singer�� ���ο� �迭�� �����ϰ� ����� �迭�� singer�� 
 * ����ϼ���
 * 
 * ��, ����, ����, ����ȩ, ����
 *   
 */
public class ArrayExam4 {
	public static void main(String[] args) {
		String[] singer = {"RM","��","��","����","����","����ȩ","����"};
		String[] singerFavoriteSubject = {"java","servlet","jsp","spring"
					,"jenkins","kubernetes","raspberryPI"};
		for(int i=0;i<singer.length;i++){
			System.out.printf("%s - %s\n",singer[i],singerFavoriteSubject[i]);
		}
		ArrayList<String> over5word=new ArrayList<>();
		int order=0;
		for(int j=0;j<singer.length;j++) {
			if(singerFavoriteSubject[j].length()>=5) {
				over5word.add(singer[j]);
				order+=1;
			}
		}
		//String join�� ���� ,�и� ���
		System.out.println(String.join(",", over5word));
	}
}