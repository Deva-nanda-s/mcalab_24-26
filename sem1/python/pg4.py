#pg4(a,b,c)
collection1=set(map(int,input("Enter1st numbers").split()))
collection2=set(map(int,input("Enter 2ndnumbers").split()))
print("Same length:" , len(collection1) == len(collection2))
print("Same sums:" ,sum(collection1) == sum(collection2))
print("Common value:",len(collection1&collection2))

