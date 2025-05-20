package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyStack{
	private int[]mystack;
	//����top�� ��ġ�� - top_position�� ������ ���� 0�̶�°��� ������ ����ֵ��� �ǹ�
	
	private int top_position;
	public MyStack(int size) {
		mystack= new int[size];
	}
	public void push(int data) {
		mystack[top_position]=data;
//		System.out.println(mystack[top_position]);
		top_position++;
		
	}
	public int empty() {
		int result=0;
		if(top_position==0) {
			result=1;
		}else {
			result=0;
		}
		return result;
		
	}
	public int pop() {
		//pop: ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�.
		//���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
		
		int result=0;
		if(empty()==1) {//���������
			result=-1;
		}else {
			top_position=top_position -1;
			result=mystack[top_position];
		}
		return result;
	}
	public int size() {
		//size: ���ÿ� ����ִ� ������ ������ ����Ѵ�.
		int result=0;
		if(empty()==1) {
			result=0;
		}else {
			result=top_position;
		}
		return result;
	}
	public int top() {
		int result=0;
		if(empty()==1) {
			result=-1;
		}else {
			//���� top_position�� ������ġ�� ����Ű���ִ�
			//�׷��⿡ -1�� �ؾ��� �����ԷµȰ��� ������ ���� Ȯ�ΰ���
			result=mystack[top_position-1];
		}
		return result;
	}
	
}
public class Baek_10828 {
	public static void main(String[] args) throws IOException {
		//MyStack�� �޼ҵ带 ȣ���ؼ� �׽�Ʈ���̽� �����͸� �Է¹޾Ƽ�ó���ϸ�
		//��� ������ ��µǵ��� �۾�
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int count= Integer.parseInt(br.readLine());
		//�� ��쿡 ���� MyStack�� �޼ҵ带 ȣ��
		//�� ����ϴ� ���� STringBuilder�� ���� for�� �ۿ��� �ѹ��� ���
		StringBuilder builder=new StringBuilder();
		MyStack stack= new MyStack(count);
		for(int i=0;i<count;i++) {
			int result=0;
			String line= br.readLine();
			String[] arr=line.split(" ");
			switch(arr[0]) {
			case "push":
				stack.push(Integer.parseInt(arr[1]));
				
				break;
			case "pop":

				builder.append(stack.pop()+"\n");
				break;
			case "empty":

				builder.append(stack.empty()+"\n");
				break;
			case "size":

				builder.append(stack.size()+"\n");
				break;
			case "top":

				builder.append(stack.top()+"\n");
				break;
			}
			
		}
		System.out.println(builder.toString());
	}
}
