class Example:
    # Class variable (similar to static variable in Java)
    static_var = 20

    def __init__(self):
        # Instance variable
        self.instance_var = 10

    def display(self):
        # Local variable
        local_var = 30
        print("Local Variable:", local_var)
        print("Instance Variable:", self.instance_var)
        print("Static Variable:", Example.static_var)


def main():
    obj = Example()
    obj.display()


if __name__ == "__main__":
    main()
