import re

def main():
    # ********** 1. String & Common Methods (Immutable) **********
    print("\n----- String & Common Methods -----")
    str1 = "Hello"
    str2 = str("World")  # Explicit constructor (not common in Python)

    print("Original String:", str1)
    print("Length:", len(str1))
    print("Character at index 1:", str1[1])
    print("Concatenation:", str1 + " Java")
    print("Uppercase:", str1.upper())
    print("Lowercase:", str1.lower())
    print("Index of 'o':", str1.find('o'))
    print("Substring (0, 4):", str1[0:4])
    print("Replace 'H' with 'J':", str1.replace('H', 'J'))
    print("Check if starts with 'He':", str1.startswith("He"))
    print("Check if ends with 'o':", str1.endswith("o"))
    print("Trim spaces:", "   Hello Java   ".strip())
    print("Equals 'Hello'?", str1 == "Hello")
    print("Ignore case equals 'hello'?", str1.lower() == "hello".lower())

    # ********** 2. Mutable String Equivalent (Using list or io.StringIO) **********
    print("\n----- Mutable String (Using List) -----")
    sb = list("Hello")
    sb.extend(" World")
    print("After append:", ''.join(sb))

    sb[5:5] = list(" Java")
    print("After insert:", ''.join(sb))

    sb[6:10] = list("C++")
    print("After replace:", ''.join(sb))

    del sb[5:9]
    print("After delete:", ''.join(sb))

    sb.reverse()
    print("After reverse:", ''.join(sb))

    # ********** 3. Thread-Safe Mutable String (Python strings are thread-safe by default) **********
    print("\n----- Thread-Safe Mutable String (Simulated) -----")
    from io import StringIO
    sbf = StringIO()
    sbf.write("Hello")
    sbf.write(" World")
    result = sbf.getvalue()
    print("After append:", result)

    # Simulate insert, replace, delete, reverse using string slicing
    result = result[:5] + " Java" + result[5:]
    print("After insert:", result)

    result = result[:6] + "Python" + result[10:]
    print("After replace:", result)

    result = result[:5] + result[11:]
    print("After delete:", result)

    print("After reverse:", result[::-1])

    # ********** 4. Immutability of Strings **********
    print("\n----- Immutability -----")
    immutable_string = "Immutable"
    immutable_string.concat = immutable_string + " Changed"  # New string created
    print("Immutable String remains unchanged:", immutable_string)

    # ********** 5. String Pool (Interning) **********
    print("\n----- String Pool Concept -----")
    pool_string1 = "Hello"
    pool_string2 = "Hello"
    print("Comparing String Pool references:", pool_string1 is pool_string2)  # True due to interning

    # ********** 6. String Tokenization **********
    print("\n----- String Tokenization -----")
    sentence = "Java,Python,C++,JavaScript"
    tokens = sentence.split(",")
    for token in tokens:
        print("Token:", token)

if __name__ == "__main__":
    main()
