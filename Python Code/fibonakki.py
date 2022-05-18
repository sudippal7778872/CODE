b=1
a=0
result=0
for i in range(1,51,1):
    print(" ",i,a,end="  ")
    result=b+a
    a=b
    b=result
