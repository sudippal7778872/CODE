class A
{
public A()
{
System.out.println("motherchod ho tum");
}
public A(int a){
System.out.println("tu motherchod hei");
}
}
class Cons extends A
{
public static void main(String args[])
{
A obj=new A();
A obj2=new A(2);
}
}