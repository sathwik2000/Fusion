import datetime
 
class TimeInWords2():
    def __init__(self):
        self.words=["one", "two", "three", "four", "five", "six", "seven", "eight","nine", 
       "ten", "eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen",
       "seventeen", "eighteen", "nineteen", "twenty", "twenty one", 
       "twenty two", "twenty three", "twenty four", "twenty five", 
       "twenty six", "twenty seven", "twenty eight", "twenty nine", "half"]
         
 
         
 
    def caltime(self):
        dd=datetime.datetime.now()
        hrs = dd.hour
        mins = dd.minute
        header="It is "
        msg=""
        if (hrs >12):
            hrs=hrs-12
        if (mins == 0):
            hr = self.words[hrs-1]
            msg=header + hr + " o'clock."
        elif (mins < 31):      
               hr = self.words[hrs-1]
               mn = self.words[mins-1]
               msg = header + mn + " past " + hr + "."
        else:
            hr = self.words[hrs]
            mn =self.words[(60 - mins-1)]
            msg = header + mn + " to " + hr + "."
        return msg
 
 
if __name__ == '__main__':
    t = TimeInWords2()
    file1 = open("timenow.txt","w")
    file1.write(t.caltime())
