# #pg7(A)
words={}
a=input("Enter a line of text").lower()
for w in a.split() :
  words[w]=words.get(w,0)+1
print(words)

#pg7(b)
# char={}
# a=input("Enter sentence").lower()
# for c in a:
#   if c.isalpha():
#     char[c]=char.get(c,0)+1
# print(char)
