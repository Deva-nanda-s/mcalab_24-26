#Write a program that count the number of strings where string length is 2 or more and the first and last characters are same.

n=input("Enter some strings that are commma seperated").split(',')
c=0
for i in n:
  if(len(i)>=2 and i[0]==i[-1]):
    print(i)
    c+=1
print("count=",c)



