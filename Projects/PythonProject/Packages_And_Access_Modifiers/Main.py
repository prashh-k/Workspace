from datetime import date
from employee2 import Employee2

# Subclass of Employee2
class Manager(Employee2):
    def __init__(self, name, age, joining_date, department):
        super().__init__(name, age, joining_date, department)

    # Accessing protected member
    def show_joining_date(self):
        print("Joining Date (Protected Access):", self._joining_date)

# Main logic
def main():
    emp = Employee2("Alice", 30, date(2020, 5, 20), "HR")

    # Accessing public member
    print("Public Name:", emp.name)

    # Accessing private member (will raise AttributeError if uncommented)
    # print(emp.__age)

    # Accessing protected member via subclass
    mgr = Manager("Bob", 40, date(2015, 3, 10), "Finance")
    mgr.show_joining_date()

    # Accessing public method
    emp.show_details()

if __name__ == "__main__":
    main()
