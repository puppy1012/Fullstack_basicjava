package api.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar();
		Calendar cal2 = new GregorianCalendar();
		System.out.println(cal);
		Date d = new Date();
		System.out.println(d);
		
		System.out.println("=====================Calendar��ü�� ����======================");
		System.out.print(cal.get(Calendar.YEAR)+"�� ");
		System.out.print((cal.get(Calendar.MONTH)+1)+"�� ");
		System.out.print(cal.get(Calendar.DATE)+"�� ");
		System.out.print(cal.get(Calendar.HOUR)+"�� ");
		System.out.print(cal.get(Calendar.MINUTE)+"�� ");
		System.out.println(cal.get(Calendar.SECOND)+"�� ");
		cal2.set(2013,8,1);
		System.out.println(cal2);
		//���ú��� 6/18�ϱ��� dday����ϱ�
		//1970�� 1��1�� ���� (0:0:0) UTC
		Calendar today = new GregorianCalendar();
		Calendar dday = new GregorianCalendar();
		dday.set(2024,5,18);
		long time = dday.getTimeInMillis() - today.getTimeInMillis();
		System.out.println(time/1000/60/60/24);
		
	}
}