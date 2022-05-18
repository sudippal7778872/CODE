import array
a=array.array('i',[])
b=int(input("enter a number of element you want to insert : "))
for i in range(0,b):
    c=int(input("enter the number"))
    a.append(c)

print(a[0:4])
