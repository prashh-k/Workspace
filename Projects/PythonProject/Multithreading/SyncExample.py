import threading

class Counter:
    def __init__(self):
        self.count = 0
        self.lock = threading.Lock()

    def increment(self):
        with self.lock:
            self.count += 1

    def get_count(self):
        return self.count

def execute_synchronization_example():
    counter = Counter()

    def task():
        for _ in range(1000):
            counter.increment()

    thread1 = threading.Thread(target=task)
    thread2 = threading.Thread(target=task)

    thread1.start()
    thread2.start()

    thread1.join()
    thread2.join()

    print("Final Counter Value:", counter.get_count())

if __name__ == "__main__":
    execute_synchronization_example()
