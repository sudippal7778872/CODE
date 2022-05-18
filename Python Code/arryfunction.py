#working with array
import array
value=array.array('i',[1,2,3,4,5])
print(value,end=" ")
print("\n",value.append(6))
print("after append 6",value)
value.reverse()
print("\n",value,end=" ")
print("\n",value.buffer_info())
