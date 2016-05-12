package wl.p05.q01;

import java.util.*;


public class SortPhoneList{
	//-----------------------------------------------------------------
	//  Creates an array of Contact objects, sorts them, then prints
	//  them.
	//-----------------------------------------------------------------
	public static void main (String[] args){
		ArrayList<Contact> cts = new ArrayList<Contact>();
		cts.add(new Contact("James", "Escabas", "91234567"));
		cts.add(new Contact("Roy", "Tang", "91234567"));
		cts.add(new Contact("Wilfred", "Kang", "91234567"));
		cts.add(new Contact("Stanley", "Lee", "91234567"));
		cts.add(new Contact("Sherwin", "Chan", "91234567"));
		cts.add(new Contact("Jing Zhi", "Tan", "91234567"));
		cts.add(new Contact("Eugene", "Kuo", "91234567"));
		cts.add(new Contact("Dominic", "Gian", "91234567"));
		Collections.sort(cts);
		for(Contact ct : cts) {
			System.out.println(ct);
		}

	}
}
