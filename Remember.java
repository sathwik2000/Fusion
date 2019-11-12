import java.io.*;
import java.util.*;
public class Remember implements Serializable{
	Runtime rt = Runtime.getRuntime();
	FileWriter fw=null;
	public String userName,r,testUserName,p="\n";
	public ArrayList<String> toRemember =new ArrayList<String>();
	public ArrayList<String> re=new ArrayList<String>();
	public int count=0;
	Scanner sc = new Scanner(System.in);
	public Remember()throws Exception{
		File file=null;
		try{
		 file=new File("username.txt");
		 Scanner sr = new Scanner(file);
		 while (sr.hasNext()) {
			 r=sr.next();
			 re.add(r);
		 }
	 }
	 catch(Exception ew){}
		int j=1;
		while(j!=0){
			j=0;
			try{
			fw=new FileWriter("D:\\desktop\\cmds\\forremind.txt");
			fw.write("Enter user Name that you wanted when i print it on screen");
			fw.close();
			rt.exec("cmd.exe /c python texttospeech.py forremind.txt");
		}
		catch(Exception er){

		}
		  System.out.print("Enter user Name that you wanted please:");
			testUserName=sc.next();
			for(String t:re) {
				if(t.equals(testUserName)){
					j=2;
					break;
				}
			}
			if(j!=0){
				try{
				fw=new FileWriter("D:\\desktop\\cmds\\forremind.txt");
				fw.write("sorry this user name is not avilable");
				fw.close();
				rt.exec("cmd.exe /c python texttospeech.py forremind.txt");
			}
			catch(Exception er){

			}
			}
	}
		userName=testUserName;
		FileWriter fw=new FileWriter("D:\\desktop\\cmds\\username.txt");
		String y=userName+" ";
		fw.write(y);
		fw.close();
	}
	public void addReminder(String remember,Remember re){
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
	}
}
