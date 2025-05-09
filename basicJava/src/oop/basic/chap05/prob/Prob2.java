package oop.basic.chap05.prob;

//����2��
public class Prob2 {
	public static void main(String[] args) {
		try {
			BankCustomer customer = new BankCustomer("ȫ�浿", 100);
			System.out.println("���� �ܾ� : " + customer.getCurrentMoney());			
			customer.withdraw(70);
			System.out.println("���� �ܾ� : " + customer.getCurrentMoney());			
			customer.withdraw(50);
			System.out.println("���� �ܾ� : " + customer.getCurrentMoney());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class BankCustomer{
	// ������ �� �а� �����ϼ���.
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
	//main ���� try catch�� ����ϱ⶧���� ������ �ɱ����ؼ��� throw new Exception�� ���
	public void withdraw(int money) throws Exception {
		// TODO Auto-generated method stub
		if(currentMoney>money) {
			currentMoney-=money;
		}else {
//			System.out.println("�ܾ��� �����Ͽ� ������ �� �����ϴ�.");
			throw new Exception("�ܾ��� �����Ͽ� ������ �� �����ϴ�.");
		}
	}
}