#print 1 to 100 and skip those which are divisible by 3 and 5
i=1
while i<=100:
    if (i%3==0 or i%5==0):
        print("skip")
    else:
        print("number ",i)
    i+=1
print("thank you")
        
