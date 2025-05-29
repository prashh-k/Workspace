@echo off
setlocal enabledelayedexpansion

set "SRC_DIR=C:\Workspace\JavaProject\src"
set "LOG_FILE=C:\Workspace\logs\JavaProject.logs"

:: Function to log messages with timestamp
:log
set "message=%~1"
for /f "tokens=1-2 delims=." %%a in ("%time%") do set "timestamp=%date% %%a:%%b"
echo [!timestamp!] %message% >> "%LOG_FILE%"
goto :eof

:: Compile and run a Java file
:compile_and_run
set "java_file=%~1"
set "package_path=%~2"

call :log "Compiling: %java_file%"
javac -d "%SRC_DIR%" "%java_file%" 2>&1 | for /f "delims=" %%l in ('more') do call :log "%%l"

for %%f in ("%java_file%") do set "class_name=%%~nf"
set "full_class_name=%package_path:.=\%.%class_name%"

call :log "Running: %full_class_name%"
java -cp "%SRC_DIR%" %full_class_name% 2>&1 | for /f "delims=" %%l in ('more') do call :log "%%l"
goto :eof

:: Collect and run all Java files in a directory
:collect_and_run_java_files
set "dir=%~1"
set "package_path=%dir:%SRC_DIR%\=%"

for %%f in ("%dir%\*.java") do (
    if exist "%%f" (
        call :compile_and_run "%%f" "!package_path!"
    )
)
goto :eof

:: Scan and run all packages
:scan_and_run_all
for /r "%SRC_DIR%" %%f in (*.java) do (
    set "dir=%%~dpf"
    call :collect_and_run_java_files "!dir:~0,-1!"
)
goto :eof

:: Run specific package
:run_specific_package
echo Available packages:
set i=0
for /f "delims=" %%d in ('dir /s /b /a-d "%SRC_DIR%\*.java" ^| sort') do (
    set "dir=%%~dpd"
    set "dir=!dir:~0,-1!"
    set "dirs[!i!]=!dir!"
    set /a i+=1
)

for /l %%i in (0,1,!i!) do (
    if defined dirs[%%i] (
        set "rel_path=!dirs[%%i]:%SRC_DIR%\=!"
        echo %%i. !rel_path!
    )
)

set /p "choice=Select a package number: "
if defined dirs[%choice%] (
    call :collect_and_run_java_files "!dirs[%choice%]!"
) else (
    echo Invalid choice.
)
goto :eof

:: Menu
:menu
cls
echo === Java Package Runner Menu ===
echo 1. Run specific package
echo 2. Run all packages
echo 3. Exit
set /p "choice=Enter your choice: "

if "%choice%"=="1" (
    call :run_specific_package
) else if "%choice%"=="2" (
    call :scan_and_run_all
) else if "%choice%"=="3" (
    echo Exiting...
    exit /b
) else (
    echo Invalid choice. Try again.
)
pause
goto menu