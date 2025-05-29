# Class representing a custom data type
class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

# Main logic to demonstrate class type retrieval
def main():
    person = Person("John Doe", 30)
    string_object = "Hello, World!"
    integer_object = 42

    # Retrieve and print the runtime class of each object
    print("Class of person object:", person.__class__.__name__)
    print("Class of stringObject:", string_object.__class__.__name__)
    print("Class of integerObject:", integer_object.__class__.__name__)

if __name__ == "__main__":
    main()
