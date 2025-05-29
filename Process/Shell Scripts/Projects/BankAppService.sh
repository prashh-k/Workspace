#!/bin/bash

# Navigate to the target directory
cd "/c/Workspace/BankAppService/target" || exit

# Run the JAR file with the specified port
java -jar BankAppService-0.0.1-SNAPSHOT.jar --server.port="$1"
