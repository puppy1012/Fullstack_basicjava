package oop.basic.chap05.prob;

//문제2번
public class Prob2 {
	public static void main(String[] args) {
		try {
			BankCustomer customer = new BankCustomer("홍길동", 100);
			System.out.println("현재 잔액 : " + customer.getCurrentMoney());			
			customer.withdraw(70);
			System.out.println("현재 잔액 : " + customer.getCurrentMoney());			
			customer.withdraw(50);
			System.out.println("현재 잔액 : " + customer.getCurrentMoney());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class BankCustomer{
	// 문제를 잘 읽고 구현하세요.
	private String name;
	private int currentMoney;
	
	public BankCustomer(String name,int currentMoney) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.currentMoney=currentMoney;
	}
	public int getCurrentMoney() {
		// TODO Auto-generated method stub
		return currentMoney;
	}
	//main 에서 try catch를 사용하기때문에 제동을 걸기위해서는 throw new Exception을 사용
	public void withdraw(int money) throws Exception {
		// TODO Auto-generated method stub
		if(currentMoney>money) {
			currentMoney-=money;
		}else {
//			System.out.println("잔액이 부족하여 인출할 수 없습니다.");
			throw new Exception("잔액이 부족하여 인출할 수 없습니다.");
		}
	}
}