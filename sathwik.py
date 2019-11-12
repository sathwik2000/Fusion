import os
import random
def getDirList(path):
	return os.listdir(path)

def rand(list):
	index = random.randint(0, len(list))
	return list[index] 

def play(mp3):
	os.system(mp3)


path = input("Enter File Path : ")
play(rand(getDirList(path)))	
