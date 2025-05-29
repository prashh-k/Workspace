# Class representing a Person
class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    # Overriding the __str__ method
    def __str__(self):
        return f"Person(name='{self.name}', age={self.age})"

# Main logic to demonstrate __str__()
def main():
    person = Person("John Doe", 30)

    # Printing the object directly
    # The overridden __str__ method is called automatically
    print(person)

if __name__ == "__main__":
    main()
