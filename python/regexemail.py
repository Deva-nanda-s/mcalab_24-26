import re


try:
    inf = open('sample.txt', 'r')  
    text = inf.readlines()
finally:
    inf.close() 

key = re.compile(r'\w+@\w+\.\w+')

for line in text:
    if key.search(line):
        print(line.strip())
