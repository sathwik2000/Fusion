import java.util.*;
import java.io.*;
class toReminder{
  public static void main(String args[])throws Exception{
    Scanner scr=new Scanner(System.in);
		Runtime rt = Runtime.getRuntime();
		FileWriter fw=null;
		Remember r=null;
		String userName=args[0];
		System.out.println(userName);
    ArrayList<Remember> users=new ArrayList<>();
    String filepath="userdb.txt",p="\n";
    try{
      FileInputStream is = new FileInputStream(filepath);
      ObjectInputStream ois = new ObjectInputStream(is);
      Remember ri=null;
      while((ri=(Remember) ois.readObject())!=null){
				System.out.println(ri.userName);
				if(ri.userName==userName){
					r=ri;
				}
          users.add(ri);
      }
      is.close();
      ois.close();
    }
    catch(Exception e){

    }
		if(r!=null){
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
		catch(Exception er1){
		}
		String f=scr.next()+scr.nextLine();
		f=f+" ";
		fc.write(f);
		fc.write(p);
		r.addReminder(f,r);
      t--;
    }
		fc.close();
	}
	else{
		try{
		fw=new FileWriter("D:\\desktop\\cmds\\forremind.txt");
		fw.write(" wrong user name please check");
		fw.close();
		rt.exec("cmd.exe /c python texttospeech.py forremind.txt");
	}
	catch(Exception er){

	}
		System.out.println("wrong user name");
	}
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
