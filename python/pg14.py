# n=int(input("Enter a positive number"))
# f=1
# for i in range(1,n+1):
#     f=f*i
# print('factorial of %d=%d' % (n,f))

a,b=0,1
n=int(input("Enter limit"))
for i in range(n-1):                
    a,b=b,a+b
print("jhih:%d" % (a))

s=0
n=(input("Enter a list of items")) .split(',')
for i in n:
    s+= int(i)
print(s)

