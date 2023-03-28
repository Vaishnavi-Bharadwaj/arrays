//Find the maximum & minimum number in an array of integers. [HINT : Read about Integer.MIN_VALUE & Integer.MAX_VALUE in Java]

import java.util.*;
public class arrays2 {
    public static void main(String args[]){
        int min=Integer.MAX_VALUE; //The Integer. MIN_VALUE is a constant in the Integer class that represents the minimum or least integer value that can be represented in 32 bits
        int max=Integer.MIN_VALUE; //MAX_VALUE is a number in the Java Integer сlass of java. lang package. It is the maximum possible Integer number that can be represented in 32 bits.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            if(a[i]<min)
                min=a[i];
            if(a[i]>max)
                max=a[i];
                
        }
        System.out.println("minimum number is "+min);
        System.out.println("maximum number is "+max);
        
    }
}

/* alternate soln
    import java.util.*;
public class Main {

 public static void main(String[] args) {

  //numbers array
  int a[] = new int[]{55,32,45,98,82,11,9,39,50};

  //assign first element of an array to largest and smallest
  int smallest = a[0];
  int largetst = a[0];

  for (int i = 1; i < a.length; i++) {
   if (a[i] > largetst)
    largetst = numbers[i];
   if (a[i] < smallest)
    smallest = numbers[i];
  }

  System.out.println("Largest Number is : " + largetst);
  System.out.println("Smallest Number is : " + smallest);
 }
}
 */