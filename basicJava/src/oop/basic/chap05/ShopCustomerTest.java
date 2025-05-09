package oop.basic.chap05;

public class ShopCustomerTest {
	public static void main(String[] args) {
		ShopCustomer sc1= new ShopCustomer();
		sc1.addr="서울";
		sc1.age=28;
		sc1.id="James";
		sc1.name="이승현";
		sc1.phone_call="010-8332-5016";
		sc1.point=2025;
		sc1.Shop_Pass=true;
		System.out.println("성명:"+sc1.name);
		System.out.println("주소:"+sc1.addr);
		System.out.println("나이:"+sc1.age);
		System.out.println("아이디:"+sc1.id);
		System.out.println("포인트:"+sc1.point);
		System.out.println("번호:"+sc1.phone_call);
		System.out.println("패스권:"+sc1.Shop_Pass);
	}
}
