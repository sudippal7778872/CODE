class T1 extends Thread
{
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println("thread 1   "+i);
}
}
}
class T2 extends Thread
{
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println("thread 2    "+i);
}
}
}
public class T
{
public static void main(String args[])
{
T1 obj1=new T1();
T2 obj2=new T2();
obj1.start();
obj2.start();
}
}