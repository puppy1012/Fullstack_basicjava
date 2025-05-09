package chap02;

public class TimeTest {
	public static void main(String[] args) {
		int time= 8800; //초 데이터
		int hour = time/3600;
		int RestTime=time%3600;
		int minute= RestTime/60;
		int second=RestTime%60;
		System.out.printf("%d시간 %d분 %d초", hour,minute,second);
	}
}
