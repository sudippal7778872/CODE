class F
{
public void fun1(int a)
{
System.out.println("This is fun1");
}
}
class E extends F
{
public void fun1(int a)
{
System.out.println("here we override the fun1 in child class");
}
}
class Override
{
public static void main(String args[])
{
E obj=new E();
obj.fun1(1);
}
}