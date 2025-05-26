import pickle

class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def __str__(self):
        return f"Person(name='{self.name}', age={self.age})"


def serialize_person(file_path, person):
    try:
        with open(file_path, 'wb') as file:
            pickle.dump(person, file)
            print("Person object serialized!")
    except IOError as e:
        print("Error during serialization:", e)


def deserialize_person(file_path):
    try:
        with open(file_path, 'rb') as file:
            person = pickle.load(file)
            print("Deserialized Person:", person)
    except (IOError, pickle.PickleError) as e:
        print("Error during deserialization:", e)


if __name__ == "__main__":
    person = Person("John Doe", 30)
    serialize_person("person.pkl", person)
    deserialize_person("person.pkl")
