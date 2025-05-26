def list_iterator_operations():
    # Create a list
    fruits = ["Apple", "Banana", "Cherry"]

    # Iterate forward through the list
    print("Iterating forward through the list:")
    for fruit in fruits:
        print(fruit)

    # Iterate backward through the list
    print("Iterating backward through the list:")
    for fruit in reversed(fruits):
        print(fruit)

    # Modify elements during iteration
    for i in range(len(fruits)):
        if fruits[i] == "Banana":
            fruits[i] = "Blueberry"

    # Display the list after modification
    print("List after modification:", fruits)


if __name__ == "__main__":
    list_iterator_operations()
