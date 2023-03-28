//Take an array of names as input from the user and print them on the screen

import java.util.*;
public class arrays1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        String a[]=new String[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            a[i]=sc.next(); //nextLine() is not used since array of elements should be entered in a single line
        }
        System.out.println("The array elements are");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        
    }
}
