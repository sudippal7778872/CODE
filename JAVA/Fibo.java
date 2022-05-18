import java.util.Scanner;
class Fibo
{
public static void main(String args[])
{
int a=1,b=0,c=0,d;
Scanner ob=new Scanner(System.in);
System.out.println("enter a number upto the series\n");
d=ob.nextInt();
for(int i=1;i<=d; i++)
{
System.out.print(" "+b);
c=a+b;
a=b;
b=c;
}
System.out.println("\nthank you");
}
}