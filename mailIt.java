import java.util.*;
import java.io.*;
class mailIt{
	public static void main(String args[])throws Exception{
		String e=args[0];
		String filepath="D:\\desktop\\cmds\\userdb.txt",p="\n";
		Remember r=null;
		try{
			FileInputStream is = new FileInputStream(filepath);
			ObjectInputStream ois = new ObjectInputStream(is);
			Remember ri=null;
			while((ri=(Remember) ois.readObject())!=null){
					if(ri.userName==e){
						r=ri;
						break;
					}
			}
			is.close();
			ois.close();
		}
		catch(Exception et){

		}
		if(r==null){
			System.out.println("invaled user name");
		}
		else{
		//	int t=r.toRemember.size();
			  FileWriter  fc=new FileWriter("D:\\desktop\\cmds\\usermail.txt");
			for(String ru:r.toRemember){
				      fc.write(ru);
							fc.write(p);
			}
			fc.close();
		}
	}
}
