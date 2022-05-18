#finding all square integer from 1 to 500
import math as m
for i in range(1,500,1):
    z=m.pow(i,2)
    if z<=500:
        print(z)
