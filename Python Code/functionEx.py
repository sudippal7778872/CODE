#simple function

def s():
    print("hello")
    print("sudip pal")
s()

#function with argument
def p(x,y):
    z=x+y
    print(z)
p(4,6)


#function with argument and return type
def sudip(x,y):
    z=x+y
    return z
result=sudip(6,14)
print(result)


#now we want to return two value

def add_sub(x,y):
    z=x+y
    z2=x-y
    return z,z2
result1,result2=add_sub(6,14)
print(result1,result2)
