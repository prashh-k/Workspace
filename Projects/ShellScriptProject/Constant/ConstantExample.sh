#!/bin/bash

# -------------------------------
# Example of using readonly
# -------------------------------

# Define a constant using readonly
readonly APP_NAME="MyShellApp"

# Trying to change this will cause an error
# APP_NAME="NewName"  # Uncommenting this line will cause: bash: APP_NAME: readonly variable

echo "Application Name: $APP_NAME"

# -------------------------------
# Example of using declare -r
# -------------------------------

# Define a constant using declare -r
declare -r VERSION="1.0.0"

# Attempting to modify this will also cause an error
# VERSION="2.0.0"  # Uncommenting this line will cause: bash: VERSION: readonly variable

echo "Application Version: $VERSION"

# -------------------------------
# Use in logic
# -------------------------------

# You can use these constants in conditions or messages
if [[ "$VERSION" == "1.0.0" ]]; then
    echo "You are using the latest stable version of $APP_NAME."
fi
