inf = False
lines = []
try:
    inf = open('inf.txt', 'r') 
    line = inf.readline()  
    while line:
        lines = [line.strip() for line in inf if line.strip()] 
    print(lines)  
except IOError as io:
    print(io)
finally:
    if inf:  
        inf.close()
        
