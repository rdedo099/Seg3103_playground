Step 1: Open command prompt in the ecs directory

Step 2: Compile in cmd with the following line
javac -encoding UTF-8 --source-path src -d dist src/*.java

Step 3: Complile test in cmd with the following line
javac -encoding UTF-8 --source-path test -d dist -cp lib/junit-platform-console-standalone-1.7.1.jar test/*.java src/*.java

Step 4: Run test with following line
java -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path