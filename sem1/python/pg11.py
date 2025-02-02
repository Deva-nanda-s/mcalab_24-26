s = input('Enter a string : ')
if len(s)==2:
     print( s * 2)
elif len(s)<2:
     print('')
else:
    print(s[:2]+s[-2:])


