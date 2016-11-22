# Android-Custom-Fonts
Simple example how to use custom fonts in your android applications

Hello!

Sometimes we need to use custom fonts in app. If it needs only once - there os no problem to use somthing like 

Typeface type = Typeface.createFromAsset(getAssets(),"fonts/font1.ttf"); 
myTextView.setTypeface(type);


But if you need to set custom font more than once, it's boring. I propose to use singletone fonts manager for this purpose.
