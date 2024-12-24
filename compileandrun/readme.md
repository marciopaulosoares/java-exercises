# Our application depends on other files to run
## Some of files are in package "deps", and some are in myJar.jar

Windows:
~~~
java -cp ".;C:\myapplication\deps;C:\myapplication\myJar.jar" com.mypackage.Myapp
~~~

Linux:
~~~
java -cp ".:/myapplication/deps:/myapplication/myJar.jar" com.mypackage.Myapp
~~~

## If you have many jars in a folder, you can use wildcard
~~~
java -cp ".:/myapplication/deps/*" com.mypackage.Myapp
~~~

## Create your own jar file (from files in a folder)
~~~
jar -cvf myJar.jar .
jar --create --verbose --file myJar.jar .
~~~
## Create your own jar file from files in custom folder
~~~
jar -cvf myJar.jar -C /myapplication 
~~~
-------------
## Examples
~~~
javac model/DogModel.java test001/my001class.java
javac model/*.java test001/*.java
javac -d classes model/*.java test001/*.java
java -cp classes compileandrun.test001.my001class
java -classpath classes compileandrun.test001.my001class
java --class-path classes compileandrun.test001.my001class
~~~
## cd to classes and generate an jar
~~~
jar -cvf my001.jar .
jar -cvf my001.jar -C ./classes/compileandrun
<classpath> option can be used with javac command
~~~

## Create a jar file with a manifest file run in the classes directory
~~~
jar cfm my001.jar ../MANIFEST.MF .
~~~

## Manifest template
~~~
Manifest-Version: 1.0
Created-By: Marcio Paulo
Main-Class: compileandrun.test001.my001class
~~~