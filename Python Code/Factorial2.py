def fact(f):
    s=1
    for i in range(1,f+1,1):
        s=s*i
    return s
a=int(input("enter the number "))
res=fact(a)
print(res,end=" ")

