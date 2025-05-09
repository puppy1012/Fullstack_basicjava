package Switch;

import java.util.Scanner;

public class FareTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----Menu------------");
		System.out.println("1. 가정용 (liter당 50원");
		System.out.println("2. 상업용 (liter당 45원");
		System.out.println("3. 공업용 (liter당 30원");
		System.out.println("--------------------");
		System.out.println("메뉴를선택하세요=>");
		System.out.println("--------------------");
		Scanner key= new Scanner(System.in);
		int menu_num= key.nextInt();
		System.out.println("사용량을 입력하세요=>");
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
				System.out.println("잘못된 입력값");
				return;
		}
		System.out.println("===================");
		System.out.println("사용자 코드:"+menu_num);
		System.out.println("사용요금:"+cost);
		System.out.println("총수도 요금:"+total_cost);
		System.out.println("===================");
	}

}
