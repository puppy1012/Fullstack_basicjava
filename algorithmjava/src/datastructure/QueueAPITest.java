package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueAPITest {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		//ť�� �����͸� �����ϱ�
		System.out.println(queue.add(1));//-����Ϸ� -ture ,�۾��� ó������������ Exception�߻�
		System.out.println(queue.offer(2));//-����Ϸ� -ture ,�۾��� ó������������ false�߻�
		queue.offer(3);
		queue.offer(4);
		System.out.println("������=>"+queue.size());
		System.out.println(queue.peek());
		System.out.println(queue.isEmpty());
		//������ ������
		System.out.println(queue.poll());//���� �����͸� ����
		System.out.println(queue.remove());
		System.out.println("������=>"+queue.size());
		
		System.out.println(queue.poll());//���� �����͸� ����
		System.out.println(queue.remove());
		System.out.println("������=>"+queue.size());
		
		System.out.println(queue.poll());//front�� ��Ҹ� ������ ����� ���(��������� null)
		System.out.println(queue.remove());//front�� ��Ҹ� ������ ����� ���(��������� Exception)
	}
}
