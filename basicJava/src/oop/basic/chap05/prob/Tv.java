package oop.basic.chap05.prob;
//¹®Á¦3¹ø
public class Tv {
	private String color;
	private boolean power;
	private int channel;
	
	public Tv() {
		this.color="black";
		this.power=false;
		this.channel=0;
	}
	public void print() {
		// TODO Auto-generated method stub
		System.out.printf("color :%s\tpower:%b\tchannel:%d\n",color,power,channel);
	}
	public void power() {
		// TODO Auto-generated method stub
		power=!power;
	}
	public void channelUp() {
		// TODO Auto-generated method stub
		channel+=1;
	}
	public void channelDown() {
		// TODO Auto-generated method stub
		channel-=1;
	}
}
