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
char dire[1000]="",s[1000]="",k[1000]="",e[1000]="",g[1000]="",d1[1000]="",d2[1000]="",d3[1000]="",d4[1000]=" ";
int i =0,a,b,c,d=10,n;
printf("menu\n1:Google search\n2:url search\n3:calculator\n4:change dir\n");
sprintf(s+strlen(s),"cd %s && python %s.py",argv[1],argv[2]);
int h,r=4;
    system(s);
sprintf(k,"%s\\pyt.txt",argv[1]);
FILE* file = fopen (k, "r");
  fscanf (file, "%[^\n]s", &g);
  fclose(file);
  printf("%s\n",g);
char r1[1000]="google",r2[1000]="urlsearch",r3[1000]="calculator",r4[1000]="changdir";
printf("%s\n",replaceWord(g,d4,d3));
sprintf(d4,"java eval %s",replaceWord(g,d4,d3));
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
printf("%d/n",d);
switch(d){
    case 1:sprintf(s,"cd %s && python %s.py",argv[1],argv[2]);
    system(s);
    sprintf(k,"%s\\pyt.txt",argv[1]);
file = fopen (k, "r");
  fscanf (file, "%s", &g);
  fclose(file);
  printf("%s argument\n",g);
  sprintf(k,"cd %s && python googleit.py %s",argv[1],g);
  system(k);
 break;
 case 2:sprintf(s,"cd %s && python %s.py",argv[1],argv[2]);
    system(s);
    sprintf(k,"%s\\pyt.txt",argv[1]);
file = fopen (k, "r");
  fscanf (file, "%s", &g);
  fclose(file);
  sprintf(k,"cd %s && python urlit.py %s",argv[1],g);
system(k);
 break;
 case 3:sprintf(s,"start calc");
 system(s);
 break;
 case 4:sprintf(s,"dir > C:\\Users\\Administrator\\Desktop\\cmds\\y.txt");
 system(s);
 sprintf(s,"java Read");
 system(s);
 FILE* fptr = fopen("C:\\Users\\Administrator\\Desktop\\cmds\\output.txt", "r"); 
    if (fptr == NULL) 
    { 
        printf("Cannot open file \n"); 
        
    } 
  
    // Read contents from file 
    c = fgetc(fptr); 
    while (c != EOF) 
    { 
        printf ("%c", c); 
        c = fgetc(fptr); 
    } 
  
    fclose(fptr);
    break;
    default:printf("speak properly");
}
//TODO: SATHWIK 
return 0;
}
