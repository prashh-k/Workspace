class TreeSetManager:
    # Method to add a student name to the set
    def add_student_name(self, student_names, student_name):
        if student_name not in student_names:
            student_names.add(student_name)
            print(f"Student name {student_name} added.")
        else:
            print(f"Student name {student_name} already exists.")

    # Method to remove a student name from the set
    def remove_student_name(self, student_names, student_name):
        if student_name in student_names:
            student_names.remove(student_name)
            print(f"Student name {student_name} removed.")
        else:
            print(f"Student name {student_name} not found.")

    # Method to print the set of student names in sorted order
    def print_student_names(self, student_names):
        print("Student Names:", sorted(student_names))


def main():
    manager = TreeSetManager()

    # Create a set to store student names
    student_names = set()

    # Add student names to the set
    manager.add_student_name(student_names, "Alice")
    manager.add_student_name(student_names, "Bob")
    manager.add_student_name(student_names, "Charlie")
    manager.add_student_name(student_names, "Alice")  # Duplicate name

    # Print the set of student names
    manager.print_student_names(student_names)

    # Remove a student name from the set
    manager.remove_student_name(student_names, "Bob")

    # Print the set of student names after removal
    manager.print_student_names(student_names)


if __name__ == "__main__":
    main()
