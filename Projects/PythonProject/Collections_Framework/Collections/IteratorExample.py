def iterator_operations():
    # Create a list
    fruits = ["Apple", "Banana", "Cherry"]

    # Get the iterator
    iterator = iter(fruits)

    # Iterate through the list
    print("Iterating through the list:")
    for fruit in fruits:
        print(fruit)

    # Remove an element using a new list (safe way in Python)
    fruits = [fruit for fruit in fruits if fruit != "Banana"]

    # Display the list after removal
    print("List after removal:", fruits)


if __name__ == "__main__":
    iterator_operations()
