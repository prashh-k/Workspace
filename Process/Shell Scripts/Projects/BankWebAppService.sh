#!/bin/bash
cd /c/Workspace/BankWebAppService

read -p "Enter the port number: " PORT
echo "Starting Angular app on port $PORT..."

npx ng serve --port=$PORT --open
