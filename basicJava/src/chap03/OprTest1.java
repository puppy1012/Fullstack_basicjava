package chap03;
//자바에서 사용할 수있는 연산자
// =>산술연산자,증감연산자,대입연산자
public class OprTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{int x=5,y=0;y=x++;
			System.out.println(x+","+y);
		}
		{int x=5,y=0;y=x--;
			System.out.println(x+","+y);
		}
		{int x=5,y=0;y=++x;
			System.out.println(x+","+y);
		}
		{int x=5,y=0;y=--x;
			System.out.println(x+","+y);
		}
		boolean state =true;
		System.out.println(state);
		System.out.println(!state);
	}

}
