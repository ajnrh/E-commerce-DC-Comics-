import java.util.*;
import java.lang.*;
import java.io.*;
public class arra
{
public static void main(String[] args)
{
int ar[]={0,0,0};
int s=0;
for(int i=0;i<=2;i++)
{
Scanner sa=new Scanner(System.in);
ar[i]=sa.nextInt();
}
for(int i=0;i<=2;i++)
{ 
s=ar[i];
System.out.println("Array : "+s);
}
}
}