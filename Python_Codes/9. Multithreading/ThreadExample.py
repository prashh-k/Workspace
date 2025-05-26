import threading

class MyThread(threading.Thread):
    def run(self):
        print(f"Thread is running: {threading.current_thread().name}")

def execute_thread_example():
    thread = MyThread()
    thread.start()  # Starts the thread

if __name__ == "__main__":
    execute_thread_example()
