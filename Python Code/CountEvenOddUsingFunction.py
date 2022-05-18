lst=[12,15,16,26,57,35,43,34,43,76,25]
def evenodd(a):
    c=0
    d=0
    for i in a:
        if i%2==0:
            c+=1
        else:
            d+=1
    return c,d

even,odd=evenodd(lst)
print("the number of even is ",even)
print("the number of odd is ",odd)
