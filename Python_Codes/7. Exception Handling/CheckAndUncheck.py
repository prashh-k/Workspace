def demonstrate_checked_exception():
    try:
        # Attempt to open a file that may not exist
        with open("nonexistent.txt", "r") as file:
            line = file.readline()
            print("File content:", line)
    except FileNotFoundError as e:
        # Handle the checked-like exception (in Python, all exceptions are unchecked, but this mimics checked behavior)
        print("Checked Exception - File not found:", e)
    except IOError as e:
        # Handle other I/O errors
        print("Checked Exception - I/O error:", e)


def demonstrate_unchecked_exception():
    numbers = [1, 2, 3]
    try:
        # This will raise an IndexError
        print("Accessing element:", numbers[5])
    except IndexError as e:
        # Handle the unchecked exception
        print("Unchecked Exception -", type(e).__name__ + ":", e)


def main():
    print("=== Checked Exception Demo ===")
    demonstrate_checked_exception()

    print("\n=== Unchecked Exception Demo ===")
    demonstrate_unchecked_exception()


if __name__ == "__main__":
    main()
