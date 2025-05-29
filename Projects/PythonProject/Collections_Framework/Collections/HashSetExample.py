def main():
    # Create a set of strings
    fruits = set()

    # Add elements to the set
    fruits.add("Apple")
    fruits.add("Banana")
    fruits.add("Orange")
    fruits.add("Mango")
    fruits.add("Apple")  # Duplicate element, will be ignored

    # Print the set
    print("Set:", fruits)

    # Check if an element exists
    if "Banana" in fruits:
        print("Banana is in the set.")

    # Remove an element
    fruits.discard("Orange")
    print("Set after removal:", fruits)


if __name__ == "__main__":
    main()
