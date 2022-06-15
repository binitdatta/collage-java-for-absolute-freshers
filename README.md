# Welcome to the Life Changing Journey of Learning How to Program in Java in a Fun Filled Way

## Prerequisite

``` 
- 1. We understand what a compyter is and have seen / used one for playing games, post on social media, writing an essay etc.
- 2. We understand what a Central Processing Unit ot CPU it : It is the computer's brain
- 3. We understand what Random Access Memory or RAM is : It is the memory where computers stores things
- 4. We understand what a hard disk is : It is the permanent storage that can save the files when we shut the computer
- 5. We understand what a computer direcotry or folder is
- 6. We understand what a computer file is : myphone.jpeg, mydogs-photo-png, my-second-term-essay.docx etc
- 7. We understand that the total computer file has two parts. 
- 8. The first part is the file name and ends before the . (DOT) : my-second-term-essay
- 9. The second part is the file extension and starts after the . (DOT) : docx
```

# First Some Basic Questions Needs to be answered

## What is Programming

``` 
- 1. Programming is a way of communicating what we want to the computers like your laptop, your parents desktop, your smartphone, tablet etc.
- 2. Programming is to talking to the computers like English or Spanish Language is to talking to a Person who knows English or Spanish
- 3. These days Programming is touching all our lives as computers do all sorts of jobs helping us buy things online, chatting with best friends, post pictures on social media etc.
```

## What id the difference between Computer Programming and Talking in English

``` 
- 1. In English Conversation, both persons know English
- 2. However, in our conversation with the Computer using a Programming Language such as Java or JavaSCript, the Computer itself does not understand Java or JavaScript
- 3. All Computers only understands electronic signals which are expressed in zeros and ones.
- 4. These zeros and ones are called bits
- 5. Humans however, do not understand zeros and ones that well
- 6. Thus, when we talk to the computers in a programming language, there is a special program called Interprter that translates the English like programs or our talk to the zeros or ones
- 7. So that computers would be able to understand our talk and executes our commands now in zeros and ones.
- 8. Thus the special program called the Interprter knows the programming language we know and the zeros and ones the computers know
- 9. This is much like a person knowing English visiting Chica and talking to a Chinese person knowing Mandarin, through an Interprter who knows both English and Chinese
```

## What is Java

``` 
- 1. Java is a Computer Programming Language
- 2. Java and other Computer Programming Languages are for human programmers to use
- 3. Thus they look and work like the English Language with some differences
- 4. Humans have brains and intelligence but computers do not have any intelligence on their own.
- 5. Thus all computer languages are significantly more detailed than a human language like English.
```

## What is Java Development Kit or JDK

``` 
- 1. Like we said we cannot directly talk to the computers in zeros or ones
- 2. And computers do not understand our English like Java Programs
- 3. Thus we need a middle person to take our Java Programs and convert them into a form that computers can understand
- 4. One of these middle persons are called Java Interpreter or Compiler
- 5. Once interpretted , the converted Java programs are stored in special computer file with an extension .class
- 6. There is another program that takes the .class files and runs them
- 7. Like the two above several other similar tools are packaged in the box called the JDK
- 8. We cannot write and run java programs without installing the JDK in our computer
```

## What is a Terminal

``` 
- 1. A Computer Terminal is a special program that takes commands from use computer users
- 2. Examples of commands like running a program, copying files, deleting files etc.
```

## How do I install the JDK on my computer say a mac?

``` 
- 1. Open a Chrome or Safari browser 
- 2. Enter https://sdkman.io/install
- 3. Open a Terminal on your mac
- 4. Enter the command : curl -s "https://get.sdkman.io" | bash
- 5. Press Enter
- 6. Enter the following command : source "$HOME/.sdkman/bin/sdkman-init.sh"
- 7. Enter the following command : sdk version
- 8. You will the sdkman version installed
```

## How to install JDK on our Mac

``` 
Run the command : sdk install java 11.0.15-zulu
Wait till the command finishes running, Enter Y for the question asked

Installing: java 11.0.15-zulu
Done installing!

Do you want java 11.0.15-zulu to be set as default? (Y/n): y

Setting java 11.0.15-zulu as default.

```

## How to verify that Java JDK is installed on our mac

```
Run java -version on the command line terminal

Command output

openjdk version "11.0.15" 2022-04-19 LTS
OpenJDK Runtime Environment Zulu11.56+19-CA (build 11.0.15+10-LTS)
OpenJDK 64-Bit Server VM Zulu11.56+19-CA (build 11.0.15+10-LTS, mixed mode)

```

## What is an Integrated Development Environment or an IDE?

``` 
- 1. Most of us have  used Editing software like Microsoft Word or Google Docs
- 2. Microsoft Word or Google Docs saves our work behind the scene, helps spell checkes and grammer checks
- 3. IDEs are to Java Programming or Programming in General as Microsoft Word / Google Docs are to Writing an Essay
- 4. They highlight errors, help us write less by completing parts etc.
- 5. They also can help run the programs we write with a few mouse clicks
- 6. IDEs are all free most of the time
```

## How to download and install an IDE

``` 
- 1. Open a Chrome or Safari Browser 
- 2. Enter www.google.com in the top navigation bad
- 3. Enter IntelliJ in the google search box
- 4. Click on the first result : https://www.jetbrains.com/idea/
```

![Alt text](images/1.png?raw=true "Title")

![Alt text](images/2.png?raw=true "Title")

## Click on the Download button for the Community Edition

## Once the download is completed, double click the .dmg file to install the IntelliJ Idea IDE.

## After the IDE is installed, it will be under your Mac's Application Folder

![Alt text](images/3.png?raw=true "Title")

