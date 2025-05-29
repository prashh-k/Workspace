#!/bin/bash

echo "=== Implicit Type Casting (Widening) ==="
num=10
double_num=$(echo "$num" | awk '{printf "%.2f", $1}')
echo "Integer: $num"
echo "Converted to Float (Double-like): $double_num"

echo
echo "=== Explicit Type Casting (Narrowing) ==="
double_num1=10.75
num1=$(echo "$double_num1" | awk '{print int($1)}')
echo "Float (Double-like): $double_num1"
echo "Converted to Integer: $num1"

echo
echo "=== String to Integer Conversion ==="
s1="123"
if [[ "$s1" =~ ^[0-9]+$ ]]; then
    num2=$((s1))
    echo "Converted integer (s1): $num2"
else
    echo "s1 is not a valid integer."
fi

s2="123abc"
if [[ "$s2" =~ ^[0-9]+$ ]]; then
    num3=$((s2))
    echo "Converted integer (s2): $num3"
else
    echo "s2 is not a valid integer."
fi

s3="12.34"
if [[ "$s3" =~ ^[0-9]+\.[0-9]+$ ]]; then
    num4=$(echo "$s3" | awk '{print int($1)}')
    echo "Converted from decimal string (s3): $num4"
else
    echo "s3 is not a valid number."
fi

s4="₹100"
cleaned_s4=$(echo "$s4" | tr -cd '0-9')
if [[ "$cleaned_s4" =~ ^[0-9]+$ ]]; then
    num5=$((cleaned_s4))
    echo "Converted from currency string (s4): $num5"
else
    echo "s4 is not a valid number."
fi
