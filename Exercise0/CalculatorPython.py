import math

def add_numbers():
    num1 = float(input("Enter your first number: "))
    num2 = float(input("Enter your second number: "))
    
    result = num1 + num2
    return result

def subtract_numbers():
    num1 = float(input("Enter your first number: "))
    num2 = float(input("Enter your second number: "))

    result = num1 - num2
    return result

def multiply_numbers():
    num1 = float(input("Enter your first number: "))
    num2 = float(input("Enter your second number: "))

    result = num1 * num2
    return result

def divide_numbers(): 
    num1 = float(input("Enter the numerator: "))
    num2 = float(input("Enter the denominator: "))
    if num2 == 0:
        print("Error: Cannot divide by zero.")
        return None
    
    result = num1 / num2
    return result

def square_root():
    num = float(input("Enter your number: "))
    if num < 0:
        print("Error: Cannot calculate the square root of a negative number.")
        return None
    
    result = math.sqrt(num)
    return result

def integrate_function():
    # Simple trapezoidal rule for numerical integration
    def trapezoidal_rule(f, a, b, n):
        h = (b - a) / n
        integral = 0.5 * (f(a) + f(b))
        for i in range(1, n):
            integral += f(a + i * h)
        integral *= h
        return integral

    # Define the function to be integrated
    def parse_function(expression):
        return lambda x: eval(expression)

    function_expr = input("Enter the function to integrate (in terms of x, e.g., 'x**2'): ")
    try:
        func = parse_function(function_expr)
        result = trapezoidal_rule(func, 0, 1, 1000)  # Integrate from 0 to 1 with 1000 intervals
        return result
    except Exception as e:
        print("Error:", e)
        return None

def matrix_addition():
    rows = int(input("Enter the number of rows in the matrices: "))
    columns = int(input("Enter the number of columns in the matrices: "))

    matrix1 = []
    matrix2 = []

    print("Enter the elements of the first matrix:")
    for i in range(rows):
        row = []
        for j in range(columns):
            value = float(input(f"Enter the value at position ({i+1},{j+1}): "))
            row.append(value)
        matrix1.append(row)

    print("Enter the elements of the second matrix:")
    for i in range(rows):
        row = []
        for j in range(columns):
            value = float(input(f"Enter the value at position ({i+1},{j+1}): "))
            row.append(value)
        matrix2.append(row)

    # Add the matrices
    result = []
    for i in range(rows):
        row_result = []
        for j in range(columns):
            sum_value = matrix1[i][j] + matrix2[i][j]
            row_result.append(sum_value)
        result.append(row_result)

    return result

def main():
    while True:
        operation = input("Which mathematical operation do you need? (add/subtract/multiply/divide/integrate/addmatrices/exit): ").lower()

        if operation == "add":
            result = add_numbers()
            print("The result of addition is:", result)
        elif operation == "subtract":
            result = subtract_numbers()
            print("The result of subtraction is:", result)
        elif operation == "multiply":
            result = multiply_numbers()
            print("The result of multiplication is:", result)
        elif operation == "divide":
            result = divide_numbers()
            if result is not None:
                print("The result of division is:", result)
        elif operation == "integrate":
            result = integrate_function()
            if result is not None:
                print("The approximate value of the integral is:", result)
        elif operation == "addmatrices":
            result = matrix_addition()
            print("The resulting matrix is:")
            for row in result:
                print(row)
        elif operation == "exit":
            print("Exiting the program. Goodbye!")
            break
        else:
            print("Invalid operation. Please try again.")

if __name__ == "__main__":
    main()
