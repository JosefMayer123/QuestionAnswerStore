### Description
Java command line application that offers two options: One ist to add questions with answers, the other one is to ask questions.

If the asked question is stored in the program, the program will return all answers. 
If the asked question is not stored in the programm, the program will return the answer "the answer to life, universe and everything is 42".

Input Format of question with answers: question? "answer1" "answer2" "answer3".

Asked Questions have to match stored questions exactly (string-equality) to be found.





### Technologies
Testing: Junit

Build System: Gradle



### Steps
##### Run tests:
*./gradlew clean test*

##### Build jar file:
*./gradlew clean jar*


##### Run application from jar: 
*java -jar .\build\libs\nameOfJarfile.jar*


