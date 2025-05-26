# Define a class with methods for checking numbers
class Sample:
    @staticmethod
    def check_number(number):
        if number < 0:
            # Manually raise an exception
            raise ValueError("Number must be non-negative.")
        print("Number is valid:", number)

    def sample1(self):
        try:
            # This call may raise an exception
            self.check_number(-5)
        except ValueError as e:
            # Catch the raised exception
            print("Caught Exception:", e)


def main():
    s1 = Sample()
    s1.sample1()


if __name__ == "__main__":
    main()
