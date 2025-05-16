package datastructure;

import java.util.ArrayList;
import java.util.HashSet;
/*
 * ArrayList에 저장되어있는 데이터를 HashSet으로 변환하고
 * HashSet에 저장된 데이터를 이용해서 아래와 같은 출력결과를 만들어보세요
 *
 */
public class HashSetExam {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(99);
        list.add(100);
        list.add(88);
        list.add(95);
        list.add(45);
        HashSet<Integer>hashlist=new HashSet<Integer>(list);
        int total=0;
//        for(int i=0;i<list.size();i++) {
//        	int value= list.get(i);
//        	hashlist.add(value);
//        	if(%2==0) {
//        		System.out.println(hashlist[i]+"--- 짝수");
//        		total+=hashlist[i];
//        	}else {
//        		System.out.println(hashlist[i]+"--- 홀수");
//        		total+=hashlist[i];
//        	}
//        }
        for(int num:hashlist) {
        	if(num%2==0) {
        		System.out.println(num+"--- 짝수");
        		total+=num;
        	}else {
           		System.out.println(num+"--- 홀수");
        		total+=num;
        	}
        }
        System.out.println("총점:"+total);
        System.out.println("평균:"+total/hashlist.size());
        
	}
}
