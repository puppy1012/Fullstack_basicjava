package chap04;

import java.util.Scanner;

/*
 * MultiIfExam2.java
����if, if���� ��ø
0 ~ 59 : F����
60 ~ 69 : D����
70 ~ 79 : C����
80 ~ 89 : B����
90 ~ 100 : A����
110 or -40 : �߸��Է�

[�������]
����:
����:
1) ScannerŬ������ �̿��ؼ� �Է¹޵��� 
2) 0���� 100���� �ԷµǸ� ������, ���� ���ڴ� �߸��Է����� ��µǵ��� ����
 */
public class MultiExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		System.out.print("����:");
		int num= key.nextInt();
		String score="";
		if(num>=0&num<=100) {
			if (num >= 90) {
			    score = "A";
			} else if (num >= 80) {
			    score = "B";
			} else if (num >=70) {
			    score = "C";
			} else if (num >=60) {
			    score = "D";
			} else{
			    score = "F";
			} 
			System.out.println("����:"+score);
		}else {
		    System.out.println("�߸��Է�");
		
		}
	}

}
