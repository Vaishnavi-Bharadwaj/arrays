//For a given matrix of N x M, print its transpose.
import java.util.*;
public class arrays2D1
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
		System.out.println("The transporse of the matrix is");
		for(int j=0;j<n;j++){
		    for(int i=0;i<m;i++){
		        System.out.print(a[i][j]+" ");
		    }
		    System.out.println();
		}
		
		
	}
}
