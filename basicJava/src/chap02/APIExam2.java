package chap02;

import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class APIExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand1= new Random();
		int result=rand1.nextInt();
		System.out.println("·£´ı¼ö=>"+result);
		
		int result2=ThreadLocalRandom.current().nextInt(1,101);
		System.out.println("ThreadLocalRandom=>"+result2);
		int result3=(int)(Math.random()*100)+1;
		System.out.println("Math.random=>"+result3);
		
		SecureRandom secureRand= new SecureRandom();
		int result4=secureRand.nextInt(100)+1;
		System.out.println("Secure ·£´ı¼ö=>"+result4);
	}

}
