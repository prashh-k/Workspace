class ArithmeticExpression:
    def arithmetic_exception(self):
        try:
            # This will cause a ZeroDivisionError if b is 0
            a = int(input("Enter the numerator: "))
            b = int(input("Enter the denominator: "))
            result = a / b
            print("Result:", result)
        except ZeroDivisionError as e:
            # Exception caught and handled here
            print("Caught a ZeroDivisionError:", e)
        finally:
            # This block always executes
            print("Finally block executed.")


def main():
    a1 = ArithmeticExpression()
    a1.arithmetic_exception()


if __name__ == "__main__":
    main()
