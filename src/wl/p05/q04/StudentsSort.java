package wl.p05.q04;

import java.util.ArrayList;
import java.util.Collections;

public class StudentsSort {
	public static void main(String[] args) {
		FileController fc = new FileController("student.txt");
		ArrayList<String> studstrls = fc.readLines();
		ArrayList<Student> stuarr = new ArrayList<Student>();
		for (String studstr : studstrls) {
			Student stud = new Student(studstr);
			stuarr.add(stud);
			System.out.println(stud);
		}
		System.out.println("====== After Sorting ======");
		Collections.sort(stuarr);
		for (Student stud : stuarr) {
			System.out.println(stud);
		}
	}
}
