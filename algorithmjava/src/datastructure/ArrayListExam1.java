package datastructure;

import java.util.ArrayList;

/*
 * 1ºÎÅÍ 100±îÁö ·£´ı¼ö 5°³¸¦ ÀÌ¿ëÇØ¼­ ArrayList¿¡ ÀúÀåÇÏ°í ex(58 88 79 100 49)
 * 58 --(Â¦¼ö)
 * 88 --(Â¦¼ö)
 * 79 --(È¦¼ö)
 * 
 * 
 * ÃÑÁ¡:__
 * Æò±Õ:__
 */
public class ArrayListExam1 {
	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		int total=0;
		String name="";
		for(int i=0;i<5;i++) {
			int num=(int) (Math.random()*100+1);
			if(num%2==0) {
				name="Â¦¼ö";
			}else {
				name="È¦¼ö";
			}
			System.out.println(num+"---"+name);
			list.add(num);
			total+=num;
			
		}
//		System.out.println("ÃÑÇÕ: " + list.stream().mapToInt(Integer::intValue).sum());
		System.out.println("ÃÑÁ¡:"+total);
		System.out.println("Æò±Õ:"+total/list.size());
	}
}
