n=input("Enter comma seperated sequence of words").split(",")
n=sorted(set(n))
print(", ".join(n))  
