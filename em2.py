import smtplib,sys
from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText
from email.mime.base import MIMEBase
from email import encoders
fromaddr = "fusionbysathwik@gmail.com"
toaddr = sys.argv[1]
msg = MIMEMultipart()
msg['From'] = fromaddr
msg['To'] = toaddr
msg['Subject'] = "form fusion software"
part=[]
f=open("D:\\desktop\\cmds\\mailto.txt","r")
c=f.read()
c.split("\n")
h=0
part6=MIMEText(c, 'plain', 'utf-8')
body = "form fusion"
html = """\
<html>
  <body>
    <p>
    <br>
    -----------------------------------------------------------------------------------------------------------------------------<br>
       hope you enjoyed if any suggestions please drop a mail to these<br>
       or to kothasathwik@gmail.com click <a href="https://www.linkedin.com/in/kowtha-sathwik-251375169/">here</a> to know more about me<br>
       thank you<br>
       sathwik kowtha<br>
       kowthasathwik@gmail.com
    </p>
  </body>
</html>
"""
part2 = MIMEText(html, "html")
msg.attach(part6)
msg.attach(part2)
filename = "fusionisaskedtoreminded.txt"
attachment = open("D:\\desktop\\cmds\\usermail.txt", "rb")
p = MIMEBase('application', 'octet-stream')
p.set_payload((attachment).read())
#encoders.encode_base64(p)
#msg.attach(p)
s = smtplib.SMTP('smtp.gmail.com', 587)
s.starttls()
s.login(fromaddr, "fusionsathwik2000")
text = msg.as_string()
s.sendmail(fromaddr, toaddr, text)
s.quit()
