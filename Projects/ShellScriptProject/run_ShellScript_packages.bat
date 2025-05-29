@echo off
setlocal enabledelayedexpansion

set SRC_DIR=C:\Workspace\ShellScriptProject
set LOG_FILE=C:\Workspace\logs\ShellScriptProject.log
set GIT_BASH_PATH=C:\Program Files\Git\bin\bash.exe

:: Ensure log directory and file exist
if not exist "%LOG_FILE%" (
    mkdir "%LOG_FILE%\.." >nul 2>&1
    type nul > "%LOG_FILE%"
)

:menu
echo === Shell Script Runner Menu ===
echo 1. Run specific package
echo 2. Run all packages
echo 3. Exit
set /p choice=Enter your choice: 

if "%choice%"=="1" goto run_specific_package
if "%choice%"=="2" goto scan_and_run_all
if "%choice%"=="3" goto end
echo Invalid choice. Try again.
goto menu

:log
set message=%~1
for /f "tokens=1-2 delims=." %%a in ("%time%") do set timestamp=%date% %%a:%%b
set "log_line=[%timestamp%] %message%"
echo !log_line!
echo !log_line! >> "%LOG_FILE%"
goto :eof

:run_shell_script
set "sh_file=%~1"
for /f "tokens=1-2 delims=." %%a in ("%time%") do set timestamp=%date% %%a:%%b
set "log_line=[%timestamp%] Running: %sh_file%"
echo !log_line!
echo !log_line! >> "%LOG_FILE%"

:: Run the shell script in Git Bash and pause after execution
"%GIT_BASH_PATH%" -c "bash '%sh_file%' 2>&1 | while read line; do echo \"[$(date +%%d-%%m-%%Y\ %%H:%%M:%%S)] $line\" | tee -a '%LOG_FILE%'; done; echo; read -n 1 -s -r -p 'Press any key to continue...'"
goto :eof

:collect_and_run_shell_scripts
set "dir=%~1"
for %%f in ("%dir%\*.sh") do (
    if exist "%%f" call :run_shell_script "%%f"
)
goto :eof

:scan_and_run_all
for /f "delims=" %%d in ('dir /s /b /ad "%SRC_DIR%"') do (
    dir /b "%%d\*.sh" >nul 2>&1 && (
        call :collect_and_run_shell_scripts "%%d"
    )
)
goto menu

:run_specific_package
echo Available packages:
set i=0
for /f "delims=" %%d in ('dir /s /b /ad "%SRC_DIR%"') do (
    dir /b "%%d\*.sh" >nul 2>&1 && (
        set "dirs[!i!]=%%d"
        set /a i+=1
    )
)

for /l %%j in (0,1,!i!) do (
    if defined dirs[%%j] (
        set "pkg=!dirs[%%j]:%SRC_DIR%\=!"
        echo %%j. !pkg!
    )
)

set /p selected=Select a package number: 
if defined dirs[%selected%] (
    call :collect_and_run_shell_scripts "!dirs[%selected%]!"
) else (
    echo Invalid choice.
)
goto menu

:end
echo Exiting...
exit /b
