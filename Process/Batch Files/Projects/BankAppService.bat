@echo off
cd /d "C:\Workspace\BankAppService\target"
java -Dlog4j.debug=true -Dlog4j.configurationFile="C:\Workspace\BankAppService\src\main\resources\log4j2.xml" -jar BankAppService-0.0.1-SNAPSHOT.jar --server.port=%1
pause