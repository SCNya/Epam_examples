#!/bin/sh
#It work on my mac
cd ~/Downloads
mkdir -p out
javac -sourcepath /Users/vsevolod/Downloads/ -d /Users/vsevolod/Downloads/out /Users/vsevolod/Downloads/javase01/t01/main/Main.java
java -cp /Users/vsevolod/Downloads/out javase01.t01.main.Main
