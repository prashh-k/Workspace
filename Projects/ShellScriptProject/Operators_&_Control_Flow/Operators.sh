#!/bin/bash

main() {
    a=10
    b=5

    echo "=== Arithmetic Operators ==="
    echo "Addition: $((a + b))"
    echo "Subtraction: $((a - b))"
    echo "Multiplication: $((a * b))"
    echo "Division: $((a / b))"
    echo "Modulus: $((a % b))"
    echo "-----------------------------------"

    echo "=== Unary Operators ==="
    x=5
    echo "Post-increment (simulated): $x"
    ((x++))
    echo "Pre-increment: $x"
    ((x--))
    echo "Post-decrement (simulated): $x"
    ((--x))
    echo "Pre-decrement: $x"
    echo "Negation: $((-x))"
    echo "-----------------------------------"

    echo "=== Assignment Operators ==="
    y=10
    ((y += 5))
    ((y -= 3))
    ((y *= 2))
    ((y /= 4))
    ((y %= 3))
    echo "Final value of y: $y"
    echo "-----------------------------------"

    echo "=== Relational Operators ==="
    echo "Equal: $([[ $a -eq $b ]] && echo true || echo false)"
    echo "Not Equal: $([[ $a -ne $b ]] && echo true || echo false)"
    echo "Greater Than: $([[ $a -gt $b ]] && echo true || echo false)"
    echo "Less Than: $([[ $a -lt $b ]] && echo true || echo false)"
    echo "Greater or Equal: $([[ $a -ge $b ]] && echo true || echo false)"
    echo "Less or Equal: $([[ $a -le $b ]] && echo true || echo false)"
    echo "-----------------------------------"

    echo "=== Logical Operators ==="
    p=true
    q=false
    [[ $p == true && $q == true ]] && echo "AND: true" || echo "AND: false"
    [[ $p == true || $q == true ]] && echo "OR: true" || echo "OR: false"
    [[ $p != true ]] && echo "NOT: true" || echo "NOT: false"
    echo "-----------------------------------"

    echo "=== Ternary Operator ==="
    min_val=$([[ $a -lt $b ]] && echo $a || echo $b)
    echo "Minimum value: $min_val"
    echo "-----------------------------------"

    echo "=== Bitwise Operators ==="
    bit1=5
    bit2=3
    echo "AND: $((bit1 & bit2))"
    echo "OR: $((bit1 | bit2))"
    echo "XOR: $((bit1 ^ bit2))"
    echo "NOT: $((~bit1))"
    echo "-----------------------------------"

    echo "=== Shift Operators ==="
    echo "Left Shift: $((a << 2))"
    echo "Right Shift: $((a >> 2))"
    echo "-----------------------------------"

    echo "=== instanceof Equivalent ==="
    echo "Bash does not support classes or inheritance."
    echo "Simulating with strings:"
    animal="Dog"
    if [[ "$animal" == "Dog" || "$animal" == "Animal" ]]; then
        echo "Is Dog an instance of Animal? true (simulated)"
    else
        echo "Is Dog an instance of Animal? false"
    fi
    echo "Is Dog an instance of Dog? $([[ "$animal" == "Dog" ]] && echo true || echo false)"
}

main
