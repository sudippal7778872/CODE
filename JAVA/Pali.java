import java.util.Scanner;
class Pali
{
public static void main(String args[])
{
int a,c,d,i;
Scanner ob=new Scanner(System.in);
System.out.println("enter a string\n");
String rev="";
String s=ob.nextLine();
for(i=s.length()-1;i>=0;i--)
{
rev=rev+s.charAt(i);
}
if(s.equals(rev))
{
System.out.println("the string is palindrom");
}
else
{
System.out.println("the string is not palindrom");
}
}
}