import re

try:
    with open('sample.txt','r') as inf:
        words=inf.read().split()
except IOError as io:
    print(io)

key=re.compile(r'\b[aeiou][a-z]*[aeiou]\b',re.IGNORECASE)
for word in words:
    if key.search(word):
        print(word)
