class Fraction:
    def __init__(self,num=0,deno=1):
        self._num=num
        self.deno=deno

    def setNUm(self,value=0):
        self._num=value
    def setDeno(self,value=1):
        if not value:return ZeroDivisionError
        self.deno=value

    def getNum(self):
        return self._num
   
    def getDeno(self):
        return self.deno
   
    def __str__(self): 
      return f"Fraction is: {self._num}/{self.deno}" 

try:   
   f1=Fraction()
   print(f1)
   f2=Fraction(2,5)
   print(f2)
   f2.setDeno(3)
   print(f2)
   f2.setDeno(7)
   f2.setDeno(0)
   f2.setDeno(4)
   f2.setDeno(4)
   print(f2.getN(),'/',f2.getD())
   print(f2.deno)
   print(f2.getN())

except:
    print('Not Valid')
   


