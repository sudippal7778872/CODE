def fact(s):
    if s==0:
        return 1
    return s*fact(s-1)



a=int(input("enter a number  "))
res=fact(a)
print(res)
