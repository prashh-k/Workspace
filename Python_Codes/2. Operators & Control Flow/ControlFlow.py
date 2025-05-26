def add_numbers(a, b):
    return a + b  # Return statement example

def main():
    print("=== Decision-Making (if-else) ===")
    num = 10
    if num > 0:
        print(f"{num} is positive.")
    else:
        print(f"{num} is negative.")
    print("-----------------------------------")

    # print("=== Match Statement (Python 3.10+) ===")
    # day = 3
    # match day:
    #     case 1:
    #         print("Monday")
    #     case 2:
    #         print("Tuesday")
    #     case 3:
    #         print("Wednesday")
    #     case _:
    #         print("Invalid day")
    # print("-----------------------------------")

    print("=== For Loop ===")
    for i in range(1, 6):
        print("Iteration:", i)
    print("-----------------------------------")

    print("=== While Loop ===")
    count = 1
    while count <= 3:
        print("Count:", count)
        count += 1
    print("-----------------------------------")

    print("=== Do-While Loop (simulated) ===")
    do_count = 1
    while True:
        print("Do Count:", do_count)
        do_count += 1
        if do_count > 2:
            break
    print("-----------------------------------")

    print("=== Break Statement ===")
    for i in range(1, 6):
        if i == 3:
            print("Loop stopped at:", i)
            break
        print("Iteration:", i)
    print("-----------------------------------")

    print("=== Continue Statement ===")
    for i in range(1, 6):
        if i == 3:
            print("Skipping iteration:", i)
            continue
        print("Iteration:", i)
    print("-----------------------------------")

    print("=== Return Statement ===")
    result = add_numbers(5, 10)
    print("Sum:", result)
    print("-----------------------------------")

if __name__ == "__main__":
    main()
