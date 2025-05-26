def write_and_read_file(file_path, content):
    # Write content to the file
    try:
        with open(file_path, 'w', encoding='utf-8') as writer:
            writer.write(content)
            print("Content written to file!")
    except IOError as e:
        print("Error writing to file:", e)

    # Read content from the file
    try:
        with open(file_path, 'r', encoding='utf-8') as reader:
            print("Reading content from file:")
            while True:
                char_data = reader.read(1)  # Read one character at a time
                if not char_data:
                    break
                print(char_data, end='')
            print()
    except IOError as e:
        print("Error reading from file:", e)


if __name__ == "__main__":
    write_and_read_file("C:/WorkSpace/Python_Codes/8. IO Streams/example.txt", "Hello, world!")
