import java.util.*;
import java.io.*;
class Add{
public static void main(String args[])throws IOException{
  System.out.println("welcome to java execution starts");
  int y=0;
  for(int j=0;j<args.length;j++){
    try{
      y+=Integer.parseInt(args[j]);
    }
    catch(Exception e){}
    }
    String s=Integer.toString(y);
try{
  FileWriter fw=new FileWriter("r.txt");
  fw.write(s);
  fw.close();
}
   catch(Exception u){}
     System.out.println("Bye from java execution ends");
   }
}
