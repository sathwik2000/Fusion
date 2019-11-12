#include <windows.h>
#include<stdlib.h> 
#include<unistd.h> 
#include<stdio.h> 
#include<fcntl.h>
#include<string.h>
int main(){
char g[1000]="";
sprintf(g,"cd D:\\desktop\\cmds && g1 D:\\desktop\\cmds testvoice");
system(g);
}