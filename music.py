import os,random,time,sys,wave

mp3s = []
mediapath = "C:/Users/Administrator/Desktop/songs"

for path,directory,element in os.walk(mediapath,False):
	print("Loading music from" + path + "...")
	tmparray = element

	for i in range(0,len(tmparray)-1):
		if(tmparray[i][-3:] == "mp3" and tmparray[i][:1] != "."):
			mp3s.append(tmparray[i])
		else:
			print("Unuseable:",tmparray[i])

	print("Loaded" + str(len(mp3s)) + "files, of" + str(len(element)) + "total")

random.shuffle(mp3s)
for i in range(0,len(tmparray)-1):
	#print(mp3s[i])
	#os.system("mpg123 '" + mediapath + mp3s[i] + "'")
	time.sleep(1)
i=random.randint(0,len(tmparray)-2)
s="C:\\Users\\Administrator\\Desktop\\songs\\"+mp3s[i]
file1 = open("musictoplay.txt","w")
file1.write(s)
file1.close()
#w = wave.open(s,"r")
'''import pygame
from Tkinter import *
file = 'C:/Users/Administrator/Desktop/songs/NaalonaPongenu.mp3'
root = Tk()
pygame.init()
pygame.mixer.init()
pygame.mixer.music.load(file)
pygame.mixer.music.play()
root.mainloop()'''
