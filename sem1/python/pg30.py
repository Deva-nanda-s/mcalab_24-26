# Lambda functions to calculate the area
area_square = lambda side: side ** 2  # Area of square = side^2
area_rectangle = lambda length, width: length * width  # Area of rectangle = length * width
area_triangle = lambda base, height: 0.5 * base * height  # Area of triangle = 0.5 * base * height

# Step 1: Square input and area calculation using map
side = map(float, input("Enter the side length of the square: ").split())
print("Area of the square:", area_square(*side))

# Step 2: Rectangle input and area calculation using map
length, width = map(float, input("Enter the length and width of the rectangle: ").split())
print("Area of the rectangle:", area_rectangle(length, width))

# Step 3: Triangle input and area calculation using map
base, height = map(float, input("Enter the base and height of the triangle: ").split())
print("Area of the triangle:", area_triangle(base, height))