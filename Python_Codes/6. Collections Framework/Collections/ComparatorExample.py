class Product:
    def __init__(self, name, price):
        self.name = name
        self.price = price

    def __str__(self):
        return f"{self.name} (${self.price})"

    def __repr__(self):
        return self.__str__()


def sort_products_by_price():
    products = [
        Product("Laptop", 999.99),
        Product("Smartphone", 499.99),
        Product("Tablet", 299.99)
    ]

    # Display the products before sorting
    print("Products before sorting:", products)

    # Sort the products by price using a lambda as the key
    sorted_products = sorted(products, key=lambda p: p.price)

    # Display the products after sorting
    print("Products after sorting by price:", sorted_products)


if __name__ == "__main__":
    sort_products_by_price()
