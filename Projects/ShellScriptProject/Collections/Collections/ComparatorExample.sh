#!/bin/bash

# Define products as "name:price" strings
products=(
    "Laptop:999.99"
    "Smartphone:499.99"
    "Tablet:299.99"
)

# Function to print products
print_products() {
    echo "$1"
    for product in "${products[@]}"; do
        name="${product%%:*}"
        price="${product##*:}"
        echo "$name (\$$price)"
    done
}

# Function to sort products by price
sort_products_by_price() {
    products=($(for product in "${products[@]}"; do
        echo "$product"
    done | sort -t: -k2 -n))
}

# Main logic
print_products "Products before sorting:"

sort_products_by_price

echo
print_products "Products after sorting by price:"
