package chap04;

import java.util.Scanner;

//if~else if ~else if~
//���ڸ� ���ؼ� ���,����,0���� ���
public class MultiIfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		System.out.print("�����Է�:");
		int num=key.nextInt();
		if(num>0) {
			System.out.println("���");
		}else if(num<0){
			System.out.println("����");
		}else {
			System.out.println("0");
		}
	}

}
