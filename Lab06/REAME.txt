Steps to run once maven is installed correctly:
Step 1: compile maven with: mvn compile
Step 2: run the file with: mvn package -DskipTests
Step 3: Create the local server with: java -jar ./target/BookstoreApp-0.1.0.jar
Step 4: run the tests with mvn test

In my run of the test, I encountered an error where I could not get the local host to display the correct page but only get an error instead, I could not resolve this issue, however the selenium 
code compiled for me, but test could not run effectively.

As the localhost would not open or load, the test case that was used was the one that was demonstrated and seen within the lab for the admin page.
