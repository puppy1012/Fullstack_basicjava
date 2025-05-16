package datastructure;

import java.util.ArrayList;
import java.util.Vector;

/*
 * List- 선형구조
 * 순차적으로 데이터를 접근
 * 중복허용
 * Vector는 동시접속에 대한 처리가되어있으므로 웹에서는 사용하지않고
 * 주로 swing같은 GUI프로그램에서 만힝 사용된다.
 */
public class VectorTest {
	public static void main(String[] args) {
		//1.Vector 생성
		//<>안에 정의한 타입은 Vector에 저장되는 요소의 타입
		ArrayList<Integer> v= new ArrayList<Integer>();
//		Vector<Integer> v= new Vector<Integer>();
		//v.add("java");
		//2. Vector에 데이터를 저장하기
		v.add(10);//arr[0]=10
		//3.Vector에 저장된 요소의 갯수 확인
		System.out.println("현재 백터에 저장된 요소의 갯수=>"+v.size());//arr.length
		System.out.println("현재 벡터의 용량=>"+v.size());
		
		for(int i=1;i<=10;i++) {
			v.add(i);
		}
		System.out.println("현재 백터에 저장된 요소의 갯수=>"+v.size());//arr.length
		System.out.println("현재 벡터의 용량=>"+v.get(0));
		
		//4. Vector에 저장된 요소를 꺼내기 -요소번호 0번
		System.out.println("0번째 index번째 저장된 요소는 =>"+v.get(0));
		
		//5.Vector에 저장된 모든 요소를 꺼내기
		for(int i=0;i<v.size();i++) {
			int data=v.get(i);
			System.out.println(i+"번째 요소=>"+data);
		}
		System.out.println("=======================================");
		for(int data:v) {
			System.out.println(v);
		}
	}
}
