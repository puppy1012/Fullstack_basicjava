package chap05;

public class Array2DExam2 {
	public static void main(String[] args) {
		int[][] num_list={{90,89,100} , {98,89,97}};
		//��,classArr�� jumsuArr�������� �����Ƿ� 
		//classArr�� ��� ������ jumsArr�� �ٱ��� ����� ������ �����ؾ��Ѵ�.
		String[] classArr= {"A��","B��"};
		for(int row=0;row<num_list.length;row++) {
			int sum=0,avg=0;
			if(row==0) {
				System.out.print(classArr[row]+": ");
			}else {
				System.out.print(classArr[row]+": ");
			}
			for(int col=0;col<num_list[row].length;col++) {
				System.out.print(num_list[row][col]+"\t");
				sum+=num_list[row][col];
			}
			System.out.printf("�հ�:%d ���:%d\n",sum,(sum/num_list[row].length));
		}
		System.out.println("==========================================");
		for(int row=0;row<num_list.length;row++) {
			int sum=0;
			if(row==0) {
				System.out.printf("[%s]\n",classArr[row]);
			}else {
				System.out.printf("[%s]\n",classArr[row]);
			}
			for(int col=0;col<num_list[row].length;col++) {
				sum+=num_list[row][col];
			}
			System.out.printf("�հ�:%d\n���:%f\n",sum,(double)sum / num_list[row].length);
			System.out.println("----------------------------------------");
		}
	}
}
