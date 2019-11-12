import java.io.*;
import java.util.*;
class Remember implements Serializable{
	Runtime rt = Runtime.getRuntime();
	FileWriter fw=null;
	String userName,r,testUserName,p="\n";
	ArrayList<String> toRemember =new ArrayList<String>();
	ArrayList<String> re=new ArrayList<String>();
	int count=0;
	Scanner sc = new Scanner(System.in);
	public Remember()throws Exception{
		File file=null;
	/*	try{
		 file=new File("username.txt");
		 Scanner sr = new Scanner(file);
		 while (sr.hasNext()) {
			 r=sr.next();
			 re.add(r);
		 }
	 }
	 catch(Exception ew){}*/
		int j=1;
	//	while(j!=0){
			j=0;
		/*	try{
			fw=new FileWriter("D:\\desktop\\cmds\\forremind.txt");
			fw.write("Enter user Name that you wanted when i print it on screen");
			fw.close();
			rt.exec("cmd.exe /c python texttospeech.py forremind.txt");
		}
		catch(Exception er){

		}*/
		/*  System.out.print("Enter user Name that you wanted please:");
			testUserName=sc.next();
			for(String t:re) {
				if(t.equals(testUserName)){
					j=2;
					break;
				}
			}*/
			/*if(j!=0){
				try{
				fw=new FileWriter("D:\\desktop\\cmds\\forremind.txt");
				fw.write("sorry this user name is not avilable");
				fw.close();
				rt.exec("cmd.exe /c python texttospeech.py forremind.txt");
			}
			catch(Exception er){

			}
		}*/
//	}
	testUserName=sc.next();
		userName=testUserName;
	/*	FileWriter fw=new FileWriter("D:\\desktop\\cmds\\username.txt");
		String y=userName+" ";
		fw.write(y);
		fw.close();*/
	}
/*	public void addReminder(String remember,Remember re){
		int i=re.toRemember.size();
		if(i!=11){
			re.toRemember.add(remember);
		}
		else{
			try{
			fw=new FileWriter("D:\\desktop\\cmds\\forremind.txt");
			fw.write("sorry limit exceded only 10 reminders allowed");
			fw.close();
			rt.exec("cmd.exe /c python texttospeech.py forremind.txt");
			System.out.println("sorry limit exceded");
		}
		catch(Exception er){

		}
		}
	}
	public void removeReminder(String remember,Remember re){
		int i=re.toRemember.size(),o=-1,g;
			re.toRemember.remove(remember);
	}*/
}
public class testRem{
public static void main(String args[])throws Exception{
	ArrayList<Remember> users=new ArrayList<Remember>();
	String filepath="userdb1",p="\n";
	try{
		FileInputStream is = new FileInputStream(filepath);
		ObjectInputStream ois = new ObjectInputStream(is);
		Remember ri=null;
		while((ri=(Remember) ois.readObject())!=null){
			System.out.println(ri+" 1 "+ri.userName);
				users.add(ri);
		}
		is.close();
		ois.close();
	}
	catch(Exception e){
System.out.println("1 "+e);
	}
	    Remember rfg=new Remember();
		//	rfg.addReminder("sathwik hi",rfg);
				users.add(rfg);
	try{
		FileOutputStream fil1 = new FileOutputStream(filepath);
		ObjectOutputStream o1 = new ObjectOutputStream(fil1);
		for(Remember i:users){
			System.out.println(i+" 2 "+i.userName);
				o1.writeObject(i);
		}
		fil1.close();
		o1.close();}
		catch(Exception ey){
				System.out.println("2 "+ey);
		}
		users.clear();
		try{
			FileInputStream is = new FileInputStream(filepath);
			ObjectInputStream ois = new ObjectInputStream(is);
			Remember ri=null;
			while((ri=(Remember) ois.readObject())!=null){
				System.out.println(ri+" 3 "+ri.userName);
					users.add(ri);
			}
			is.close();
			ois.close();
		}
		catch(Exception e){
			System.out.println("3 "+e);
		}
		try{
			FileOutputStream fil1 = new FileOutputStream(filepath);
			ObjectOutputStream o1 = new ObjectOutputStream(fil1);
			for(Remember i:users){
				System.out.println(i+" 4 "+i.userName);
					o1.writeObject(i);
			}
			fil1.close();
			o1.close();}
			catch(Exception ey){
				System.out.println("4 "+ey);
			}
}
}
