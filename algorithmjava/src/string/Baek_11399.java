package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek_11399 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//�������� �����ϴ� �ּҽð����� ��� �ᱹ ũ�Ⱑ ����������� ������ ������ �϶�°��̴�
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		String list=br.readLine();
		String[] list_split=list.split(" ");
		int[] int_list= new int[num];
		for(int i=0;i<num;i++) {
			int_list[i]=Integer.parseInt(list_split[i]);
		}
//		for(int i=1;i<int_list.length;i++) {
//			for(int j=i;j>0;j--) {
//				if(int_list[j-1]>int_list[j]) {
//					int tmp=int_list[j];
//					int_list[j]=int_list[j-1];
//					int_list[j-1]=tmp;
//				}else {
//					break;
//				}
//			}
//		}
		Arrays.sort(int_list);
		int total=0;
		int sum=0;
		//sum�� i��°���� ���� ���ϱ�
		//total�� sum�ǰ��� ���ϱ�
//		for(int i=0;i<int_list.length;i++) {
//			sum+=int_list[i];
//			total+=sum;
//		}
		for(int i:int_list) {
			sum+=i;
			total+=sum;
		}
		System.out.println(total);
	}
}