## Double Click on the IntelliJ Idea icon to start the IDE

## What is a Package in Java?

``` 
- 1. Java Packages are special type of folders that helpls us separate programs with the same names
- 2. Say you and and your friend both write a program called HelloWorld.java
- 3. We cannot keep the two programs with the same exact names under one one folder or package
- 4. However, if we create a package/folder named charles and anpther named ashley, we can keep the same HelloWorld.java under two packages
- 5. It will look like charles/HelloWorld.java and ashley/HelloWorld.java
```

## How do we create a new package in the IntelliJ IDE

``` 
- 1. The src folder is where all source code programs that contains our programs are kept
- 2. Under the src folder we have the root package or folder named here as com/rollingstone or as we say in java com.rollingstone
- 3. Special note: In the Operating System, folders are separated by front slash in linux/mac and \ in windows
- 4. In java , folder or packafes are separated by . or DOTS
- 5. Right click the com.rollingstone folder/package and follow the images shown below
```

![Alt text](images/4.png?raw=true "Title")

![Alt text](images/5.png?raw=true "Title")

![Alt text](images/6.png?raw=true "Title")

Enter the package name i.e. helloworld and press enter

![Alt text](images/7.png?raw=true "Title")

## Results of package creation

![Alt text](images/8.png?raw=true "Title")

## How do I create a first Java Program in the IDE

``` 
- 1. Right click the new package
- 2. Click New 
- 3. Click Java Class as shown below
- 4. Enter the Java Program Name as HelloWorld
- 5. There will be a new Java program created under the package com.rollingstone.helloworld and a new editor will be opened
```

![Alt text](images/9.png?raw=true "Title")

## What is an Array

``` 
- 1. Assume you are in an airport flying to Seattle from Chicago
- 2. There are multiple gates in the airport terminal
- 3. Each gate is boarding passengers to different airplanes at the same time going to different cities
- 4. Your boarding group is 2
- 5. There is a single line for the boarding group 2
- 6. There are 50 people standing in that single line for boarding group 2
- 7. Question is how many lines did the airline crew create for boarding 50 passgengers in the place. 
- 8. The answer is just 1
- 9. How do know the 5th passenger in the boarding group line ? : By counting 1,2,3,4,5
- 10. One key thing to note is that all the passgengers has a similarity that all their boarding group is 2!
- 11. Likewise in Java programs when we se similar things we do not create separate lines (or boxes or variables) to store them
- 12. Now, if we are print the seven days of the week we will create a single Java array and store them
- 13. String[] sevenDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}
- 14. So we see that arrays are indicated by a opening and closing sqare brackets
- 15. If we do not give a number inside the square brackets, java will count the number of elements in that "," separate curly brace and determine the size 7 in this case
```
## Sample Program

``` 
package com.rollingstone.helloworld;

public class HelloWorld
{
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

```

## The first line of the program HelloWorld.java says which folder/package it is in

## In out cities , there are houses and there are parks and libraries

## Houses are generally private properties whereas parks and libraries are public properties meaning anyone can use them

## A public Java program is like a public park or public library meaning apart from the programmer, other people will be able use it as well

## In English the words like "A", "An", "The" has some special meaning 

## Common nouns like Train, Bus Airplane has special meanings too

## In java programming language there are words with special meaning and these words are called key words or reserved words

``` 
- 1. package means the next words are going to tell the folder name of the program
- 2. public means the program can be used by all
- 3. In Java all program are called class but we will explain things about classes a little later
- 4. After the class keyword there comes the name of the program which is here HelloWorld
```

## Methods

``` 
- 1 . Like any living beings have organs and non living beings have parts, Java programs have methods
- 2.  Like humans have hearts, hands, legs, brain, eyes etc, cars have engines, planes have wings, Java programs have methods
- 3. A human brain sends signals to other parts / components of the body such as hand / legs to move them.
- 4. In a Java program, the main method is the brain of the java program that sends signals by calling other methods
- 5. Organs have nerve cell connection to carry the message from the brain to them
- 6. Java main method instead calls the method by their names
- 7. Like the human brain acts on external stimulus, java main method also receives external stimulus called command line argumentds
- 8. The command line argumentds are contained in an array called args
- 9. Each array has a type associated with it.
- 10. Here the array type is String which means these are words that can be alphabets followed by numbers and symbols etc.

```

##  What this java main method is doing

``` 
- 1. In our cities hundreds of public properties such as roads amd parks and libraries are created by the authroities or the govrenment
- 2. In java thousands of methods that do special things for us are written by the Java Programming Language creators
- 3. Like when we drive, we just press the gas pedal and the car moves with special engineering done by the car manufacturing company.
- 4. Here we want to print "Hello World" on the screen and there is a special class and method for that purpose
- 5. The special class is called System.out
- 6. The special method that prints the message is called println
- 7. Like shopowners take money from us before giving us the goods we buy, java methods some of them take input values
- 8. These input values are called parameters or arguments
- 9. The argument in this case is : "Hello World" and is a String enclosed within double quotes ""
```

## How does java programs start and end

### Java programs start with an opening curly brace { and end with another closing curly brace }

## How does java methods start and end

### Java methods start with an opening curly brace { and end with another closing curly brace }

## Now with all the explanation, lets see it again


``` 
package com.rollingstone.helloworld;

public class HelloWorld
{
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

```

## How do we run the program

## Right Click on the program you want to run and choose as shown below.

![Alt text](images/10.png?raw=true "Title")

![Alt text](images/11.png?raw=true "Title")

## Exercise

``` 
- 1. Create a new package called hellojava under the com.rollingstone package
- 2. Create a new Java program named HelloJava under the new package hellojava package
- 3. Print the Message "Hello Java" in the java main method
```
