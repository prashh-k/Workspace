from datetime import date
from mypackage.employee import Employee

def main():
    # Using list to store employees
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
