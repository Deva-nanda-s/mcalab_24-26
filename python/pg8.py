#pg8(A)
# l= input("Enter numbers")
# b=list(map(int,l.split()))
# c = [x for x in b if x > 0] 
# print("Pos num:",c)

# #pg8(b)
# l= input("Enter numbers")
# c = [int(x)**2 for x in l.split(',')]
# print(c)

# #pg8(C)
# a=input("Enter a word").lower()
# b=[x for x in a if x in['a','e','i','o','u']]
# print(",".join(b))

#pg8(d)
# l= input("Enter numbers")
# c = (int(x) for x in l.split(',') if int(x) % 2  )
# print(list(c))

# #pg8(e)
year= input("Enter a year")
p=list(map(int,year))
c=[x for x in range(2024,int(year)+1) if x%4==0]
b=",".join(map(str,c))
print("shskj:",b)

