#!/bin/bash

# Navigate to the target directory
cd "/c/Workspace/BankAppListenerService/target" || exit

# Check if port number is provided as an argument
if [ -z "$1" ]; then
  # Prompt the user to enter the port number
  read -p "Enter the port number: " port
else
  port=$1
fi

# Run the JAR file with the specified port
java -jar BankAppListenerService-0.0.1-SNAPSHOT.jar --server.port="$port"
