#!/bin/bash

main() {
    echo "----- String & Common Methods -----"
    str1="Hello"
    str2="World"

    echo "Original String: $str1"
    echo "Length: ${#str1}"
    echo "Character at index 1: ${str1:1:1}"
    echo "Concatenation: ${str1} Java"
    echo "Uppercase: ${str1^^}"
    echo "Lowercase: ${str1,,}"
    echo "Index of 'o': $(expr index "$str1" o)"
    echo "Substring (0, 4): ${str1:0:4}"
    echo "Replace 'H' with 'J': ${str1/H/J}"
    [[ $str1 == He* ]] && echo "Check if starts with 'He': true" || echo "false"
    [[ $str1 == *o ]] && echo "Check if ends with 'o': true" || echo "false"
    echo "Trim spaces: $(echo '   Hello Java   ' | xargs)"
    [[ "$str1" == "Hello" ]] && echo "Equals 'Hello'?: true" || echo "false"
    [[ "${str1,,}" == "hello" ]] && echo "Ignore case equals 'hello'?: true" || echo "false"

    echo
    echo "----- Mutable String (Using Array) -----"
    sb=("H" "e" "l" "l" "o")
    sb+=(" " "W" "o" "r" "l" "d")
    echo "After append: ${sb[*]}"

    sb=( "${sb[@]:0:5}" " Java" "${sb[@]:5}" )
    echo "After insert: ${sb[*]}"

    sb=( "${sb[@]:0:6}" "C++" "${sb[@]:10}" )
    echo "After replace: ${sb[*]}"

    unset 'sb[5]' 'sb[6]' 'sb[7]' 'sb[8]'
    echo "After delete: ${sb[*]}"

    reversed=$(echo "${sb[*]}" | rev)
    echo "After reverse: $reversed"

    echo
    echo "----- Thread-Safe Mutable String (Simulated) -----"
    result="Hello"
    result+=" World"
    echo "After append: $result"

    result="${result:0:5} Java${result:5}"
    echo "After insert: $result"

    result="${result:0:6}Python${result:10}"
    echo "After replace: $result"

    result="${result:0:5}${result:11}"
    echo "After delete: $result"

    echo "After reverse: $(echo "$result" | rev)"

    echo
    echo "----- Immutability -----"
    immutable_string="Immutable"
    immutable_string_concat="${immutable_string} Changed"
    echo "Immutable String remains unchanged: $immutable_string"

    echo
    echo "----- String Pool Concept -----"
    pool_string1="Hello"
    pool_string2="Hello"
    [[ "$pool_string1" == "$pool_string2" ]] && echo "Comparing String Pool references: true" || echo "false"

    echo
    echo "----- String Tokenization -----"
    sentence="Java,Python,C++,JavaScript"
    IFS=',' read -ra tokens <<< "$sentence"
    for token in "${tokens[@]}"; do
        echo "Token: $token"
    done
}

main
