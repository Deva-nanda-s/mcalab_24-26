# n = int(input('Enter a number:'))
# print('Even' if not n%2 else 'Odd')

n = input('Enter a list of items:').split()
item = input('Enter an item to search in the list:').lower()
n = list(map(str.lower,n))
print('Available' if item in n else 'Not Available')
