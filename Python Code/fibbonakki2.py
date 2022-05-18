a=0
b=1
sum=0
c=int(input("enter a number of fibbonakki series "))
for i in range(1,c+1,1):
    sum=a+b
    print(a,end=" ")
    a=b
    b=sum
    
