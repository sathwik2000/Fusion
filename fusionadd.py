file1 = open("suggesions.txt","a+")
s=input("say your suggesion")
s=s+"\n"
file1.write(s)
file1.close()
