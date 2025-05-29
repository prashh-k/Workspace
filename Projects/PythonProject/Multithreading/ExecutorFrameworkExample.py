from concurrent.futures import ThreadPoolExecutor
import threading

def task():
    print(f"Task executed by: {threading.current_thread().name}")

def execute_executor_framework_example():
    # Create a thread pool with 3 threads
    with ThreadPoolExecutor(max_workers=3) as executor:
        for _ in range(5):
            executor.submit(task)

if __name__ == "__main__":
    execute_executor_framework_example()
