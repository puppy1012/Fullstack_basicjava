package string;

import java.util.Scanner;

public class Baek_1543 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String word1 = key.nextLine();
		String word2 = key.nextLine();
		int count = 0;
		// word1�� ���̿� word2�� ���̸� ���ϸ� ������ �߻�,�ǹ̾���
		// �񱳰� ������ ���̸�ŭ for��
		for (int i = 0; i <= word1.length() - word2.length();) {
			// ��Ī�Ǵ��� �ȵǴ��� booleanó��
			boolean match = true;
			// word2�� ���̸�ŭ word1�� word2�� ���ؼ� �ѹ��̶� Ʋ���� false,break
			for (int j = 0; j < word2.length(); j++) {
				if (word1.charAt(i + j) != word2.charAt(j)) {
					match = false;
					break;
				}
			}
			// true�̸� count+1,�ߺ����ܸ� ���� word2���̸�ŭ i�� ����
			if (match) {
				count += 1;
				i += word2.length();
			} else {
				// �ȸ����� �׳� i�� ����
				i++;
			}
		}
		System.out.println(count);
	}
}
