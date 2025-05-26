class MyObject:
    def __init__(self, name):
        self.name = name  # Stored in heap

    def get_name(self):
        return self.name

def demonstrate_stack_heap():
    # Stack allocation (local variable)
    local_variable = 42
    print("Local variable (Stack):", local_variable)

    # Heap allocation (object)
    my_object = MyObject("Heap Object")
    print("Object stored in Heap:", my_object.get_name())

if __name__ == "__main__":
    demonstrate_stack_heap()
