from array import *
value=array('i',[5,6,8,3,4,9])
newarr=array(value.typecode,(a for a in value))
print(newarr)
print("second of printing")
for j in newarr:
    print(j,end=" ")
