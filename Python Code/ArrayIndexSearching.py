from array import *
arr = array('i',[])
n=int(input("enter the length of the array "))
for j in range(n):
    x=int(input("enter the value "))
    arr.append(x)
print(arr)
print("enter a value and we search for its index number ")
z=int(input("enter a number "))
for j in arr:
    if j==z:
        print("the index number is ",arr.index(j))
        break
else:
    print("not found")
