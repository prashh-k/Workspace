@echo off
cd /d "C:\Workspace\BankAppAdminDashboardService\target"
java -Dlog4j.debug=true -Dlog4j.configurationFile="C:\Workspace\BankAppAdminDashboardService\src\main\resources\log4j2.xml" -jar BankAppAdminDashboardService-0.0.1-SNAPSHOT.jar --server.port=%1
pause