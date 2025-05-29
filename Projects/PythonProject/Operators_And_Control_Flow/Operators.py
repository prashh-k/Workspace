class Animal:
    pass

class Dog(Animal):
    pass

def main():
    # Arithmetic Operators
    a, b = 10, 5
    print("Arithmetic Operators:")
    print("Addition:", a + b)
    print("Subtraction:", a - b)
    print("Multiplication:", a * b)
    print("Division:", a / b)
    print("Modulus:", a % b)
    print("-----------------------------------")

    # Unary Operators
    print("Unary Operators:")
    x = 5
    print("Post-increment (simulated):", x)
    x += 1
    print("Pre-increment:", x)
    x -= 1
    print("Post-decrement (simulated):", x)
    x -= 1
    print("Pre-decrement:", x)
    print("Negation:", -x)
    print("-----------------------------------")

    # Assignment Operators
    print("Assignment Operators:")
    y = 10
    y += 5
    y -= 3
    y *= 2
    y /= 4
    y %= 3
    print("Relational Operators:")
    print("Equal:", a == b)
    print("Not Equal:", a != b)
    print("Greater Than:", a > b)
    print("Less Than:", a < b)
    print("Greater or Equal:", a >= b)
    print("Less or Equal:", a <= b)
    print("-----------------------------------")

    # Logical Operators
    print("Logical Operators:")
    p, q = True, False
    print("AND:", p and q)
    print("OR:", p or q)
    print("NOT:", not p)
    print("-----------------------------------")

    # Ternary Operator
    print("Ternary Operator:")
    min_val = a if a < b else b
    print("Minimum value:", min_val)
    print("-----------------------------------")

    # Bitwise Operators
    print("Bitwise Operators:")
    bit1, bit2 = 5, 3
    print("AND:", bit1 & bit2)
    print("OR:", bit1 | bit2)
    print("XOR:", bit1 ^ bit2)
    print("NOT:", ~bit1)
    print("-----------------------------------")

    # Shift Operators
    print("Shift Operators:")
    print("Left Shift:", a << 2)
    print("Right Shift:", a >> 2)
    print("-----------------------------------")

    # isinstance Operator
    print("isinstance Operator:")
    animal = Dog()
    print("Is Dog an instance of Animal?", isinstance(animal, Animal))
    print("Is Dog an instance of Dog?", isinstance(animal, Dog))

if __name__ == "__main__":
    main()
