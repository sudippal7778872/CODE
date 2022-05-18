"""find all square between 1 to 1000"""
import math as m
for i in range(1,1000,1):
    r=pow(i,2)
    if(r<=1000):
        print("the number is {} and square is {}".format(i,r))
    else:
        break
