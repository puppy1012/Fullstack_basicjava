package chap02;

import java.util.Scanner;

//scanner Ŭ������ �����ϱ� ���� Ŭ����
/*
 * scanner�� ����ڰ� �Է��ϴ� ���� �о ó���ϱ� ���� ����� �����ϴ� Ŭ����
 */
public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		//Scanner���� �����Ǵ� �޼ҵ���� Ű����� �Է��ϴ� ���� Ÿ�Կ� ���� ���� �� �ֵ���
		//�޼ҵ带 ����
		//spacebarŰ�� enterŰ�� �������� ������ �Է��� ���� �о ��ȯ
		System.out.println("�ܾ��Է�");
		String val=key.next();
		System.out.println("����ڰ� �Է��� ��:"+val);
		
		System.out.println("�����Է�:");
		int intVal=key.nextInt();
		System.out.println("����ڰ� �Է��� ���ڰ�:"+intVal);
	}

}
