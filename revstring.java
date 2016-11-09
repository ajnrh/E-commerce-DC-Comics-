import java.util.*;
import java.lang.*;
import java.io.*;
public class revstring
{
public static void main(String[] args)
{
String org,rev="";
Scanner s=new Scanner(System.in);
System.out.println("Enter the String to be reversed: ");
org=s.nextLine();
int length = org.length();
for ( int i = length - 1 ; i >= 0 ; i-- )
{         
rev = rev + org.charAt(i);
System.out.println("Reverse of entered string is: "+rev);
}
}
}