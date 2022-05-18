import java.util.Scanner;
class Fact2
{
public static void main(String args[])
{
int a,b=1,c;
Scanner ob=new Scanner(System.in);
System.out.println("enter a number \n"+"i am sudip");
a=ob.nextInt();
for(int i=1; i<=a ; i++)
{
b=b*i;
}
System.out.println("the result is ="+b);
}
}