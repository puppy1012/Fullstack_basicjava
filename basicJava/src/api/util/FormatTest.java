package api.util;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

//��µǴ� ���ڿ� ��¥�� ������ ������ �� �ִ�.
//=> ������ ���Ͽ� �°� ���
public class FormatTest {
	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar();
		//��¥���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		//��¥��ü�� SimpleDateFormat�� ������ ������ ����
		//SimpleDateFormat�� format�޼ҵ带 �����ؼ� ���Ͽ� �°� ��µǵ��� ó��
		String data = sdf.format(cal.getTime());
		System.out.println("format�� ������ ��¥������=>"+data);
		
		//�������
		DecimalFormat df = new DecimalFormat("#,###");
		System.out.println(df.format(123456789));
		
		DecimalFormat df2 = new DecimalFormat("#,###.##");
		System.out.println(df2.format(123456789.12545));//�Ҽ����� �ݿø�
		
		//���ڸ���� �ϰ� �ִ� ���ڿ��� ���������ϱ�
		String decimaldata = "123456.785";
		System.out.println(Double.parseDouble(decimaldata));
		try {
			double num = (double)df2.parse(decimaldata);
			System.out.println(df2.format(num));
			System.out.println("parseDouble�̿�=>"+df2.format(Double.parseDouble(decimaldata)));
		}catch(ParseException e) {
			e.printStackTrace();
		}
		
	}
}
