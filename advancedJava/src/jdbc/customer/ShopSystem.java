package jdbc.customer;

import java.util.Scanner;
public class ShopSystem {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("******���θ�********");
		System.out.println("1. ȸ�����");
		System.out.println("2. ���ȸ����ȸ");
		System.out.println("3. ȸ����������");
		System.out.println("4. ȸ��Ż��");
		System.out.println("5. �ּҷ� ȸ�� �˻�");
		System.out.println("6. �α���");
		System.out.println("7. ȸ����ȣ�� ��ȸ�ϱ�");
		System.out.print("���ϴ� �۾��� �����ϼ���:");
		int choice  = key.nextInt();
		show(choice);
	}
	public static void show(int choice){
		MenuController ui = new MenuController();
		switch(choice){
			case 1:
				ui.insertMenu();//ȸ�����
				break;
			case 2:
				ui.selectMenu();//���ȸ����ȸ
				break;
			case 3:
				ui.updateMenu();//ȸ����������
				break;
			case 4:
				ui.deleteMenu();//ȸ��Ż��
				break;
			case 5:
				ui.findByAddrMenu();//�ּҷ� ȸ�� �˻�
				break;
			case 6:
				ui.loginMenu();//�α���
				break;
			case 7:
				ui.myPageMenu();//ȸ����ȣ�� ��ȸ�ϱ�
				break;
		}
	}
}













