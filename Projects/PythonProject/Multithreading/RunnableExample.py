import threading

class MyRunnable:
    def run(self):
        print(f"Runnable thread is running: {threading.current_thread().name}")

def execute_runnable_example():
    runnable = MyRunnable()
    
    # Create and start two threads
    thread1 = threading.Thread(target=runnable.run)
    thread2 = threading.Thread(target=runnable.run)
    
    thread1.start()
    thread2.start()

if __name__ == "__main__":
    execute_runnable_example()
