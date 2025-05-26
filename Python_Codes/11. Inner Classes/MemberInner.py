class MemberInnerClass:
    # Outer class
    class Car:
        def __init__(self):
            self.__brand = "Toyota"  # Private field using name mangling

        # Member inner class
        class Engine:
            def __init__(self, outer_instance):
                self.outer = outer_instance  # Reference to outer class instance

            def start(self):
                # Accessing private member of outer class using name mangling
                print(f"Starting engine of {self.outer._Car__brand}")

    # Method to demonstrate member inner class instantiation
    def demonstrate(self):
        car = self.Car()  # Create outer class instance
        engine = self.Car.Engine(car)  # Create inner class instance with outer reference
        engine.start()  # Call inner class method

# Main execution
if __name__ == "__main__":
    example = MemberInnerClass()
    example.demonstrate()
