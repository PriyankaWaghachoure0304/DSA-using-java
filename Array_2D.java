package priyanka;
import java.util.*;
public class Array_2D 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many rows u want?");
		int rows=sc.nextInt();
		System.out.println("Enter how many columns u want?");
		int col=sc.nextInt();
		
		int[][] number=new int[rows][col];
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				number[i][j]=sc.nextInt();
			}
		}
		
		//output
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(number[i][j]+" ");
			}
			System.out.println();
		}
		
		//search for given number
		System.out.println("Enter search element:");
		int x=sc.nextInt();
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(number[i][j]==x)
				{
					System.out.println("Search element is found at position "+i+","+j);
				}
			}
		}
	}
}
