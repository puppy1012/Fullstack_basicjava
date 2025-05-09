package chap05;

public class ArrayExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] list= new boolean[4];
		for(int i=0;i<3;i++) {
			list[i]=false;
		}
		list[3]=true;
		for(int j=0;j<4;j++) {
			System.out.println(j+"¹ø¿ä¼Ò ->"+list[j]);
		}
	}
}
