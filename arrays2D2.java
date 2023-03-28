//take a matrix as input from the user. Search for a given number x and print the indices at which it occurs
import java.util.*;
public class arrays2D2
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of m and n(size)");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		System.out.println("Enter the array elements");
		for(int i=0;i<m;i++){
		    for(int j=0;j<n;j++){
		        a[i][j]=sc.nextInt();
		    }
		}
		System.out.println("Enter the element");
		int x=sc.nextInt();
		for(int i=0;i<m;i++){
		    for(int j=0;j<n;j++){
		        if(x==a[i][j]){
		            System.out.println("Element found at indices "+i+","+j);
		        }
		    }
		}
		
	}
}
