import java.util.Scanner;
class F
{
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
int a=0,b=1,c,sum=0;
System.out.println("Enter the number \n");
c=ob.nextInt();
for(int i=0;i<=c;i++)
{
System.out.print(" "+b);
sum=a+b;
a=b;
b=sum;
}
}
}