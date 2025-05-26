import copy

class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    # Method to display the details of the Person
    def display(self):
        print(f"Name: {self.name}, Age: {self.age}")

# Main logic to demonstrate cloning
def main():
    # Create an object of Person
    person1 = Person("John Doe", 30)

    # Clone the person1 object to create person2 (shallow copy)
    person2 = copy.copy(person1)

    # Display details of both objects
    print("Original Object (person1):")
    person1.display()

    print("Cloned Object (person2):")
    person2.display()

if __name__ == "__main__":
    main()
