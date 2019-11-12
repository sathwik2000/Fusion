import os
print(" Enter all the content that you want to send and then enter fusion done and then press enter after that enter mail id to whome to send then it will be sent")
print("------------------------------------------------------------------------------------------------------------------------------------------------------------")
end=str("fusion done")
file=open("usermail.txt","w+")
file.close()
sub=input("Enter subject of mail:")
s=input("Body:")
if(s.strip().lower().find(end.strip().lower())!=-1):
    file=open("usermail.txt","a+")
    f=f+"\n"
    file.write(f)
    file.close()
while s.strip().lower().find(end.strip().lower())==-1:
    #print(s,s.strip().lower(),s.strip().lower().find(end.strip().lower()))
    file=open("usermail.txt","a+")
    s=s+"\n"
    file.write(s)
    file.close()
    s=input()
    if(s.strip().lower().find(end.strip().lower())!=-1):
        f=s[:s.strip().lower().find(end.strip().lower())]
        file=open("usermail.txt","a+")
        f=f+"\n"
        file.write(f)
        file.close()
        break
id=input("Enter mail id to send:")
fi=open("mailingid.txt","w+")
fi.write(id)
fi.close()
fi=open("mailingsendname.txt","w+")
fi.write(input("enter sender name"))
fi.close()
fi=open("mailingsub.txt","w+")
fi.write(sub)
fi.close()
to="start /wait cmd /c cd D:\\desktop\\cmds && python em4.py "
to=to+sub
os.system(to)
