import java.util.*;
import java.io.*;
class toReminder1{
  public static void main(String args[])throws Exception{
    Scanner scr=new Scanner(System.in);
    Runtime rt = Runtime.getRuntime();
    FileWriter fw=null;
    ArrayList<Remember> users=new ArrayList<Remember>();
    String filepath="userdb.txt",p="\n";
    try{
      FileInputStream is = new FileInputStream(filepath);
      ObjectInputStream ois = new ObjectInputStream(is);
      Remember ri=null;
      while((ri=(Remember) ois.readObject())!=null){
        System.out.println(ri+" "+ri.userName);
          users.add(ri);
      }
      is.close();
      ois.close();
    }
    catch(Exception e){

    }
    Remember rfg=new Remember();
  //  try{
//users.add(rfg);
    /*  }
      catch(Exception er){

      }*/
    try{
    fw=new FileWriter("D:\\desktop\\cmds\\forremind.txt");
    fw.write("How many to remember enter when i print it on screen");
    fw.close();
    rt.exec("cmd.exe /c python texttospeech.py forremind.txt");
  }
  catch(Exception er){

  }
    System.out.print("How many to remember:");
    int t=scr.nextInt();
    FileWriter  fc=new FileWriter("D:\\desktop\\cmds\\usermail.txt");
    while(t!=0){
      try{
      fw=new FileWriter("D:\\desktop\\cmds\\forremind.txt");
      fw.write(" enter what to remember when i print it on screen");
      fw.close();
      rt.exec("cmd.exe /c python texttospeech.py forremind.txt");
    }
    catch(Exception er){}
      System.out.println("Now enter what to remember:");
      String f=scr.next()+scr.nextLine();
      try{
        f=f+" ";
      fc.write(f);
      fc.write(p);
    }
      catch(Exception ec){}
      rfg.addReminder(f,rfg);
      t--;
    }
    try{
    fc.close();}
    catch(Exception ec){}
    users.add(rfg);
      System.out.println(rfg.userName+" "+rfg+" "+rfg.toRemember.size()+" "+rfg.toRemember);
    try{
      FileOutputStream fil1 = new FileOutputStream(filepath);
      ObjectOutputStream o1 = new ObjectOutputStream(fil1);
      for(Remember i:users){
        System.out.println(i+" "+i.userName);
          o1.writeObject(i);
      }
      fil1.close();
      o1.close();}
      catch(Exception ey){
      }
  }
}
