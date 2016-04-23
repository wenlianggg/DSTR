package wl.p01;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileController {
	private String fileName;
	
	FileController(String fileName) {
		this.fileName = fileName;
	}
	
	String readLine() {
        FileReader fr;
        Scanner sc;
        String str = null;
		try {
			fr = new FileReader(fileName);
	        sc = new Scanner(fr);
	         str = new String();
	        if (sc.hasNextLine()){
	        	str = sc.nextLine();
	        }
	        fr.close();
	        sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(str);
		return str;
	}
	
	void writeLine(String str) {
      try{
        //create the PrintWriter
  		FileWriter fw = new FileWriter(fileName);
  		BufferedWriter bw = new BufferedWriter(fw);
  		PrintWriter outFile = new PrintWriter(bw);
  		//write value out to the file
  		outFile.println(str);	  		
  		//close the file
  		outFile.close();
  		System.out.println("File created: " + fileName);
        }
        catch (IOException exception){
           System.out.println (exception);
        }
	}
	
	public static void main(String[] args) {
		FileController fc = new FileController("output.txt");
		fc.readLine();
	}
	
	
	
}
