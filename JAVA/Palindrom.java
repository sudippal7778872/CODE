import java.util.Scanner;
class Palindrom
{
public static void main(String args[])
{
int a,b,c;
String rev="";
Scanner ob=new Scanner(System.in);
System.out.print("Enter a String\n");
String str=ob.nextLine();
for(int i=str.length()-1;i>=0;i--)
{
rev=rev+str.charAt(i);
}
System.out.println("reverse string is="+rev);
if(str.equals(rev))
{
System.out.println("The string is palindrom");
}
else
{
System.out.println("the string is not palindrom");
}
}
}
