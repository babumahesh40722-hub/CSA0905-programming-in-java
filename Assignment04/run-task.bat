@echo off
if "%1"=="" (echo Usage: run-task.bat 1..6 & exit /b 1)
cd Task%1
javac Main.java && java Main
