package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1427 {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		//�ԷµǴ� ���ڸ� ���������� �Է¹ޱ�
		String num=br.readLine();
		//�迭�� split�� ���� ���� �Ҵ�
		String[] num_split=num.split("");
		//�� ���ڿ��� int������ ġȯ�� int�� �迭�� �Է�
		int[] list=new int[num_split.length];
		for(int i=0;i<num_split.length;i++) {
			list[i]=Integer.parseInt(num_split[i]);
		}
		//�������� ��������
		for (int i = 0; i < list.length; i++) {
		    // ���� ��ġ i���� ���������� �߿��� ���� ū ���� ã�� ���� �ʱ� max �ε����� i�� ����
		    int max = i;

		    // i+1���� �迭 ������ Ž���ϸ� ���� ū ���� ���� �ε����� ã��
		    for (int j = i + 1; j < list.length; j++) {
		        // list[j]�� ���� max���� ũ�ٸ� �� �� ū ���� ã�� ���̹Ƿ� max �ε����� ����
		        if (list[j] > list[max]) {
		            max = j;  // ���� ū ���� �ε����� max�� ������Ʈ
		        }
		    }

		    // ã�� �ִ�(max ��ġ�� ��)�� ���� i ��ġ�� ���� ��ȯ �� ���� ū ���� ������ ����
		    int tmp = list[max];   // max ��ġ�� ���� �ӽ� ����
		    list[max] = list[i];   // ���� i ��ġ ���� max ��ġ�� �ű�
		    list[i] = tmp;         // max ���� ���� i ��ġ�� ���� (swap �Ϸ�)
		}
//		for (int i = 0; i < list.length; i++) {
//		    // ���� ��ġ i���� ���������� �߿��� ���� ���� ���� ã�� ���� �ʱ� min �ε����� i�� ����
//		    int min = i;
//
//		    // i+1���� �迭 ������ Ž���ϸ� ���� ���� ���� ���� �ε����� ã��
//		    for (int j = i + 1; j < list.length; j++) {
//		        // list[j]�� ���� min���� �۴ٸ� �� �� ���� ���� ã�� ���̹Ƿ� min �ε����� ����
//		        if (list[j] < list[min]) {
//		            min = j;  // ���� ���� ���� �ε����� min���� ������Ʈ
//		        }
//		    }
//
//		    // ã�� �ּڰ�(min ��ġ�� ��)�� ���� i ��ġ�� ���� ��ȯ �� ���� ���� ���� �տ� ��ġ
//		    int tmp = list[min];   // min ��ġ�� ���� �ӽ� ����
//		    list[min] = list[i];   // ���� i ��ġ ���� min ��ġ�� �ű�
//		    list[i] = tmp;         // min ���� ���� i ��ġ�� ���� (swap �Ϸ�)
//		}

		for(int number:list) {
			System.out.print(number);
		}
	}
}
