# ##(a)lengthiest line in a file
# import os

# filename = 'sample.txt'

# # Check if the file exists
# if not os.path.exists(filename):
#     # Create the file and add some sample content
#     with open(filename, 'w') as f:
#         f.write("Hello World\n")
#         f.write("This is a sample text file.\n")
#         f.write("Python is fun!\n")
#     print(f"File '{filename}' created with sample content.")
# inf=False

# try:
#     inf=open('sample.txt','r')
#     lines=inf.readlines()
#     lengthiest_line=max(lines,key=len)
#     print("Lengthiest_line:",lengthiest_line.strip())
# except IOError as io:
#     print(io)
# finally:
#     if inf:inf.close()

# #(b)Extract all phone numbers from a file
# import re
# inf=False

# try:
#     inf=open('sample.txt')
#     text=inf.readlines()

# except IOError as io:
#     print(io)
# finally:
#     if inf:inf.close()

# key=re.compile(r'\(?\d{3}\)?(?:[\s.-]?)\d{3}(?:[\s.-]?)\d{4}'
#                r'|\d{10}|\d{4}-\d{7}'
#                r'|\d{4}-\d{7}')

# for num in text:
#    phnum= key.findall(num)
#    if phnum:
     ## print(phnum)
import re

with open("hello1.txt", "r") as file:
    ##print("Lengthiest Line: ",max(file.readlines(), key=len).strip())

    phone_numbers = re.findall(r'\b\d{10}\b', file.read())
    print(phone_numbers)
     

