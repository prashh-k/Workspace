import threading
import time

class LifecycleDemo(threading.Thread):
    def run(self):
        print("Thread is in the Running state")
        time.sleep(0.5)  # Simulate some work

def execute_thread_lifecycle_example():
    thread = LifecycleDemo()
    print("Thread State: NEW (created but not started)")
    
    thread.start()
    print("Thread State: RUNNABLE (started, running or ready to run)")

    thread.join()  # Wait for thread to finish
    print("Thread State: TERMINATED (completed execution)")

if __name__ == "__main__":
    execute_thread_lifecycle_example()
