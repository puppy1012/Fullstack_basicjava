package datastructure;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		int[] myarr= {100,20,40,88,99,78};
		int[] myarr2= myarr;//��������
		int[] myarr3= myarr.clone();

		System.out.println(myarr);
		System.out.println(myarr2);
		System.out.println(myarr3);
		System.out.println("myarr=>"+Arrays.toString(myarr));
		System.out.println("myarr3=>"+Arrays.toString(myarr3));
		//�迭�� ���� ��
		System.out.println(Arrays.equals(myarr,myarr3));
		System.out.println(Arrays.equals(myarr,myarr2));
		//������ index ������ �迭��Ҹ� �����ؼ� ���ο� �迭�� ����
		int[] otherArr=Arrays.copyOfRange(myarr3, 1, 4);
		
		System.out.println("otherArr=>"+Arrays.toString(otherArr));
		
		//�迭�����ϱ�
		Arrays.sort(myarr);
		System.out.println("myarr=>"+Arrays.toString(myarr));
		
		//�迭���� Ư�� �� �˻��ϱ�
		//binarySearch�� ���������� ���� ���˻� �˰����� �̿��ؼ� ó��
		//=>�����˻��˰����� ���ο��� ����ϹǷ� ������� ������ �Ǿ� �־�� ����� �۵��Ѵ�.
		System.out.println(Arrays.binarySearch(myarr, 78));
	}
}
