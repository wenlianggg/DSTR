package wl.p06.q03;

import java.util.GregorianCalendar;
import java.util.StringTokenizer;

public class MyCalendar {
	public static long getDifference(GregorianCalendar d1, GregorianCalendar d2) {
		long firstDate = d1.getTimeInMillis();
		long secDate = d2.getTimeInMillis();

		return (firstDate - secDate) / 86400000L;
	}

	public static String formatDate(GregorianCalendar d1) {
		int day = d1.get(5);
		int month = d1.get(2) + 1;
		int year = d1.get(1);
		return day + "/" + month + "/" + year;
	}

	public static GregorianCalendar convertDate(String date) {
		StringTokenizer tokenizer = new StringTokenizer(date, "/");
		int day = Integer.parseInt(tokenizer.nextToken());
		int month = Integer.parseInt(tokenizer.nextToken());
		int year = Integer.parseInt(tokenizer.nextToken());
		return new GregorianCalendar(year, month - 1, day);
	}
}
