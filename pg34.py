inf=False
outf=False

try:
    inf=open('inf.txt','r')
    outf=open('outf.txt','w')
    line=inf.readlines()
    odd_line=line[::2]
    outf.writelines(odd_line)
except IOError as io:
    print("IO error")
finally:
    if inf:inf.close()
    if outf:outf.close()
