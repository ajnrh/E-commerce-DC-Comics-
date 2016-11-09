import java.util.*;
import java.lang.*;
import java.io.*;
public class reverse{

     public static void main(String []args){
         int no,rev=0,n;
         System.out.println("enter the number");
         Scanner s=new Scanner(System.in);
         no=s.nextInt();
         while(no>0)
         {
             n=no%10;
             rev=(rev*10)+n;
             no=no/10;
         }
        System.out.println("Reverse is : "+rev);
     }
}
