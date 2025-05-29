#!/bin/bash

# Numeric types
a=127
b=32000
c=100000
d=123456789
e=3.14
f=3.14159

# Text type
g='A'

# Boolean type
h=true

# Sequence types
i=(1 2 3)
j="(4 5 6)"
k=(0 1 2)

# Set type (simulated with array, no duplicates)
l=(1 2 3)

# Mapping type (simulated with associative array)
declare -A m
m["name"]="Alice"
m["age"]=25

echo "Int Value (a): $a"
echo "Int Value (b): $b"
echo "Int Value (c): $c"
echo "Long-like Int (d): $d"
echo "Float Value (e): $e"
echo "Double-like Float (f): $f"
echo "Char-like String (g): $g"
echo "Boolean Value (h): $h"
echo "List (i):" "${i[@]}"
echo "Tuple (j): $j"
echo "Range (k):" "${k[@]}"
echo "Set (l):" "${l[@]}"
echo "Dictionary (m): name=${m["name"]}, age=${m["age"]}"
