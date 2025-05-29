import gc

class MyObject:
    def __init__(self, name):
        self.name = name

    def __del__(self):
        print(f"{self.name} is being collected!")

def demonstrate_garbage_collection():
    obj1 = MyObject("Object1")
    obj1 = None  # Eligible for garbage collection

    obj2 = MyObject("Object2")

    # Manually calling __del__ (not recommended in real apps, just for demo)
    obj2.__del__()

    # Suggest garbage collection
    gc.collect()

if __name__ == "__main__":
    demonstrate_garbage_collection()
