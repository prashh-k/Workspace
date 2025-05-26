import inspect
from functools import wraps

# Define a custom decorator to simulate annotation
def my_annotation(value):
    def decorator(func):
        @wraps(func)
        def wrapper(*args, **kwargs):
            return func(*args, **kwargs)
        wrapper._annotation_value = value  # Attach metadata
        return wrapper
    return decorator

# Logic class using the custom annotation
class LogicClass:
    @my_annotation("Executing business logic")
    def execute(self):
        print("Business logic is running...")

# Main logic to process the annotation
def main():
    obj = LogicClass()
    method = getattr(obj, 'execute')

    # Check for the custom annotation
    if hasattr(method, '_annotation_value'):
        print("Annotation Value:", method._annotation_value)

    # Call the actual method
    method()

if __name__ == "__main__":
    main()
