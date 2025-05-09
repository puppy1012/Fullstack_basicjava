package HardExam;
class Account{
	private String accId;
	private long balance;
	private String ownerName; 
	public Account() {
		
	}
	public Account(String accId,String ownerName,long balance) {
		this.accId=accId;
		this.balance=balance;
		this.ownerName=ownerName;
	}
	public String getAccId() {
		return accId;
	}
	public void setAccId(String accId) {
		this.accId = accId;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public void deposit(long amount) {
		if(amount>=0) {
			balance+=amount;
		}else {
			System.out.println("Wrong Access");
		}
	}
	public void withdraw(long amount) {
		if(amount>=0) {
			balance-=amount;
		}else {
			System.out.println("Wrong Access");
		}
	}

}
public class CheckingAccount extends Account{
	private String cardNo;

	public CheckingAccount(String accId,String ownerName,long balance, String cardNo) {
		// TODO Auto-generated constructor stub
		super(accId,ownerName,balance);
		this.cardNo=cardNo;
	}

	public void pay(long amount,String cardNo) {
		// TODO Auto-generated method stub
		if(this.cardNo.equals(cardNo)&super.getBalance()>=amount) {
//			super.setBalance(super.getBalance()-amount);
			super.withdraw(amount);
		}else {
			System.out.println("지불이 불가능합니다.");
		}
		
	}

}
