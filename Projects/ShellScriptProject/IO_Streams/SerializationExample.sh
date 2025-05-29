#!/bin/bash

# Function to serialize a person (write to file)
serialize_person() {
    local file_path="$1"
    local name="$2"
    local age="$3"
    echo "name=$name" > "$file_path"
    echo "age=$age" >> "$file_path"
    echo "Person object serialized!"
}

# Function to deserialize a person (read from file)
deserialize_person() {
    local file_path="$1"
    if [[ -f "$file_path" ]]; then
        source "$file_path"
        echo "Deserialized Person: Person(name='$name', age=$age)"
    else
        echo "Error during deserialization: File not found."
    fi
}

# Main logic
person_file="person.txt"
serialize_person "$person_file" "John Doe" 30
deserialize_person "$person_file"
s