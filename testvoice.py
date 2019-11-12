import speech_recognition as sr
import time
import webbrowser as wb
import os
r = sr.Recognizer()
response = {
    "success": True,
    "error": None,
    "transcription": None
}
recognizer = sr.Recognizer()
microphone = sr.Microphone()
recognizer.energy_threshold = 5000
#recognizer.dynamic_energy_threshold = True
fi=open("startspeech.txt","w+")
fi.write("start speaking when i print on screen")
fi.close()
os.system("python texttospeech.py startspeech.txt")
print("start")
with microphone as source:
    recognizer.adjust_for_ambient_noise(source)
    recognizer.dynamic_energy_threshold = True
    audio = recognizer.listen(source)
fi=open("startspeech.txt","w+")
fi.write("done")
fi.close()
print("done")
os.system("python texttospeech.py startspeech.txt")
try:
    response["transcription"] = recognizer.recognize_google(audio,language='en-in')#show_all=True
except sr.RequestError:
    # API was unreachable or unresponsive
    response["success"] = False
    response["error"] = "API unavailable"
except sr.UnknownValueError:
    # speech was unintelligible
    response["error"] = "Unable to recognize speech"
e=response["transcription"]
with open("microphone.result.wav","wb") as f:
    f.write(audio.get_wav_data())
e=str(e)
file1 = open("pyt.txt","w")
file1.write(e)
file1.close()
print(e)
