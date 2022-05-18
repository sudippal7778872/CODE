from array import *
arr = array('i',[])
n=int(input("enter the length of the array "))
for j in range(n):
    x=int(input("enter the value "))
    arr.append(x)
print(arr)
print("enter a value and we search for its indeax number ")
z=int(input("enter a number "))
k=0
for j in arr:
    if j==z:
        print("the index number is ",k)
        break
    k+=1
else:
    print("not found")
