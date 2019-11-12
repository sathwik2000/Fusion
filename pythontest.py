import sys
arg=sys.argv[1:]
sum=0
f=1
print("python started")
if len(arg) > 0:
	for x in arg:
		sum = sum + 2*(int(x))
file1 = open("pyt.txt","w")
#sum=string(sum)
sum=str(sum)
file1.write(sum)
print("python ended")
