import pickle
import sys
import os
class remember:
    username=""
    toremind=[]
    def __init__(self):
        c=[]
        try:
            file=open("usernames.txt","r")
            c=file.read()
            file.close()
            c=c.split("\n")
        except:
            print()
        file3=open("voice.txt","w+")
        file3.write("enter user name that you want when i ask it on screen")
        file3.close()
        os.system("start /wait cmd /c cd D:\\desktop\\cmds && python texttospeech.py voice.txt")
        s=input("enter username that you want")
        '''t=0
        while t!=1:
            t=0
            for x in c:
                if(x==s):
                    t=1
            if t==1:'''
        while c.count(s)!=0:
            file3=open("voice.txt","w+")
            file3.write("That user name is not avilable please select other")
            file3.close()
            os.system("start /wait cmd /c cd D:\\desktop\\cmds && python texttospeech.py voice.txt")
            s=input("That username is not avilable please select other")
        self.username=s
        file1=open("usernames.txt","a+")
        r=self.username+"\n"
        file1.write(r)
        file1.close()
    #def addremember(self,rem)
mail=[]
a=int(sys.argv[1])
if a is 1 or a is 2:
    b=sys.argv[2]
    #print(b)
#print(a)
print(a==0)
if a is 0:
    r=remember()
    file3=open("voice.txt","w+")
    file3.write("enter How many to remember when i ask you on screen")
    file3.close()
    os.system("start /wait cmd /c cd D:\\desktop\\cmds && python texttospeech.py voice.txt")
    print("How many to remember")
    i=int(input())
    while i!=0:
        file3=open("voice.txt","w+")
        file3.write("enter what to remember when i ask you on screen")
        file3.close()
        os.system("start /wait cmd /c cd D:\\desktop\\cmds && python texttospeech.py voice.txt")
        print("enter what to remember")
        si=input()
        r.toremind.append(si)
        i=i-1
    keys=['username','toremind']
    values=[r.username,r.toremind]
    ter=dict(zip(keys,values))
    mail=r.toremind
    try:
        pickle_out=open('userdb.txt', 'rb')
        db=pickle.load(pickle_out)
        pickle_out.close()
    except:
        db={}
    db[r.username]=ter
    pickle_out=open('userdb.txt', 'wb+')
    pickle.dump(db, pickle_out)
    pickle_out.close()
elif a is 1:
    try:
        pickle_out=open('userdb.txt', 'rb')
        db=pickle.load(pickle_out)
        pickle_out.close()
    except:
        db={}
    try:
        r=db[b]['toremind']
        file3=open("voice.txt","w+")
        file3.write("enter How many to remember when i ask you on screen")
        file3.close()
        os.system("start /wait cmd /c cd D:\\desktop\\cmds && python texttospeech.py voice.txt")
        print("How may to remember")
        i=int(input())
        while i!=0:
            file3=open("voice.txt","w+")
            file3.write("enter what to remember when i ask you on screen")
            file3.close()
            os.system("start /wait cmd /c cd D:\\desktop\\cmds && python texttospeech.py voice.txt")
            print("enter what to remember")
            si=input()
            r.append(si)
            i=i-1
        keys=['username','toremind']
        values=[db[b]['username'],r]
        mail=r
        ter=dict(zip(keys,values))
        db[b]=ter
        pickle_out=open('userdb.txt', 'wb+')
        pickle.dump(db, pickle_out)
        pickle_out.close()
    except e:
        file3=open("voice.txt","w+")
        file3.write("you have entered wrong user name check it")
        file3.close()
        os.system("start /wait cmd /c cd D:\\desktop\\cmds && python texttospeech.py voice.txt")
        print(" wrong user name")
        sys.exit()
else:
    try:
        pickle_out=open('userdb.txt', 'rb')
        db=pickle.load(pickle_out)
        pickle_out.close()
    except:
        db={}
    try:
        mail=db[b]['toremind']
    except:
        file3=open("voice.txt","w+")
        file3.write("you have entered wrong user name check it")
        file3.close()
        os.system("start /wait cmd /c cd D:\\desktop\\cmds && python texttospeech.py voice.txt")
        print(" wrong user name")
        sys.exit()
with open('usermail.txt', 'w') as f:
    for item in mail:
        f.write("%s\n" % item)
'''pickle_out=open('userdb.txt', 'rb')
db=pickle.load(pickle_out)
for keys in db:
    print(keys,'=>',db[keys])
#pickle.dump(r, pickle_out)
pickle_out.close()'''
