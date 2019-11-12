import webbrowser as wb
import sys
file1 = open("pyt.txt","r")
r=file1.read()
wb.open("https://google.com/search?q=%s" %r)
#sprintf(k,"%s\\pyt.txt",argv[1]);
