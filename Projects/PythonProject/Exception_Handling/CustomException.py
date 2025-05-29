# Define a custom exception
class InvalidAgeException(Exception):
    def __init__(self, message):
        super().__init__(message)


# Function to validate age
def validate_age(age):
    if age < 18:
        raise InvalidAgeException(f"Age {age} is not valid. Must be 18 or above.")
    print("Age is valid:", age)


def main():
    try:
        # Test the custom exception by providing an invalid age
        validate_age(16)
    except InvalidAgeException as e:
        print("Caught Custom Exception:", e)


if __name__ == "__main__":
    main()
