import os
import cv2
import numpy as np
import faceRecognition as fr


#This module captures images via webcam and performs face recognition
face_recognizer = cv2.face.LBPHFaceRecognizer_create()
eye_cas=cv2.CascadeClassifier('HaarCascade/haarcascade_eye.xml')
face_recognizer.read('trainingData.yml')#Load saved training data

name = {0 : "happy",1 : "angry"}

'''test_img=cv2.imread('TestImages/sathwik3.jpg')#test_img path
faces_detected,gray_img=fr.faceDetection(test_img)
print("faces_detected:",faces_detected)


#Comment belows lines when running this program second time.Since it saves training.yml file in directory
faces,faceID=fr.labels_for_training_data('C:/Users/Administrator/Desktop/FaceRecognition-master/resizedTrainingImages')
face_recognizer=fr.train_classifier(faces,faceID)
for face in faces_detected:
    (x,y,w,h)=face
    roi_gray=gray_img[y:y+h,x:x+h]
    label,confidence=face_recognizer.predict(roi_gray)#predicting the label of given image
    print("confidence:",confidence)
    print("label:",label)
    fr.draw_rect(test_img,face)
    predicted_name=name[label]
    if(confidence>37):#If confidence more than 37 then don't print predicted face text on screen
        continue
    fr.put_text(test_img,predicted_name,x,y)

resized_img=cv2.resize(test_img,(100,100))
cv2.imshow("face dtecetion tutorial",resized_img)'''
cap=cv2.VideoCapture(0)
while True:
    ret,test_img=cap.read()# captures frame and returns boolean value and captured image
    faces_detected,gray_img=fr.faceDetection(test_img)



    for (x,y,w,h) in faces_detected:
      cv2.rectangle(test_img,(x,y),(x+w,y+h),(255,0,0),thickness=3)

    resized_img = cv2.resize(test_img, (1000, 700))
    #out.write(resized_img)
    cv2.imshow('face detection Tutorial ',resized_img)
    cv2.waitKey(10)


    for face in faces_detected:
        (x,y,w,h)=face
        roi_gray=gray_img[y:y+w, x:x+h]
        roi_color=test_img[y:y+h,x:x+w]
        label,confidence=face_recognizer.predict(roi_gray)#predicting the label of given image
        print("confidence:",confidence)
        print("label:",label)
        fr.draw_rect(test_img,face)
        eyes =eye_cas.detectMultiScale(roi_gray)
        for (ex,ey,ew,eh) in eyes:
            cv2.rectangle(roi_color,(ex,ey),(ex+ew,ey+eh),(0,0,255),2)
        predicted_name=name[label]
        if confidence < 50:#If confidence less than 37 then don't print predicted face text on screen
           fr.put_text(test_img,predicted_name,x,y)
        #fr.put_text(test_img,predicted_name,x,y)


    resized_img = cv2.resize(test_img, (1000, 700))
    #out.write(resized_img)
    cv2.imshow('face recognition tutorial ',resized_img)
    key =cv2.waitKey(1)
    if key == ord('q'):#wait until 'q' key is pressed
        break

#out.release()
cap.release()
cv2.destroyAllWindows

