class B
{
public void fun(int a)
{
System.out.println("this is the function which call from main");
}
}
public class A extends B
{
public static void main(String args[])
{
B obj=new B();
obj.fun(1);
}
}
