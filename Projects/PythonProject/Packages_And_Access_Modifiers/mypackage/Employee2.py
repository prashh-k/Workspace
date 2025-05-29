from datetime import date

class Employee2:
    def __init__(self, name: str, age: int, joining_date: date, department: str):
        self.name = name                  # Public
        self.__age = age                  # Private (name mangling)
        self._joining_date = joining_date # Protected (convention)
        self.department = department      # Default (treated as public in Python)

    # Public method
    def show_details(self):
        print("Name:", self.name)
        print("Age:", self.__age)  # Accessing private attribute within the class
        print("Joining Date:", self._joining_date)
        print("Department:", self.department)
