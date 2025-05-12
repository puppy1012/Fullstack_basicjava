package oop.polymorphism.chap07;

public class EmailSender extends Sender {
	int length;
	public EmailSender(String name,int length){
		super(name);
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void send(){
		System.out.println(name+"������ �Ϸ� - �� ����, �̹��� ��� �����մϴ�.");
	}
}

