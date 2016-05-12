package wl.p05.q0203;

import java.util.ArrayList;
import java.util.Collections;


//==============================================================
//Program Name:	StudentSort.java (Practical 5 Q 2)
// Description:	...
//==============================================================
//import java.util.*;

public class StudentSort {
	public static void main (String args[]) {
		ArrayList<Student> stud = new ArrayList<Student>();
		stud.add(new Student("James", "123456A", 17));
		stud.add(new Student("Roy", "123456A", 19));
		stud.add(new Student("Wilfred", "123456A", 22));
		stud.add(new Student("Stanley", "123456A", 19));
		stud.add(new Student("Sherwin", "123456A",19));
		stud.add(new Student("Sherwin", "123456A", 17));
		stud.add(new Student("Dominic", "123456A", 18));
		stud.add(new Student("Dominic", "123456A", 16));
		Collections.sort(stud);
		for(Student stu : stud) {
			System.out.println(stu);
		}
	}
}