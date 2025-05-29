def main():
    print("=== Implicit Type Casting (Widening) ===")
    num = 10
    double_num = float(num)  # Python automatically handles this
    print("Integer:", num)
    print("Converted to Float (Double-like):", double_num)

    print("\n=== Explicit Type Casting (Narrowing) ===")
    double_num1 = 10.75
    num1 = int(double_num1)  # Manual conversion, decimal part is truncated
    print("Float (Double-like):", double_num1)
    print("Converted to Integer:", num1)

    print("\n=== String to Integer Conversion ===")
    s1 = "123"
    try:
        num2 = int(s1)
        print("Converted integer (s1):", num2)
    except ValueError:
        print("s1 is not a valid integer.")

    s2 = "123abc"
    try:
        num3 = int(s2)
        print("Converted integer (s2):", num3)
    except ValueError:
        print("s2 is not a valid integer.")

    s3 = "12.34"
    try:
        num4 = int(float(s3))  # Convert to float first, then to int
        print("Converted from decimal string (s3):", num4)
    except ValueError:
        print("s3 is not a valid number.")

    s4 = "₹100"
    try:
        cleaned_s4 = ''.join(filter(str.isdigit, s4))
        num5 = int(cleaned_s4)
        print("Converted from currency string (s4):", num5)
    except ValueError:
        print("s4 is not a valid number.")

if __name__ == "__main__":
    main()
