import gc

class MyObject:
    def __init__(self, name):
        self.name = name

    def __del__(self):
        print(f"{self.name} is finalized and resources are released!")

def demonstrate_finalize():
    obj = MyObject("Finalizing Object")
    obj = None  # Eligible for garbage collection
    gc.collect()  # Suggest garbage collection

if __name__ == "__main__":
    demonstrate_finalize()
