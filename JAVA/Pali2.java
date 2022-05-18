import java.util.Scanner;
class Pali2
{
public static void main(String args[])
{
int a,b,i;
String rev="";
Scanner ob=new Scanner(System.in);
System.out.println("enter a string\n");
String d=ob.nextLine();
for(i=d.length()-1; i>=0;i--)
{
rev=rev+d.charAt(i);
}
System.out.println("reverse of your entered string is : "+rev);
if(rev.equals(d))
{a=1;}
else
{ a=0;}
if(a==1)
System.out.println("\nyour entered string is palindrom");
else
System.out.println("\n your string is not palindrom");
}
}