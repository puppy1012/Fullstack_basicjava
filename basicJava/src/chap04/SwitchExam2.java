package chap04;

import java.util.Scanner;

public class SwitchExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
        System.out.print("점수:");
        int jumsu = key.nextInt();
        String score = "";
        if(jumsu>=0 & jumsu<=100){
        	//아래 if~else if를 switch로 변경하기 0부터 100까지 case 쓰지 않기
        	switch(jumsu/10) {
        	case 9:
        		score="A";
        		break;
        	case 8:
        		score="B";
        		break;
        	case 7:
        		score="C";
        		break;
        	case 6:
        		score="D";
        		break;
        	default:
        		score="F";
        	}

            System.out.println("점수:"+jumsu+"\n평가:"+score);
        }else {
            System.out.println("잘못입력");
        }
	}

}
