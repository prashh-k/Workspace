class StudentList:
    # Method to add a student to the list
    def add_student(self, students, student):
        students.append(student)

    # Method to remove a student from the list
    def remove_student(self, students, student):
        if student in students:
            students.remove(student)

    # Method to print the list of students
    def print_students(self, students):
        print("Student List:", students)


def main():
    student_list = StudentList()

    # Create a list to store student names
    students = []

    # Add students to the list
    student_list.add_student(students, "Alice")
    student_list.add_student(students, "Bob")
    student_list.add_student(students, "Charlie")

    # Print the list of students
    student_list.print_students(students)

    # Remove a student from the list
    student_list.remove_student(students, "Bob")

    # Print the list of students after removal
    student_list.print_students(students)


if __name__ == "__main__":
    main()
