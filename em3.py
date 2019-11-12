import smtplib,sys
from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText
from email.mime.base import MIMEBase
from email import encoders

fromaddr = "fusionbysathwik@gmail.com"
toaddr = sys.argv[1]

# instance of MIMEMultipart
msg = MIMEMultipart()

# storing the senders email address
msg['From'] = fromaddr

# storing the receivers email address
msg['To'] = toaddr

# storing the subject
msg['Subject'] = sys.argv[3]

# string to store the body of the mail
body = "Body_of_the_mail"
text = "this is from fusion software"
html = """\
<html>
  <body>
    <p>
       hope you enjoyed if any suggestions please drop a mail to these<br>
       or to kothasathwik@gmail.com cick <a href="https://www.linkedin.com/in/kowtha-sathwik-251375169/">here</a> to know more about me<br>
       thank you<br>
       sathwik kowtha<br>
       kowthasathwik@gmail.com
    </p>
  </body>
</html>
"""

part1 = MIMEText(text, "plain")
part2 = MIMEText(html, "html")

# Add HTML/plain-text parts to MIMEMultipart message
# The email client will try to render the last part first
msg.attach(part1)
msg.attach(part2)
filename = "sendby"
filename = filename + sys.argv[2]
filename = filename + ".txt"
attachment = open("D:\\desktop\\cmds\\usermail.txt", "rb")

# instance of MIMEBase and named as p
p = MIMEBase('application', 'octet-stream')

# To change the payload into encoded form
p.set_payload((attachment).read())

# encode into base64
encoders.encode_base64(p)

p.add_header('Content-Disposition', "attachment; filename= %s" % filename)

# attach the instance 'p' to instance 'msg'
msg.attach(p)

# creates SMTP session
s = smtplib.SMTP('smtp.gmail.com', 587)

# start TLS for security
s.starttls()

# Authentication
s.login(fromaddr, "fusionsathwik2000")

# Converts the Multipart msg into a string
text = msg.as_string()

# sending the mail
s.sendmail(fromaddr, toaddr, text)

# terminating the session
s.quit()
