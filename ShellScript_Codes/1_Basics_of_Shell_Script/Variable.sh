#!/bin/bash

# === Global Variable ===
global_var="I am a global variable"

# === Environment Variable ===
export ENV_VAR="I am an environment variable"

# === Function to demonstrate Local Variable ===
local_variable_example() {
    local local_var="I am a local variable"
    echo "Local Variable: $local_var"
}

# === Function to demonstrate Positional Parameters ===
positional_parameters_example() {
    echo "Script Name (\$0): $0"
    echo "First Argument (\$1): $1"
    echo "Second Argument (\$2): $2"
    echo "All Arguments (\$@): $@"
    echo "Number of Arguments (\$#): $#"
}

# === Function to demonstrate Special Variables ===
special_variables_example() {
    echo "Process ID (\$\$): $$"
    echo "Last Command Exit Status (\$?): $?"
}

# === Array Variable ===
array_example() {
    fruits=("apple" "banana" "cherry")
    echo "Array Element [0]: ${fruits[0]}"
    echo "Array Element [1]: ${fruits[1]}"
    echo "All Array Elements: ${fruits[@]}"
}

# === Associative Array Variable ===
associative_array_example() {
    declare -A person
    person["name"]="Alice"
    person["age"]=25
    echo "Associative Array - Name: ${person["name"]}"
    echo "Associative Array - Age: ${person["age"]}"
}

# === Main Function ===
main() {
    echo "=== Global Variable ==="
    echo "$global_var"

    echo -e "\n=== Environment Variable ==="
    echo "$ENV_VAR"

    echo -e "\n=== Local Variable ==="
    local_variable_example

    echo -e "\n=== Positional Parameters ==="
    positional_parameters_example "$@"

    echo -e "\n=== Special Variables ==="
    special_variables_example

    echo -e "\n=== Array Variable ==="
    array_example

    echo -e "\n=== Associative Array Variable ==="
    associative_array_example
}

# Run the main function with arguments
main "$@"
