package oop.basic.chap05.prob;
//���� 2��
public class Account {
	private String accNo;
    private int balance;
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
		System.out.println(accNo + " ���°� �����Ǿ����ϴ�.");
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
		System.out.println(accNo + " ���¿� " + i + "������ �ԱݵǾ����ϴ�.");
	}
	public void deposit(int i) {
		// TODO Auto-generated method stub
		this.balance=this.balance-i;
		// TODO Auto-generated method stub
		System.out.println(accNo + " ���¿� " + i + "������ ��ݵǾ����ϴ�.");
	}

}
