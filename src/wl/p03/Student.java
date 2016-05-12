package wl.p03;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

import wl.p01.Q1MyCalendar;
import wl.p05.q04.FileController;

public class Student {
	
	String adminNo, name;
	GregorianCalendar birthDate;
	int test1, test2, test3;
	
	public static void main(String[] args) {
		Student s1 = new Student("121212A", "Tan Ah Bee", "12/12/1992", 67, 72, 79);
		System.out.println(s1);
		FileController fc = new FileController("student.txt");
		Student s2 = new Student(fc.readLine());
		System.out.println(s2);
	}
	
	public String getAdminNo() {
		return adminNo;
	}

	public void setAdminNo(String adminNo) {
		this.adminNo = adminNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GregorianCalendar getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(GregorianCalendar birthDate) {
		this.birthDate = birthDate;
	}

	public int getTest1() {
		return test1;
	}

	public void setTest1(int test1) {
		this.test1 = test1;
	}

	public int getTest2() {
		return test2;
	}

	public void setTest2(int test2) {
		this.test2 = test2;
	}

	public int getTest3() {
		return test3;
	}

	public void setTest3(int test3) {
		this.test3 = test3;
	}
	
	public Student(String adminNo, String name, String birthDate, int test1, int test2, int test3) {
		this.adminNo = new String(adminNo);
		this.name = new String(name);
		this.birthDate = Q1MyCalendar.convertDate(birthDate);
		this.test1 = test1;
		this.test2 = test2;
		this.test3 = test3;
	}
	
	public Student(String studentRecord) {
		Scanner sc = new Scanner(studentRecord);
		sc.useDelimiter(";");
		this.adminNo = new String(sc.next());
		this.name = new String(sc.next());
		this.birthDate = Q1MyCalendar.convertDate(sc.next());
		this.test1 = sc.nextInt();
		this.test2 = sc.nextInt();
		this.test3 = sc.nextInt();
		sc.close();
	}
	
	public static ArrayList<Student> readStudent (String file){
		FileController fc = new FileController(file);
		ArrayList<Student> recs = new ArrayList<Student>();
		ArrayList<String> recsReturn;
		recsReturn = fc.readLines();
		for(String eachrecsReturn : recsReturn)
			recs.add(new Student(eachrecsReturn));
		return recs;
	}

	double calAvgScore() {
		return (test1 + test2 + test3)/3;
	}
	
	public String toString() {
		return this.name + " (" + this.adminNo + ") Avg Score: " + this.calAvgScore();
	}
}
