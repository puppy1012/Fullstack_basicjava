package chap05;

import java.util.ArrayList;

//public class ArrayExam4 {
//	public static void main(String[] args) {
//		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
//		int[] ib = new int[]{1,2,3,4,5};
//		calc(ia,"ia");
//		calc(ib,"ib");
//	}
//	public static void calc(int[] num,String name) {
//		int odd=0;
//		int even=0;
//		for(int i:num) {
//			if(i%2==0) {
//				even+=i;
//			}else {
//				odd+=i;
//			}
//		}
//		System.out.printf("( 배열 %s )\n",name);
//		System.out.println("홀수의 합 : "+odd);
//		System.out.println("짝수의 합 : "+even);
//	}
//}

import java.util.Random;

/*
 * [미션1]
 * 가수가 좋아하는 과목을 아래의 형식으로 출력하세요
 * RM - java
 * 진 - servlet
 *   ....
 *   ....
 * 정국 - raspberryPI
 * 
 * [미션2]
 * 5글자 이상의 과목을 좋아하는 singer를 새로운 배열에 저장하고 저장된 배열의 singer를 
 * 출력하세요
 * 
 * 진, 지민, 슈가, 제이홉, 정국
 *   
 */
public class ArrayExam4 {
	public static void main(String[] args) {
		String[] singer = {"RM","진","뷔","지민","슈가","제이홉","정국"};
		String[] singerFavoriteSubject = {"java","servlet","jsp","spring"
					,"jenkins","kubernetes","raspberryPI"};
		for(int i=0;i<singer.length;i++){
			System.out.printf("%s - %s\n",singer[i],singerFavoriteSubject[i]);
		}
		ArrayList<String> over5word=new ArrayList<>();
		int order=0;
		for(int j=0;j<singer.length;j++) {
			if(singerFavoriteSubject[j].length()>=5) {
				over5word.add(singer[j]);
				order+=1;
			}
		}
		//String join을 통한 ,분리 출력
		System.out.println(String.join(",", over5word));
	}
}