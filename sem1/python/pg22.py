c=0
name=input("Enter list of items").split()
target=input("Enter target")
for i in name:
    if(target==i):
        c+=1
       
print(c)
print("END")