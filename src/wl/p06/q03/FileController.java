package wl.p06.q03;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileController
{
  private String file;
  
  public FileController(String file)
  {
    this.file = file;
  }
  
  public void writeLine(ArrayList<String> records)
  {
    try
    {
      FileWriter fw = new FileWriter(this.file);
      BufferedWriter bw = new BufferedWriter(fw);
      PrintWriter outFile = new PrintWriter(bw);
      for (int i = 0; i < records.size(); i++) {
        outFile.println((String)records.get(i));
      }
      outFile.close();
      System.out.println("Student file created: " + this.file);
    }
    catch (IOException exception)
    {
      System.out.println(exception);
    }
  }
  
  public ArrayList<String> readLine()
  {
    ArrayList<String> records = new ArrayList();
    try
    {
      FileReader fr = new FileReader(this.file);
      Scanner sc = new Scanner(fr);
      while (sc.hasNextLine()) {
        records.add(sc.nextLine());
      }
      fr.close();
    }
    catch (FileNotFoundException exception)
    {
      System.out.println("The file " + this.file + " was not found.");
    }
    catch (IOException exception)
    {
      System.out.println(exception);
    }
    return records;
  }
  
  public void writeLine(String oneRec)
  {
    try
    {
      FileWriter fw = new FileWriter(this.file);
      BufferedWriter bw = new BufferedWriter(fw);
      PrintWriter outFile = new PrintWriter(bw);
      
      outFile.println(oneRec);
      
      outFile.close();
      System.out.println("Book file created: " + this.file);
    }
    catch (IOException exception)
    {
      System.out.println(exception);
    }
  }
}

