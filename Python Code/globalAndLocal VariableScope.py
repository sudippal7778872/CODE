#global variable and local variable scope
# in a function local variable preferance is more
#example 1

a=10 # this is global variable
def something():
    a=15           #this is local variable
    print(id(a))
something()
print(id(a))



#Example 2

a=10 # this is global variable

def something2():   # here the global is keyword. by which we can access the global variable.
    global a           #this is global variable. one disadvantage is that inside th function we cannot create a local variable with same name(a).
    a=15
    print("inside function ",id(a),a)
something2()
print("outside function ",id(a),a)



#Example 3
#here we remove this disadvantage. disadvantage is that inside th function we cannot create a local variable with same name(a).

a=10 # this is global variable

def something3():
    x=globals()['a']           # globals is built in function. by which we can access the global variable.
    
    a=15
    print("inside function ",id(a),a)
something3()
print("outside function ",id(a),a)

