package Switch;

import java.util.Scanner;

public class FareTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----Menu------------");
		System.out.println("1. ������ (liter�� 50��");
		System.out.println("2. ����� (liter�� 45��");
		System.out.println("3. ������ (liter�� 30��");
		System.out.println("--------------------");
		System.out.println("�޴��������ϼ���=>");
		System.out.println("--------------------");
		Scanner key= new Scanner(System.in);
		int menu_num= key.nextInt();
		System.out.println("��뷮�� �Է��ϼ���=>");
		int amount_use= key.nextInt();
		int cost=0;
		double total_cost=0;
		switch(menu_num) {
			case 1:
				cost=amount_use*50;
				total_cost=(double)cost+(cost*0.05);
				break;
			case 2:
				cost=amount_use*45;
				total_cost=(double)cost+(cost*0.05);
				break;
			case 3:
				cost=amount_use*30;
				total_cost=(double)cost+(cost*0.05);
				break;
			default:
				System.out.println("�߸��� �Է°�");
				return;
		}
		System.out.println("===================");
		System.out.println("����� �ڵ�:"+menu_num);
		System.out.println("�����:"+cost);
		System.out.println("�Ѽ��� ���:"+total_cost);
		System.out.println("===================");
	}

}
