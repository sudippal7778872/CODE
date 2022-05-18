import java.util.Scanner;
class Binary
{
public static void main(String args[])
{
int a,i=0,b;
int s = new int[100];
String rev="";
Scanner ob=new Scanner(System.in);
System.out.println("enter a number which binafry format you want\n");
a=ob.nextInt();
b=1;
do
{
b=a%2;
a=a/2;
s[i]=b;
i++;
System.out.print(s[i]);
}
while(a>0);
System.out.println(s);
}
}