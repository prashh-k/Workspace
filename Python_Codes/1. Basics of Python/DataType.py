def main():
    # Numeric types
    a = 127               # int
    b = 32000             # int (Python doesn't have short)
    c = 100000            # int
    d = 123456789         # int (Python handles long integers automatically)
    e = 3.14              # float
    f = 3.14159           # float (Python has no separate double type)

    # Text type
    g = 'A'               # str (single character is a string in Python)

    # Boolean type
    h = True              # bool

    # Sequence types
    i = [1, 2, 3]         # list
    j = (4, 5, 6)         # tuple
    k = range(3)          # range

    # Set type
    l = {1, 2, 3}         # set

    # Mapping type
    m = {"name": "Alice", "age": 25}  # dict

    print("Int Value (a):", a)
    print("Int Value (b):", b)
    print("Int Value (c):", c)
    print("Long-like Int (d):", d)
    print("Float Value (e):", e)
    print("Double-like Float (f):", f)
    print("Char-like String (g):", g)
    print("Boolean Value (h):", h)
    print("List (i):", i)
    print("Tuple (j):", j)
    print("Range (k):", list(k))
    print("Set (l):", l)
    print("Dictionary (m):", m)

if __name__ == "__main__":
    main()
