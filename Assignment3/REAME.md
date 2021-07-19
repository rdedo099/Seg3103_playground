Steps to run once maven is installed correctly:
Step 1: compile maven with: mvn compile
Step 2: run the file with: mvn package -DskipTests
Step 3: Create the local server with: java -jar bookstore5.jar
Step 4: open a separate cmd
Step 5: compile again with: mvn compile
Step 6: run the tests with: mvn test

All code is in ExampleSeleniumTest.jave
Here, the tests on the functional requirements and the use cases is run
most functional requirements and use cases overlap, so tests were not doubled
