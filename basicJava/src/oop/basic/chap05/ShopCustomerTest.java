package oop.basic.chap05;

public class ShopCustomerTest {
	public static void main(String[] args) {
		ShopCustomer sc1= new ShopCustomer();
		sc1.addr="����";
		sc1.age=28;
		sc1.id="James";
		sc1.name="�̽���";
		sc1.phone_call="010-8332-5016";
		sc1.point=2025;
		sc1.Shop_Pass=true;
		System.out.println("����:"+sc1.name);
		System.out.println("�ּ�:"+sc1.addr);
		System.out.println("����:"+sc1.age);
		System.out.println("���̵�:"+sc1.id);
		System.out.println("����Ʈ:"+sc1.point);
		System.out.println("��ȣ:"+sc1.phone_call);
		System.out.println("�н���:"+sc1.Shop_Pass);
	}
}
