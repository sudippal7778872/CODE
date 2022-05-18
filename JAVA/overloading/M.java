class A
{
void fun1(int a)
{
System.out.println("This is function 1");
}
void fun1(int a, int b)
{
System.out.println("This is function 2");
}
void fun1(String S)
{
System.out.println("This is function 3");
}
}
class M
{
public static void main(String args[])
{
A obj=new A();
obj.fun1(1);
obj.fun1(1,2);
obj.fun1("sudip");
}
}