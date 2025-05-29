class AnonymousInnerClassExample:
    # Interface-like Task definition using a base class
    class Task:
        def perform(self):
            raise NotImplementedError("Subclasses should implement this!")

    def execute_task(self):
        # Anonymous-like inner class using inline class definition
        class TaskImpl(self.Task):
            def perform(self):
                print("Performing a simple task...")

        task = TaskImpl()
        task.perform()

# Main execution
if __name__ == "__main__":
    example = AnonymousInnerClassExample()
    example.execute_task()
