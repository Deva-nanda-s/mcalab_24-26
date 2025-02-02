a=input("Enter a sentence")
c=0
for i in a:
    if i.lower() in ('a','e','i','o','u'):
     c+=1
print("VOwel count=",c)