package oop.basic.chap05.prob;

public class Prob {
	public static void main(String[] args){
		Rectangle rectangle01 = new Rectangle(10, 20, "û��");
		rectangle01.calculateArea();
		System.out.println("1 : "+rectangle01.getColor()+" ���簢�� ���� : "+rectangle01.getArea());
		 
		Rectangle rectangle02 = new Rectangle(20, 20);
		rectangle02.calculateArea();
		System.out.println("2 : "+rectangle02.getColor()+" ���簢�� ���� : "+rectangle02.getArea());
		 
		Rectangle rectangle03 = new Rectangle();
		rectangle03.setHeight(10);
		rectangle03.setWidth(10);
		rectangle03.setColor("���");
		rectangle03.calculateArea();
		System.out.println("3 : "+rectangle03.getColor()+" ���簢�� ���� : "+rectangle03.getArea());
	
	}
	
}
