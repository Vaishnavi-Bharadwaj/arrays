/*Take an array of numbers as input and check if it is an array sorted in ascending order.
Eg : { 1, 2, 4, 7 } is sorted in ascending order.
       {3, 4, 6, 2} is not sorted in ascending order.*/

       import java.util.*;
       public class arrays3{
           public static void main(String args[]){
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the array size");
              int n=sc.nextInt();
              int a[]=new int[n];
              System.out.println("Enter the array elements");
              for(int i=0;i<n;i++){
                  a[i]=sc.nextInt();
              }
              boolean isAscending=true; //always consider true initially
              for(int i=0;i<a.length-1;i++){ // we consider a.length-1 since we have to stop the comparison at the last element 
                   if(a[i]>a[i+1])
                       isAscending=false;
              }
               if(isAscending)
                   System.out.println("sorted in ascending order");
               else
                   System.out.println("not sorted in ascending order");
                   
           }
       }
       