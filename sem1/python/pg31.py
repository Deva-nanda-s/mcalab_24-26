# def rev_string(n):
    

    
#     else:return n+sum_num(n-1)

def rev_string(s):
    # Base case: if the string is empty or has one character, it's already reversed
    if len(s) <= 1:
        return s
    # Recursive case: reverse the rest of the string and append the first character to the end
    return rev_string(s[1:]) + s[0]

# Input from the user
str_1 = input("Enter a string: ")

# Reverse the string and display it
print("Reversed string is:", rev_string(str_1))
