from collections import deque

def deque_operations():
    # Create a deque
    dq = deque()

    # Add elements to the front and back of the deque
    dq.appendleft("First")
    dq.append("Second")
    dq.append("Third")
    dq.appendleft("Zeroth")

    # Display the deque
    print("Deque:", list(dq))

    # Remove elements from the front and back of the deque
    removed_first = dq.popleft()
    removed_last = dq.pop()
    print("Removed First Element:", removed_first)
    print("Removed Last Element:", removed_last)

    # Display the deque after removals
    print("Deque after removals:", list(dq))

    # Peek at the front and back of the deque
    front_element = dq[0] if dq else None
    back_element = dq[-1] if dq else None
    print("Front Element:", front_element)
    print("Back Element:", back_element)

    # Check if the deque is empty
    is_empty = len(dq) == 0
    print("Is the deque empty?", is_empty)


if __name__ == "__main__":
    deque_operations()
