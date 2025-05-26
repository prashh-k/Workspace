import warnings
import functools

# Custom decorator to mark deprecated methods
def deprecated(func):
    @functools.wraps(func)
    def wrapper(*args, **kwargs):
        warnings.warn(
            f"{func.__name__} is deprecated and may be removed in future versions.",
            category=DeprecationWarning,
            stacklevel=2
        )
        return func(*args, **kwargs)
    return wrapper

class BuiltInAnnotationsExample:
    
    # Simulating @SuppressWarnings by ignoring warnings manually
    def suppress_warning_example(self):
        warnings.filterwarnings("ignore", category=DeprecationWarning)
        raw_list = []  # Python doesn't have raw types, but we can simulate unchecked behavior
        raw_list.append("This is a raw type example!")
        print(raw_list[0])
        warnings.resetwarnings()

    # Simulating @Deprecated
    @deprecated
    def deprecated_method(self):
        print("This method is deprecated and may be removed in future versions.")

    # Simulating @Override by overriding __str__
    def __str__(self):
        return "BuiltInAnnotationsExample class demonstrating built-in annotations!"

# Main execution
if __name__ == "__main__":
    example = BuiltInAnnotationsExample()

    # Calling the deprecated method
    example.deprecated_method()

    # Suppressing warnings example
    example.suppress_warning_example()

    # Using the overridden __str__ method
    print(example)
