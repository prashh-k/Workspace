import threading

class WaitNotifyExample:
    def __init__(self):
        self.condition = threading.Condition()
        self.flag = False

    def producer(self):
        with self.condition:
            print("Producer is producing...")
            self.flag = True
            self.condition.notify()

    def consumer(self):
        with self.condition:
            while not self.flag:
                self.condition.wait()
            print("Consumer consumed.")

def execute_wait_notify_example():
    example = WaitNotifyExample()

    producer_thread = threading.Thread(target=example.producer)
    consumer_thread = threading.Thread(target=example.consumer)

    consumer_thread.start()
    producer_thread.start()

    producer_thread.join()
    consumer_thread.join()

if __name__ == "__main__":
    execute_wait_notify_example()
