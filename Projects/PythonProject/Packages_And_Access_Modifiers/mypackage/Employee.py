# employee.py (This would be your user-defined module, similar to a Java package)

from datetime import date

class Employee:
    def __init__(self, name: str, age: int, joining_date: date):
        self.name = name
        self.age = age
        self.joining_date = joining_date

    def get_employee_details(self) -> str:
        return f"{self.name}, {self.age}, Joined on: {self.joining_date}"
