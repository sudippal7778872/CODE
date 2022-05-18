import java.util.Scanner;
class Fact
{
public static void main(String args[])
{
int a,b,c=1;
Scanner ob=new Scanner(System.in);
System.out.println("enter a number");
a=ob.nextInt();
for(int i=a;i>0;i--)
{
c=c*i;
}
System.out.println("result is"+c);
}
}