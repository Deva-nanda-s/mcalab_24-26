#Write a function to get a new string from a given string by adding ‘Is’ to the beginning of the input string. If the given string already begins with ‘Is’, return the input string unchanged.

def add_ls(n):
    if n.startswith("ls"):
          return n
    else:
        return "ls"+n


n=input("Enter a string")
n1=add_ls(n)
print(n1)



    

