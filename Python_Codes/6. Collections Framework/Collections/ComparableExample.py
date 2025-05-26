from dataclasses import dataclass

@dataclass(order=True)
class Student:
    grade: int
    name: str  # Note: grade comes first to make sorting by grade the default

    def __str__(self):
        return f"Student(name='{self.name}', grade={self.grade})"


def main():
    students = [
        Student(name="Alice", grade=85),
        Student(name="Bob", grade=92),
        Student(name="Charlie", grade=78)
    ]

    print("Before sorting:")
    for student in students:
        print(student)

    # Sorts by grade because of the order of fields in the dataclass
    students.sort()

    print("\nAfter sorting:")
    for student in students:
        print(student)


if __name__ == "__main__":
    main()
