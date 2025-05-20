package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyStack{
	private int[]mystack;
	//스택top의 위치값 - top_position의 변수의 값이 0이라는것은 스택이 비어있따는 의미
	
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
		//pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다.
		//만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		
		int result=0;
		if(empty()==1) {//비어있으면
			result=-1;
		}else {
			top_position=top_position -1;
			result=mystack[top_position];
		}
		return result;
	}
	public int size() {
		//size: 스택에 들어있는 정수의 개수를 출력한다.
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
			//현재 top_position은 다음위치를 가리키고있다
			//그렇기에 -1을 해야지 현재입력된값중 마지막 값을 확인가능
			result=mystack[top_position-1];
		}
		return result;
	}
	
}
public class Baek_10828 {
	public static void main(String[] args) throws IOException {
		//MyStack의 메소드를 호출해서 테스트케이스 데이터를 입력받아서처리하면
		//출력 결과대로 출력되도록 작업
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int count= Integer.parseInt(br.readLine());
		//각 경우에 따라서 MyStack의 메소드를 호출
		//각 출력하는 값은 STringBuilder로 만들어서 for문 밖에서 한번에 출력
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
