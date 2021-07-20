to run Spotbugs: java -jar ./lib/spotbugs/lib/spotbugs.jar

Compile steps:

Step 1: javac -encoding UTF-8 --source-path src -d dist src/*.java

Step 2: javac -encoding UTF-8 --source-path test -d dist -cp dist;lib/junit-platform-console-standalone-1.71.jar test/*.java

Step 3: java -cp ./dist Main

Some bugs were fixed, and some were written on how they would be fixed, the following is the writing for how those bugs would be fixed.

Bug fixes:
comparison of string bug: was fixed, done by using the equals(object) method

Call to swing method error: implement a container listener for the threads so that swing method events are contained

addWindowListener Refactoring: refactor as an inner class

num boxing/unboxing error: instead call static parse method

answer boxing/unboxing  error: call static parse method instead

all unread field errors: make these variables static variables

getContentPane() error: expand elseif statement to include else so it only requires this line of code once

Switch statement error: default case of the switch is missing, implement a default case

Useless conditions errors: clean up the conditions, for example first condition i is greater than or equal to 3, next condition i is greater than or equal to 8, this can be redone as
the larger going first, so i being greater than or equal to 8, if it is smaller, then it then can be addressed by the condition of if i is greater than or equal to 3, etc for all useless conditions
This bug appears because the upper limit is not necessary, and the same outcome can be achieved without including it here.

morenums error: can be changed to simply be a true or false value depending on input

