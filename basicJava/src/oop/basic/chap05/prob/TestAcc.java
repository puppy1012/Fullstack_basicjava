package oop.basic.chap05.prob;
public class TestAcc {
    public static void main(String[] args) throws Exception {
        String accNo = null;
        int balance = 0;

        Account accObj = new Account();
		accObj.setAccNo("078-3762-293");
        accNo = accObj.getAccNo();
        balance = accObj.getBalance();
        System.out.println(accNo + " ������ �ܰ�� " + balance + "�����Դϴ�.");

        accObj.save(100);
        balance = accObj.getBalance();
        System.out.println(accObj.getAccNo() + " ������ �ܰ�� " + balance + "�����Դϴ�.");

        accObj.deposit(30);
        balance = accObj.getBalance();
        System.out.println(accNo + " ������ �ܰ�� " + balance + "�����Դϴ�.");
    }
}
