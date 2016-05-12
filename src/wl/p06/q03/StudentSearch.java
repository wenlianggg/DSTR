package wl.p06.q03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> studentList = Student.readStudent("student.txt");
		ArrayList<String> adminNums = new ArrayList<String>();
		Collections.sort(studentList);
		for (Student stud : studentList) {
			adminNums.add(stud.getAdminNo());
		}
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.print("***Enter student admin number: ");
			String toFind = sc.next();
			if(toFind.equalsIgnoreCase("quit"))
				break;
			int location = Collections.binarySearch(adminNums, toFind);
			if (location >= 0) {
				Student stu = studentList.get(location);
				System.out.println("Admin No:" + stu.getAdminNo());
				System.out.println("Name: " + stu.getName());
				System.out.println("Test 1: " + stu.getTest1());
				System.out.println("Test 2: " + stu.getTest2());
				System.out.println("Test 3: " + stu.getTest3());
			} else {
				System.out.println("Student record not found.");
			}
		}
		System.out.println("Good-bye!");
		sc.close();
	}

}
