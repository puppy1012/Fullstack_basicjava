package api.util;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		String str = "java,mysql,oracle,html,css,javascript,jQuery";
		StringTokenizer st= new StringTokenizer(str,",");
								//------------------------
								//Ŭ������ �����ִ� ��������ҿ�,�� �и��� ���ڿ��� ����
													//token
		System.out.println(st.hasMoreTokens());
		while(st.hasMoreTokens()) {//��������ҿ� ����� �ִ��� Ȯ��
			System.out.println(st.nextToken());//��������ҿ� �ִ� ��ū�� ������
			
		}
	}
}
