from datetime import date

# Employee class to store employee details
class Employee:
    def __init__(self, name, age, joining_date):
        self.name = name
        self.age = age
        self.joining_date = joining_date

    # Method to return employee details as a formatted string
    def get_employee_details(self):
        return f"{self.name}, {self.age}, Joined on: {self.joining_date}"

# Main logic to manage employees
def main():
    # Using a list to store employees
    employees = [
        Employee("Alice", 30, date(2020, 5, 20)),
        Employee("Bob", 25, date(2021, 8, 15)),
        Employee("Charlie", 28, date(2019, 3, 10))
    ]

    # Displaying employee details
    print("Employee List:")
    for emp in employees:
        print(emp.get_employee_details())

if __name__ == "__main__":
    main()
