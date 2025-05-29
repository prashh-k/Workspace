# Simulating a memory leak by holding references in a global list

memory_leak = []

def demonstrate_memory_leak():
    for i in range(100000):
        memory_leak.append(object())  # Objects are never released
    print("Objects added without release. Potential memory leak!")

if __name__ == "__main__":
    demonstrate_memory_leak()
