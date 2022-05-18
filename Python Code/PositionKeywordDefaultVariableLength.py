#type of actual parameter
#position

def function(x,y):   
    z=x+y
    print(z)
function(4,6)  #here 4 is assign to x and 6 is assign at y sequentially

#keyword
#when we forget the sequence of parameter during function call time
def function2(name,age):
    print(name,end=" ")
    print(age)
function2(age=23,name='suman') #here is no sequence

#default
""" if we does not put any value in actual argument and by default value will automatically taken.
default value will be put in formal argument. """
def function3(name,age=23):
    print(name,end=" ")
    print(age)
function3('suman') # here we give only one value

#variable length
"""when we dont know how many variable pass by the user then we use the variable to store multiple
value. "*" symbol denote that it a varible which can store multiple variable."""
def function4(*a):
    print(a)
function4(5,'suman',6)
 
