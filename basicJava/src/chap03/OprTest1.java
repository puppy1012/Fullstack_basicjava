package chap03;
//�ڹٿ��� ����� ���ִ� ������
// =>���������,����������,���Կ�����
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
