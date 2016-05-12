package wl.p06.q03;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Student implements Comparable<Student> {
	private String adminNo;
	private String name;
	private GregorianCalendar birthDate;
	private int test1;
	private int test2;
	private int test3;

	public Student(String adminNo, String name, GregorianCalendar birthDate) {
		this.adminNo = adminNo;
		this.name = name;
		this.birthDate = birthDate;
	}

	public Student(String record) {
		Scanner sc = new Scanner(record);
		sc.useDelimiter(";");
		this.adminNo = sc.next();
		this.name = sc.next();
		this.birthDate = MyCalendar.convertDate(sc.next());
		this.test1 = sc.nextInt();
		this.test2 = sc.nextInt();
		this.test3 = sc.nextInt();
		sc.close();
	}

	public String getAdminNo() {
		return this.adminNo;
	}

	public String getName() {
		return this.name;
	}

	public GregorianCalendar getBirthDate() {
		return this.birthDate;
	}

	public int getTest1() {
		return this.test1;
	}

	public int getTest2() {
		return this.test2;
	}

	public int getTest3() {
		return this.test3;
	}

	public void setAdminNo(String adminNo) {
		this.adminNo = adminNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthDate(GregorianCalendar birthDate) {
		this.birthDate = birthDate;
	}

	public void setTest1(int test1) {
		this.test1 = test1;
	}

	public void setTest2(int test2) {
		this.test2 = test2;
	}

	public void setTest3(int test3) {
		this.test3 = test3;
	}

	public int compareTo(Student s) {
		Student temp = s;

		int result = getAdminNo().compareTo(temp.getAdminNo());
		return result;
	}

	public double averageScore() {
		return (this.test1 + this.test2 + this.test3) / 3.0D;
	}

	public void display() {
		System.out.println("AdminNo: " + this.adminNo);
		System.out.println("Name: " + this.name);
		System.out.println("Test 1: " + this.test1);
		System.out.println("Test 2: " + this.test2);
		System.out.println("Test 3: " + this.test3);
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("#.##");
		return this.adminNo + "\t" + this.name + "\t" + MyCalendar.formatDate(this.birthDate) + "\t"
				+ df.format(averageScore());
	}

	public static ArrayList<Student> readStudent(String file) {
		FileController f = new FileController(file);

		ArrayList<Student> recs = new ArrayList<Student>();

		ArrayList<String> recsReturn = f.readLine();
		for (int i = 0; i < recsReturn.size(); i++) {
			String oneRec = (String) recsReturn.get(i);
			Student s = new Student(oneRec);
			recs.add(s);
		}
		return recs;
	}
}
