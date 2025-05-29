def copy_file_using_byte_stream(source_file, dest_file):
    try:
        with open(source_file, 'rb') as src, open(dest_file, 'wb') as dst:
            while True:
                byte_data = src.read(1024)  # Read in chunks for efficiency
                if not byte_data:
                    break
                dst.write(byte_data)
        print("File copied successfully!")
    except IOError as e:
        print("Error while copying file:", e)


if __name__ == "__main__":
    copy_file_using_byte_stream(
        "C:/WorkSpace/Python_Codes/8. IO Streams/text1.txt" ,
        "C:/WorkSpace/Python_Codes/8. IO Streams/destination.txt"
    )
