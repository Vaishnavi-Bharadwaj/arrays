//Take an array as input from the user. Search for a given number x and print the index at which it occurs
import java.util.*;
public class linearsearch{
   public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size");
       int n=sc.nextInt();
       int a[]=new int[n];
       System.out.println("Enter the array elements");
       for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
       }
       System.out.println("Enter an element");
       int x=sc.nextInt();
       for(int i=0;i<a.length;i++){
           if(a[i]==x)
            System.out.print("Index is "+i);
       }
       
   }   
}