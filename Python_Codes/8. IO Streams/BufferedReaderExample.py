def read_file_line_by_line(file_path):
    try:
        with open(file_path, 'r') as file:
            for line in file:
                print(line.strip())  # strip() removes the newline character
    except IOError as e:
        print("Error reading file:", e)


if __name__ == "__main__":
    read_file_line_by_line("C:/WorkSpace/Python_Codes/8. IO Streams/example2.txt")
