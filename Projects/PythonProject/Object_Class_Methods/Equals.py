class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    # Overriding the __eq__ method to compare based on data
    def __eq__(self, other):
        if not isinstance(other, Person):
            return False
        return self.name == other.name and self.age == other.age

# Main logic to test equality
def main():
    person1 = Person("John Doe", 30)
    person2 = Person("John Doe", 30)

    # Compare using overridden __eq__ method
    print("Are person1 and person2 equal?", person1 == person2)

    # Compare using reference comparison
    print("Do person1 and person2 reference the same object?", person1 is person2)

if __name__ == "__main__":
    main()
