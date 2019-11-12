#define WINVER 0x0500
#include <windows.h>
#include<stdlib.h>
#include<unistd.h>
#include<stdio.h>
#include<fcntl.h>
#include<string.h>
char *replaceWord(const char *s, const char *oldW,
                                 const char *newW)
{
    char *result;
    int i, cnt = 0;
    int newWlen = strlen(newW);
    int oldWlen = strlen(oldW);

    // Counting the number of times old word
    // occur in the string
    for (i = 0; s[i] != '\0'; i++)
    {
        if (strstr(&s[i], oldW) == &s[i])
        {
            cnt++;

            // Jumping to index after the old word.
            i += oldWlen - 1;
        }
    }

    // Making new string of enough length
    result = (char *)malloc(i + cnt * (newWlen - oldWlen) + 1);

    i = 0;
    while (*s)
    {
        // compare the substring with the result
        if (strstr(s, oldW) == s)
        {
            strcpy(&result[i], newW);
            i += newWlen;
            s += oldWlen;
        }
        else
            result[i++] = *s++;
    }

    result[i] = '\0';
    return result;
}
int main(int argc, char **argv){
char dire[1000]="",s[1000]="",k[1000]="",e[1000]="",g[1000]="",d1[1000]="",d2[1000]="",d3[1000]="",d4[1000]=" ",name[1000]="";
int i =0,a,b,c,d=10,n,sto=1,mail=-1,o=0;
system("cls");
sprintf(g,"cd %s && java GreetingMaker",argv[1]);
system(g);
//sprintf(k,"cd %s && python texttospeech.py greet.txt",argv[1]);
//system(k);
//sprintf(e,"cd %s && python texttospeech.py menu.txt",argv[1]);
//system(e);
//while(d!=17||(o==1&&d==100)){
/*printf("1:Google search just say google\n2:url search just say url\n3:calculator just say calculator\n4:directory just say directory\n5:changedirectoryjust say changedirectoryjust \n6:music just say play some music\n7:fusion just say fusion\n8:time just say time\n9:help just say help\n10:shutdown just say shutdown\n11:restart just say restart\n12:hibernate just say hibernet\n13:say somthing to remember for fusion just say remember\n14:get all thing that you asked fusion to remember just say mailreminders\n15:mail some one just say mail\n");*/
//if(o==0){
//sprintf(e,"cd %s && colo.bat",argv[1]);
//system(e);
//o=1;
//}
//sleep(2);
sprintf(e,"cd %s && python texttospeech.py fill.txt",argv[1]);
system(e);
sprintf(k,"%s\\info.txt",argv[1]);
FILE *tr;
   tr = fopen(k, "w");
fprintf(tr,"%s", "yes");
   fclose(tr);
sprintf(s,"cd %s && python %s.py",argv[1],argv[2]);
int h,r=4;
    system(s);
sprintf(k,"%s\\pyt.txt",argv[1]);
FILE* file = fopen (k, "r");
  fscanf (file, "%[^\n]s", &g);
  fclose(file);
char r1[1000]="google",r2[1000]="urlsearch",r3[1000]="calculator",r4[1000]="changdir";
sprintf(d2,"java eval %s",replaceWord(g,d4,d3));
system(d2);
sprintf(k,"%s\\outputd.txt",argv[1]);
FILE* file2 = fopen (k, "r");
  fscanf (file2, "%d", &d);
  fclose(file2);
/*if(strcmp(g,"None")!=0){
c=0;
int w[100]={0};
int x[100]={0};
for(a=0;a<strlen(g);a++){
	if(g[a]>='a'&&g[a]<='z'){
	   w[g[a]-'a']++;
	}
	else{
w[g[a]-'a'+32]++;
}
}
for(a=0;a<strlen(r1);a++){
	if(r1[a]>='a'&&r1[a]<='z'){
	   x[r1[a]-'a']++;
	}
}
for(a=0;a<27;a++){
if(w[a]==x[a]||(w[a]==x[a]-1)||(w[a]==x[a]+1)){
printf("%c %d %d1\n",a+65,w[a],x[a]);
if(w[a]!=0&&x[a]!=0)
c+=x[a];}
}
printf("%d\n",c);
if(c>=4){d=1;}
else{
    c=0;
int w[100]={0};
int x[100]={0};
for(a=0;a<strlen(g);a++){
	if(g[a]>='a'&&g[a]<='z'){
	   w[g[a]-'a']++;
	}
	else{
w[g[a]-'a'+32]++;
}
}
for(a=0;a<strlen(r1);a++){
	if(r2[a]>='a'&&r2[a]<='z'){
	   x[r2[a]-'a']++;
	}
}
for(a=0;a<27;a++){
if(w[a]==x[a]||(w[a]==x[a]-1)||(w[a]==x[a]+1)){
printf("%c %d %d1\n",a+65,w[a],x[a]);
if(w[a]!=0&&x[a]!=0)
c+=x[a];}
}
printf("%d\n",c);
if(c>=5){d=2;}
else{
     c=0;
int w[100]={0};
int x[100]={0};
for(a=0;a<strlen(g);a++){
	if(g[a]>='a'&&g[a]<='z'){
	   w[g[a]-'a']++;
	}
	else{
w[g[a]-'a'+32]++;
}
}
for(a=0;a<strlen(r1);a++){
	if(r3[a]>='a'&&r3[a]<='z'){
	   x[r3[a]-'a']++;
	}
}
for(a=0;a<27;a++){
if(w[a]==x[a]||(w[a]==x[a]-1)||(w[a]==x[a]+1)){
printf("%c %d %d1\n",a+65,w[a],x[a]);
if(w[a]!=0&&x[a]!=0)
c+=x[a];}
}
printf("%d\n",c);
if(c>=4){d=3;}
else{
    c=0;
int w[100]={0};
int x[100]={0};
for(a=0;a<strlen(g);a++){
	if(g[a]>='a'&&g[a]<='z'){
	   w[g[a]-'a']++;
	}
	else{
w[g[a]-'a'+32]++;
}
}
for(a=0;a<strlen(r1);a++){
	if(r4[a]>='a'&&r4[a]<='z'){
	   x[r4[a]-'a']++;
	}
}
for(a=0;a<27;a++){
if(w[a]==x[a]||(w[a]==x[a]-1)||(w[a]==x[a]+1)){
printf("%c %d %d1\n",a+65,w[a],x[a]);
if(w[a]!=0&&x[a]!=0)
c+=x[a];}
}
printf("%d\n",c);
if(c>=2){d=4;}
else{
    d=9;
}
}
}
}
}*/
switch(d){
  case 1:
        sprintf(s,"cd %s && python texttospeech.py info.txt",argv[1]);
        system(s);
        sprintf(s,"cd %s &&python texttospeech.py googleinfo.txt",argv[1]);
        system(s);
        sprintf(s,"cd %s && python %s.py >",argv[1],argv[2]);
        system(s);
        sprintf(k,"cd %s && python googleit.py",argv[1]);
        system(k);
        break;
 case 2:
        sprintf(s,"cd %s && python texttospeech.py info.txt",argv[1]);
        system(s);
        sprintf(s,"cd %s &&python texttospeech.py urlinfo.txt",argv[1]);
        system(s);
        sprintf(s,"cd %s && python %s.py",argv[1],argv[2]);
        system(s);
        sprintf(k,"cd %s && python urlit.py",argv[1]);
        system(k);
        break;
 case 3:
        sprintf(s,"cd %s && python texttospeech.py info.txt",argv[1]);
        system(s);
        sprintf(s,"cd %s &&python texttospeech.py calinfo.txt",argv[1]);
        system(s);
        sprintf(s,"start calc");
        system(s);
        break;
 case 4:
        sprintf(s,"cd %s && python texttospeech.py info.txt",argv[1]);
        system(s);
        sprintf(s,"cd %s &&python texttospeech.py dirinfo.txt",argv[1]);
        system(s);sprintf(s,"dir > D:\\desktop\\cmds\\y.txt");
        system(s);
        sprintf(s,"java Read");
        system(s);
	FILE* f1 = fopen("D:\\desktop\\cmds\\outputforjava.txt", "w");
        FILE* fptr = fopen("D:\\desktop\\cmds\\output.txt", "r");
        if (fptr == NULL)
        {
            printf("Cannot open file \n");

        }

        // Read contents from file
        c = fgetc(fptr);
        while (c != EOF)
        {
            fprintf(f1,"%c", c);
            c = fgetc(fptr);
        }

        fclose(fptr);
	fclose(f1);
        break;
 case 5:
        sprintf(s,"cd %s && python texttospeech.py info.txt",argv[1]);
        system(s);
        sprintf(s,"cd %s&&python texttospeech.py chdirinfo.txt",argv[1]);
        system(s);
        sprintf(s,"cd %s && dir > D:\\desktop\\cmds\\y.txt",argv[1]);
        system(s);
        sprintf(s,"java Read");
        system(s);
	FILE* f1 = fopen("D:\\desktop\\cmds\\outputforjava.txt", "w");
        FILE* fptr = fopen("D:\\desktop\\cmds\\output.txt", "r");
        if (fptr == NULL)
        {
            printf("Cannot open file \n");

        }

        // Read contents from file
        c = fgetc(fptr);
        while (c != EOF)
        {
            fprintf(f1,"%c", c);
            c = fgetc(fptr);
        }

        fclose(fptr);
	fclose(f1);
        char sd[100];
        system(s);
        sprintf(s,"cd %s&&python texttospeech.py chdirinfo3.txt",argv[1]);
        system(s);
        printf("enter the directory to which you what to go:");
        scanf("%s",sd);
        sprintf(s,"cd %s && dir >D:\\desktop\\cmds\\y.txt",sd);
        system(s);
        sprintf(s,"java Read");
        system(s);
	FILE* f1 = fopen("D:\\desktop\\cmds\\outputforjava.txt", "w");
        FILE* fptr = fopen("D:\\desktop\\cmds\\output.txt", "r");
        if (fptr == NULL)
        {
            printf("Cannot open file \n");

        }

        // Read contents from file
        c = fgetc(fptr);
        while (c != EOF)
        {
            fprintf(f1,"%c", c);
            c = fgetc(fptr);
        }

        fclose(fptr);
	fclose(f1);
        break;
case 6:
        sprintf(s,"cd %s && python texttospeech.py info.txt ",argv[1]);
        system(s);
        sprintf(s,"cd %s && python texttospeech.py musicguid.txt",argv[1]);
        system(s);
        sprintf(s,"cd %s && python music.py",argv[1]);
        //printf("%s",s);
        system(s);
        sprintf(k,"%s\\musictoplay.txt",argv[1]);
        file = fopen (k, "r");
        fscanf (file, "%s", &g);
        fclose(file);
        sprintf(s,"start %s",g);
        system(s);
        break;
case 7:
        sprintf(s,"cd %s && python texttospeech.py info.txt ",argv[1]);
        system(s);
        sprintf(s,"cd %s && python texttospeech.py fusion.txt",argv[1]);
        system(s);
        sprintf(s,"cd %s && python fusionadd.py",argv[1]);
        system(s);
        system(s);
        break;
case 8:
        sprintf(s,"cd %s && python texttospeech.py info.txt ",argv[1]);
        system(s);
        sprintf(s,"python time.py");
        system(s);
        sprintf(s,"cd %s && python texttospeech.py timenow.txt",argv[1]);
        system(s);
        break;
case 9:
        sprintf(e,"cd %s && python texttospeech.py menu.txt",argv[1]);
        system(e);
        break;
case 10:
        sprintf(e,"cd %s && python texttospeech.py shutdown.txt",argv[1]);
        system(e);
        sprintf(e,"shutdown /s");
        system(e);
        break;
case 11:
        sprintf(e,"cd %s && python texttospeech.py restart.txt",argv[1]);
        system(e);
        sprintf(e,"shutdown /r");
        system(e);
        break;
case 12:
        sprintf(e,"cd %s && python texttospeech.py hibernet.txt",argv[1]);
        system(e);
        sprintf(e,"shutdown /h");
        system(e);
        break;
case 13:
        sprintf(e,"cd %s && python texttospeech.py mailinfo.txt",argv[1]);
        system(e);
        printf("enter 1 if you used this option before else any integer ");
        int r;
        scanf("%d",&r);
        char re[1000]="";
        if(r==1){
          sprintf(e,"cd %s && python texttospeech.py mailinfo5.txt",argv[1]);
          system(e);
          char use[1000];
          printf("Enter user name:");
          scanf("%s",use);
          sprintf(e,"cd %s && python rem.py 1 %s",argv[1],use);
          system(e);
        }
        else{
        //strcpy(re,"toReminder1");
        sprintf(e,"cd %s && python rem.py 0",argv[1]);
        system(e);
        }
        //system("colo.bat");
        printf("enter 1 if you need a copy of all reminders you said to your mail ");
        scanf("%d",&r);
        if(r==1){
          sprintf(e,"cd %s && python texttospeech.py mailinfo1.txt",argv[1]);
          system(e);
          printf("enter your mail id :");
          char mail[1000];
          scanf("%s",mail);
          sprintf(e,"cd %s && python em.py %s",argv[1],mail);
          system(e);
        }
        break;
case 14:
        sprintf(e,"cd %s && python texttospeech.py mailinfo4.txt",argv[1]);
        system(e);
        printf("enter your user name :");
        char mail[1000],us[1000];
        scanf("%s",us);
        sprintf(e,"cd %s && python texttospeech.py mailinfo1.txt",argv[1]);
        system(e);
        printf("enter your mail id:");
        scanf("%s",mail);
        sprintf(e,"cd %s && python rem.py 2 %s",argv[1],us);
        system(e);
        sprintf(e,"cd %s && python em.py %s",argv[1],mail);
        system(e);
        break;
case 15:
        sprintf(e,"cd %s && python texttospeech.py mailing.txt",argv[1]);
        system(e);
        sprintf(e,"cd %s && python mailing.py",argv[1]);
        system(e);
case 16:
        break;
default:
        sprintf(e,"cd %s && python texttospeech.py default.txt",argv[1]);
        system(e);
        sprintf(e,"cd %s && start microphone.result.wav",argv[1]);
        system(e);
        printf("sorry i did not get you");
}
//scanf("%d",&d);
//}
sprintf(s,"cd %s && python texttospeech.py ending.txt",argv[1]);
    system(s);
//TODO: SATHWIK
return 0;
}
