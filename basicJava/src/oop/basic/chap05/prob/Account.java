package oop.basic.chap05.prob;
//문제 2번
public class Account {
	private String accNo;
    private int balance;
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
		System.out.println(accNo + " 계좌가 개설되었습니다.");
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void save(int i) {
		this.balance=this.balance+i;
		// TODO Auto-generated method stub
		System.out.println(accNo + " 계좌에 " + i + "만원이 입금되었습니다.");
	}
	public void deposit(int i) {
		// TODO Auto-generated method stub
		this.balance=this.balance-i;
		// TODO Auto-generated method stub
		System.out.println(accNo + " 계좌에 " + i + "만원이 출금되었습니다.");
	}

}
