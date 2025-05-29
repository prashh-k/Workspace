from enum import Enum

# Define an enumeration
class Level(Enum):
    LOW = 1
    MEDIUM = 2
    HIGH = 3

# Main logic
if __name__ == "__main__":
    my_var = Level.MEDIUM
    print(my_var)
