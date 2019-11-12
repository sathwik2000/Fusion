import cv2
import os
import numpy as np
import faceRecognition as fr
test_img=cv2.imread('TestImages/sathwik2.jpg')
face_d,g_im=fr.faceDetection(test_img)
print("face_detected",face_d)
for (x,y,w,h) in face_d:
    cv2.rectangle(test_img,(x,y),(x+w,y+h),(255,0,0),thickness=5)
resized_img=cv2.resize(test_img,(1000,1000))
cv2.imshow("cv2 detected",resized_img)
cv2.waitKey(0)
cv2.destroyAllWindows()
