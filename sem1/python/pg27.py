 #Write a program that counts odd and even numbers in a given list.
n=input("Enter list of integers").split(',')
c=0
o=0
for x in n:
  if (not int(x)%2):
   c+=1
  else:
    o+=1
print("Even=",c)
print("odd=",o)