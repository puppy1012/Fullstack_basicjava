package chap04;

import java.util.Scanner;

public class SwitchExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
        System.out.print("����:");
        int jumsu = key.nextInt();
        String score = "";
        if(jumsu>=0 & jumsu<=100){
        	//�Ʒ� if~else if�� switch�� �����ϱ� 0���� 100���� case ���� �ʱ�
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

            System.out.println("����:"+jumsu+"\n��:"+score);
        }else {
            System.out.println("�߸��Է�");
        }
	}

}
