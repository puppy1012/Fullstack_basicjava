package datastructure;

import java.util.ArrayList;
import java.util.HashSet;
/*
 * ArrayList�� ����Ǿ��ִ� �����͸� HashSet���� ��ȯ�ϰ�
 * HashSet�� ����� �����͸� �̿��ؼ� �Ʒ��� ���� ��°���� ��������
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
//        		System.out.println(hashlist[i]+"--- ¦��");
//        		total+=hashlist[i];
//        	}else {
//        		System.out.println(hashlist[i]+"--- Ȧ��");
//        		total+=hashlist[i];
//        	}
//        }
        for(int num:hashlist) {
        	if(num%2==0) {
        		System.out.println(num+"--- ¦��");
        		total+=num;
        	}else {
           		System.out.println(num+"--- Ȧ��");
        		total+=num;
        	}
        }
        System.out.println("����:"+total);
        System.out.println("���:"+total/hashlist.size());
        
	}
}
