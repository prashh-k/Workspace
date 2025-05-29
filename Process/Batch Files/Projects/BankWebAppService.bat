@echo off
cd /d "C:\Workspace\BankWebAppService"
set /p PORT=Enter the port number:
echo Starting Angular app on port %PORT%...
call npx ng serve --port=%PORT% --open
pause
