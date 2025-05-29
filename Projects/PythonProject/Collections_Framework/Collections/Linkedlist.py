from collections import deque

class TaskList:
    # Method to add a task to the list
    def add_task(self, tasks, task):
        tasks.append(task)

    # Method to remove a task from the list
    def remove_task(self, tasks, task):
        if task in tasks:
            tasks.remove(task)

    # Method to print the list of tasks
    def print_tasks(self, tasks):
        print("Task List:", list(tasks))


def main():
    task_list = TaskList()

    # Create a deque to store tasks
    tasks = deque()

    # Add tasks to the list
    task_list.add_task(tasks, "Buy groceries")
    task_list.add_task(tasks, "Pay bills")
    task_list.add_task(tasks, "Complete project")

    # Print the list of tasks
    task_list.print_tasks(tasks)

    # Remove a task from the list
    task_list.remove_task(tasks, "Pay bills")

    # Print the list of tasks after removal
    task_list.print_tasks(tasks)


if __name__ == "__main__":
    main()
