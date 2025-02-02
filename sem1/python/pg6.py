# #pg6(A)
# alphabets={}
# a=input("Enter word")
# for c in a:
#   alphabets[c]=alphabets.get(c,0)+1
# print(alphabets)


#pg6(b)
a=input("Enter first names").split(',')
b=len([x for x in a if x.lower().startswith("a")])
print(b)