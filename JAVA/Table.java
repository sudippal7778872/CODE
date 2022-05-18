import java.util.Scanner;
class Table
{
public static void main(String args[])
{
int a,b,c,i,j;
Scanner ob=new Scanner(System.in);
System.out.print("Enter a number which table you want\n");
a=ob.nextInt();
for(i=1;i<=10;i++)
{
b=a*i;
System.out.println(+a+" * "+i+" = "+b);
}
}
}