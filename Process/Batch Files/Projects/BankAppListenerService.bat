@echo off
cd /d "C:\Workspace\BankAppListenerService\target"
java -Dlog4j.debug=true -Dlog4j.configurationFile="C:\Workspace\BankAppListenerService\src\main\resources\log4j2.xml" -jar BankAppListenerService-0.0.1-SNAPSHOT.jar --server.port=%1
pause