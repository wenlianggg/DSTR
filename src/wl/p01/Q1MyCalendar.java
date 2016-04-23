package wl.p01;
/*===================================================================
Program Name    Q1MyCalendar.java
Description:	A class to perform date functions
Done by:		Goh Wen Liang
Admin No:		154473G
Module Group:	IT2525-03
=====================================================================*/

import java.util.*;

public class Q1MyCalendar {

	//Get the number of days for first date minus second date
	public static long getDifference (GregorianCalendar d1, 
								GregorianCalendar d2){
									
		long firstDate = d1.getTimeInMillis();
		long secDate = d2.getTimeInMillis();
		
		return (firstDate - secDate)/(24*60*60*1000);
	}
	public static String formatDate (GregorianCalendar d1){
		int day = d1.get(Calendar.DATE);
		int month = d1.get(Calendar.MONTH)+ 1 ;
		int year = d1.get(Calendar.YEAR);
		return day + "/" + month + "/" + year;
	}
	
	public static GregorianCalendar convertDate(String ds) {
		Scanner sc = new Scanner(ds);
		sc.useDelimiter("/");
		int day = sc.nextInt();
		int month = sc.nextInt() - 1;
		int year = sc.nextInt();
		System.out.println(day + "/" + + month + "/" + year);
		sc.close();
		return new GregorianCalendar(year, month, day);
	}

	public static void main (String args[]){
		GregorianCalendar d1 = new GregorianCalendar(2003, 1, 20);
		GregorianCalendar d2 = new GregorianCalendar(2003, 0, 16);
		System.out.println("First Date = " + formatDate(d1));
		System.out.println("Second Date = " + formatDate(d2));
		long days = getDifference(d1, d2);
		System.out.println("Difference in Days = " + days);;
	}
}

