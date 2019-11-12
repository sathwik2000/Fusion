import java.io.*;
import java.util.*;
class comput{
	Runtime rt = Runtime.getRuntime();
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
