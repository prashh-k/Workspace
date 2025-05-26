from collections import deque

def queue_operations():
    # Create a queue using deque
    queue = deque()

    # Add elements to the queue
    queue.append("First")
    queue.append("Second")
    queue.append("Third")

    # Display the queue
    print("Queue:", list(queue))

    # Remove an element from the queue
    removed_element = queue.popleft()
    print("Removed Element:", removed_element)

    # Display the queue after removal
    print("Queue after removal:", list(queue))

    # Peek at the front of the queue
    front_element = queue[0] if queue else None
    print("Front Element:", front_element)

    # Check if the queue is empty
    is_empty = len(queue) == 0
    print("Is the queue empty?", is_empty)


if __name__ == "__main__":
    queue_operations()
