class StaticNestedClassExample:
    # Outer class
    class University:
        university_name = "Global Tech University"  # Static variable

        # Static nested class
        class Department:
            def display(self):
                # Accessing static variable from outer class
                print(f"Welcome to the Computer Science Department at {StaticNestedClassExample.University.university_name}")

    # Method to demonstrate usage
    def demonstrate(self):
        # No need to create University instance
        dept = self.University.Department()
        dept.display()

# Main execution
if __name__ == "__main__":
    example = StaticNestedClassExample()
    example.demonstrate()
