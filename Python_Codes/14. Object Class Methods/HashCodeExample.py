class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    # Overriding __eq__ for logical equality
    def __eq__(self, other):
        if not isinstance(other, Person):
            return False
        return self.name == other.name and self.age == other.age

    # Overriding __hash__ to maintain the contract with __eq__
    def __hash__(self):
        return hash((self.name, self.age))

    # Optional: for better print output
    def __repr__(self):
        return f"Person(name='{self.name}', age={self.age})"

# Main logic to demonstrate hash and equality
def main():
    person1 = Person("John Doe", 30)
    person2 = Person("John Doe", 30)

    print("Hash code of person1:", hash(person1))
    print("Hash code of person2:", hash(person2))
    print("Are person1 and person2 equal?", person1 == person2)
    print("person1:", person1)
    print("person2:", person2)

if __name__ == "__main__":
    main()
