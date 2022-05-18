#key variable length
""" when we dont know the data type represent what. mean if we put data through variable
length then we dont know the keyword. we know only the value. then it will be different for different user.
ex. *b -value
user1-1,mumbai,23
user2-22,andhra pradesh, 5
we dont know mumbai is state or country or city. what is 23.
so thats why we use KEYWORD VARIABLE LENGTH.
and it is denoted by "**"
"""
def function5(**b):
    print(b)
function5(name='suman',age=23,city='kolkata') #here we can understand that kolkata is city. And 23 is age


"""      or

we can also use for loop to fetch the data
here i is keyword
and j is Value
item() is built in function"""

def function6(**c):
    for i,j in c.items():
        print(i,j)
function6(name='suman',age=23,city='kolkata')
