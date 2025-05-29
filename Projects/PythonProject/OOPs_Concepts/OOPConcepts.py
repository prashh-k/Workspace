# 1. Class & Object with Constructor
class Animal:
    def __init__(self, name):  #2. Constructor
        self.name = name

    # Method for polymorphism
    def make_sound(self):
        print(f"{self.name} makes a sound.")

# 3. Inheritance
class Dog(Animal):
    def __init__(self, name, breed):
        super().__init__(name)  # Using 'super' to call parent constructor
        self.breed = breed

    # 4. Overriding
    def make_sound(self):
        print(f"{self.name} barks!")

    # 5. Overloading (simulated using default argument)
    def make_sound_with_intensity(self, intensity="loudly"):
        print(f"{self.name} barks {intensity}!")

# 6. Abstraction using Abstract Base Class
from abc import ABC, abstractmethod

class Bird(ABC):
    @abstractmethod
    def fly(self):
        pass

    def sleep(self):
        print("Bird sleeps peacefully.")

class Sparrow(Bird):
    def fly(self):
        print("Sparrow flies gracefully.")

# 7. Interface (Python uses ABC for this too)
class Vehicle(ABC):
    @abstractmethod
    def start(self):
        pass

class Car(Vehicle):
    def start(self):
        print("Car starts with ignition.")

# 8. Encapsulation
class BankAccount:
    def __init__(self, balance):
        self.__balance = balance  # Private variable

    def get_balance(self):
        return self.__balance

    def set_balance(self, balance):
        self.__balance = balance

# MAIN FUNCTION
def main():
    # Class & Object + Constructor
    generic_animal = Animal("Generic Animal")
    generic_animal.make_sound()

    # Inheritance & Overriding
    my_dog = Dog("Buddy", "Labrador")
    my_dog.make_sound()
    my_dog.make_sound_with_intensity("loudly")

    # Abstraction
    sparrow = Sparrow()
    sparrow.fly()
    sparrow.sleep()

    # Interface Implementation
    my_car = Car()
    my_car.start()

    # Encapsulation
    my_account = BankAccount(1000.50)
    print("Initial Balance: $", my_account.get_balance())
    my_account.set_balance(2000.75)
    print("Updated Balance: $", my_account.get_balance())

if __name__ == "__main__":
    main()
