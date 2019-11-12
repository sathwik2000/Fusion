import smtplib,sys
f=open("mailingid.txt","r")
TO = f.read()
f=open("mailingsub.txt","r")
SUBJECT = f.read()
file=open("usermail.txt","r")
cr=file.read()
cr=cr.split("\n")
pi = cr
TEXT=""
for f in pi:
    TEXT=TEXT+f+"\n"
f=open("mailingsendname.txt","r")
sender=f.read()
TEXT=TEXT+"\n"
TEXT=TEXT+"sended by "+sender+"\n"
TEXT=TEXT+"--------------------------------------------------------------------------------------------------------\n"
TEXT=TEXT+"than you for using fusion\nfusion (@sathwik)\nif any query please drop a mail to(kowthasathwik@gmail.com)"
# Gmail Sign In
gmail_sender = 'fusionbysathwik@gmail.com'
gmail_passwd = 'fusionsathwik2000'

server = smtplib.SMTP('smtp.gmail.com', 587)
server.ehlo()
server.starttls()
server.login(gmail_sender, gmail_passwd)

BODY = '\r\n'.join(['To: %s' % TO,
                    'From: %s' % gmail_sender,
                    'Subject: %s' % SUBJECT,
                    '', TEXT])

try:
    server.sendmail(gmail_sender, [TO], BODY)
    print ('email sent')
except:
    print ('error sending mail')

server.quit()
