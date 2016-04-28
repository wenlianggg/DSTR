package wl.p03;

import java.util.*;

import wl.p03.FileController;
import wl.p03.Student;

public class StudentApp {

	public static void main (String args[]){
		// declare and instantiate a FileController object
		// for text file "student.txt"
		FileController fc = new FileController("p02student.txt");
		ArrayList<String> recs = new ArrayList<String>();
		ArrayList<String> recsReturn;
		// add 2 more records to the recs ArrayList
		recs.add("031111A;Mary Tan;1/06/1981;100;100;90");
		recs.add("031112B;John Lim;2/06/1981;100;100;90");
		recs.add("031113C;Chew Puay Hern;2/06/1981;100;100;90");
		// invoke the writeLine method in FileController
		fc.writeLine(recs);
		// to write records to file
		// invoke the readLine methods in FileController to read
		recsReturn = fc.readLines();
		// records from file and stores the records in variable recsRetur
		// write a for loop to print out names of the students
		for (String eachstr : recsReturn) {
			System.out.println(new Student(eachstr).getName());
		}
	
	 }

}