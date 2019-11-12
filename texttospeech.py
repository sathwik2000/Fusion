import pyttsx3 
import sys
# initialisation
engine = pyttsx3.init()
engine.setProperty('rate', 160)    # Speed percent (can go over 100)
engine.setProperty('volume', 1)  # Volume 0-1
f=open(sys.argv[1],"r")
cont=f.read()
cont=cont.split("\n")
for x in cont:
    engine.say(x)
# testing 
engine.runAndWait() 
