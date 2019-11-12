// Java Program to illustrate reading from Text File
// using Scanner Class
import java.io.*;
import java.util.Scanner;
public class Read
{
  public static void main(String[] args) throws Exception
  { 
    // pass the path to the file as a parameter
File file = new File("D:\\desktop\\cmds\\y.txt");
OutputStream outputStream = new FileOutputStream("D:\\desktop\\cmds\\output.txt");
BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
 // FileWriter fw=new FileWriter("ter.txt");
    Scanner sc = new Scanner(file);
String[] mi= new String[1000];
String r="",t="\n";
    while (sc.hasNext()) {
     if(r.equals("<DIR>")){
	r=sc.next();
	 writer.write(r);
	 writer.newLine();
	}
      r=sc.next();}
writer.close();
  }
}
