package datastructure;

import java.util.ArrayList;
import java.util.Vector;

/*
 * List- ��������
 * ���������� �����͸� ����
 * �ߺ����
 * Vector�� �������ӿ� ���� ó�����Ǿ������Ƿ� �������� ��������ʰ�
 * �ַ� swing���� GUI���α׷����� ���� ���ȴ�.
 */
public class VectorTest {
	public static void main(String[] args) {
		//1.Vector ����
		//<>�ȿ� ������ Ÿ���� Vector�� ����Ǵ� ����� Ÿ��
		ArrayList<Integer> v= new ArrayList<Integer>();
//		Vector<Integer> v= new Vector<Integer>();
		//v.add("java");
		//2. Vector�� �����͸� �����ϱ�
		v.add(10);//arr[0]=10
		//3.Vector�� ����� ����� ���� Ȯ��
		System.out.println("���� ���Ϳ� ����� ����� ����=>"+v.size());//arr.length
		System.out.println("���� ������ �뷮=>"+v.size());
		
		for(int i=1;i<=10;i++) {
			v.add(i);
		}
		System.out.println("���� ���Ϳ� ����� ����� ����=>"+v.size());//arr.length
		System.out.println("���� ������ �뷮=>"+v.get(0));
		
		//4. Vector�� ����� ��Ҹ� ������ -��ҹ�ȣ 0��
		System.out.println("0��° index��° ����� ��Ҵ� =>"+v.get(0));
		
		//5.Vector�� ����� ��� ��Ҹ� ������
		for(int i=0;i<v.size();i++) {
			int data=v.get(i);
			System.out.println(i+"��° ���=>"+data);
		}
		System.out.println("=======================================");
		for(int data:v) {
			System.out.println(v);
		}
	}
}
