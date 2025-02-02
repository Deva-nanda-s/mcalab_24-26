# "Write lambda functions:
# (a) To find largest of 2 numbers
# (b)  To check the input number is divisible by 5
# (c) To remove all strings with length < 5 from a list of strings
# (d)  To increment a list of integers by 10% if the number is greater than 1000 else by 5%.

# pg 29a
# def myfn(n):
#     return lambda a,b:a if a>b else b

# n=input("Enter 2 numbers seperated by comma")
# a,b=map(int,n.split(','))
# new=myfn(n)
# print(new(a,b))


# # pg 29b
# def myfn(n):
#   return lambda a:"divisible by 5" if not int(a)%5 else "not divisible by 5"

# n=input("Enter a number to check:")
# new=myfn(n)
# print(new(n))

# #pg29 c
# def myfn(n):
#     return list(filter(lambda x:len(x)>5,n))

# n=input("Enter list of strings seperated by comma:").split(',')
# new=myfn(n)
# print(new)

#pg29d
# def myfn(n):
#     return lambda x: x*0.1  if  x>1000 else x*0.05 

# n=input("Enter list of integers seperated by comma:").split(',')
# new=[int(x) for x in n]
# res=list(map(myfn(n),new))
# print(res)

