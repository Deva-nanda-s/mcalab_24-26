a=input("Enter string")
new=a[0]+a[1:].replace(a[0],'$')
print(new)