package oop.polymorphism.chap07;

import java.util.*;


public class RefTypeCastingTest {
	public static void main(String[] args) {
		//��Ӱ��迡 �ִ� Ŭ������ ĳ������ ����
		//�������� - ��Ӱ��谡 �ƴϹǷ� ĳ������ �Ұ���
//		Random rand= new Random();
//		String str=(String)rand;
		//��Ӱ��迡 �ִ� Ŭ������ �ڵ�ĳ����
		//����Ŭ��Ÿ�� ����= new ����Ŭ����();
		ArrayList<String> list = new ArrayList<String>();
		AbstractList<String>superlist=new ArrayList<String>();
		AbstractCollection<String>supersuperlist=new ArrayList<String>();
		System.out.println(list);
		System.out.println(superlist);
		System.out.println(supersuperlist);
	}
}
