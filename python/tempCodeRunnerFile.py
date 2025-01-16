words=[]
line=input("Enter line of text").split(',')
for word in line:
    words[word]=words.get[word,0]+1
print(word)