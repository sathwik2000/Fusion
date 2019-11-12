import java.util.*;
import java.io.*;
class eval{
	public static void main(String args[])throws IOException{
	    		String s1="googlesearch",s2="urlsearch",s3="calculator",s4="directory",s5="changedirectory",ans=args[0],j=" ";
		int sa1=-1,sa2=-1,sa3=-1,sa4=-1,sa5=-1,d=100,b,c;
ans=ans.toLowerCase();
if(ans.indexOf("goo")>=0||ans.indexOf("le")>=0){d=1;}
else if(ans.indexOf("url")>=0||ans.indexOf("ur")>=0||ans.indexOf("rl")>=0){d=2;}
else if(ans.indexOf("calc")>=0||ans.indexOf("later")>=0||ans.indexOf("lator")>=0||ans.indexOf("ca")>=0){d=3;}
else if(ans.indexOf("di")>=0&&ans.indexOf("ch")<0){d=4;}
else if(ans.indexOf("di")>=0&&ans.indexOf("ch")>=0){d=5;}
else if(ans.indexOf("mus")>=0){d=6;}
else if(ans.indexOf("fus")>=0){d=7;}
else if(ans.indexOf("tim")>=0){d=8;}
else if(ans.indexOf("he")>=0){d=9;}
else if(ans.indexOf("sh")>=0||ans.indexOf("sha")>=0||ans.indexOf("shut")>=0){d=10;}
else if(ans.indexOf("rest")>=0||ans.indexOf("sta")>=0||ans.indexOf("rest")>=0){d=11;}
else if(ans.indexOf("hibe")>=0||ans.indexOf("be")>=0||ans.indexOf("na")>=0||ans.indexOf("ate")>=0){d=12;}
else if(ans.indexOf("re")>=0||ans.indexOf("rem")>=0||ans.indexOf("reme")>=0||ans.indexOf("mem")>=0){d=13;}
else if((ans.indexOf("mai")>=0||ans.indexOf("ma")>=0||ans.indexOf("ail")>=0)&&(ans.indexOf("re")>=0||ans.indexOf("rem")>=0||ans.indexOf("reme")>=0||ans.indexOf("mem")>=0)){d=14;}
else if(ans.indexOf("mai")>=0||ans.indexOf("ma")>=0||ans.indexOf("ail")>=0){d=15;}
else if(ans.indexOf("bye")>=0||ans.indexOf("done")>=0||ans.indexOf("donefusion")>=0||ans.indexOf("ok")>=0){d=16;}
else if(!args[0].equals("None")){
		sa1=s1.compareToIgnoreCase(ans);
		sa2=s2.compareToIgnoreCase(ans);
		sa3=s3.compareToIgnoreCase(ans);
		sa4=s4.compareToIgnoreCase(ans);
		sa5=s5.compareToIgnoreCase(ans);
		if(sa1==0)
			d=1;
		else if(sa2==0)
			d=2;
		else if(sa3==0)
			d=3;
		else if(sa4==0)
			d=4;
		else if(sa5==0)
		    d=5;
		else{
			int[] a=new int[100];
			int[] a1=new int[100];
			int[] a2=new int[100];
			int[] a3=new int[100];
			int[] a4=new int[100];
			int[] a5=new int[100];
for(b=0;b<s1.length();b++){
if(s1.charAt(b)!=j.charAt(0)){
             int y=s1.charAt(b);
y=y-97;
		a[y]++;}
else
{
a[27]++;
}
	}
for(b=0;b<s2.length();b++){
if(s2.charAt(b)!=j.charAt(0)){
             int y=s2.charAt(b);
y=y-97;
		a1[y]++;}
else
{
a[27]++;
}

	}
for(b=0;b<s3.length();b++){
if(s3.charAt(b)!=j.charAt(0)){
                   int y=s3.charAt(b);
y=y-97;
		a2[y]++;}
else
{
a[27]++;
}
	}
for(b=0;b<s4.length();b++){
if(s4.charAt(b)!=j.charAt(0)){
                   int y=s4.charAt(b);
y=y-97;
		a3[y]++;}
else
{
a[27]++;
}
	}
for(b=0;b<s5.length();b++){
if(s5.charAt(b)!=j.charAt(0)){
                   int y=s5.charAt(b);
y=y-97;
		a4[y]++;}
else
{
a[27]++;
}
	}
for(b=0;b<ans.length();b++){
if(ans.charAt(b)!=j.charAt(0)){
                   int y=ans.charAt(b);
y=y-97;
		a5[y]++;}
else
{
a[27]++;
}
	}
if(sa1>sa2&&sa1>sa3&&sa1>sa4&&sa1>sa5)
d=1;
else if(sa2>sa1&&sa2>sa3&&sa2>sa4&&sa2>sa5)
d=2;
else if(sa3>sa1&&sa3>sa2&&sa3>sa4&&sa3>sa5)
d=3;
else if(sa4>sa1&&sa4>sa3&&sa4>sa2&&sa4>sa5)
d=4;
else if(sa5>sa1&&sa5>sa3&&sa5>sa2&&sa5>sa4)
d=5;

sa1=sa2=sa3=sa4=sa5=0;
if(sa1>=0||sa2>0||sa3>=0||sa4>=0||sa5>=0){
for(b=0;b<s1.length();b++)
sa1+=Math.min(a5[b],a[b]);
for(b=0;b<s2.length();b++)
sa2+=Math.min(a5[b],a1[b]);
for(b=0;b<s3.length();b++)
sa3+=Math.min(a5[b],a2[b]);
for(b=0;b<s4.length();b++)
sa4+=Math.min(a5[b],a3[b]);
if(sa1>sa2&&sa1>sa3&&sa1>sa4&&sa1>sa5)
d=1;
else if(sa2>sa1&&sa2>sa3&&sa2>sa4&&sa2>sa5)
d=2;
else if(sa3>sa1&&sa3>sa2&&sa3>sa4&&sa3>sa5)
d=3;
else if(sa4>sa1&&sa4>sa3&&sa4>sa2&&sa4>sa5)
d=4;
else if(sa5>sa1&&sa5>sa3&&sa5>sa2&&sa5>sa4)
d=5;}
		}
}
else{d=6;}
FileWriter fw=new FileWriter("outputd.txt");
String s=Integer.toString(d);
           fw.write(s);
fw.close();
System.out.println(d);
	}
}
