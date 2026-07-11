import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("enter the row value:");
		int row = sc.nextInt();
		
		for(int i = 0; i < row;i++)
		{
		    
		    for(int space1 = 0; space1 < row - i + 1;space1++)
		    {
		        System.out.print(" ");
		    }
		    
		    for(int j = 0; j < 2*i + 1;j++)
		    {
		        System.out.print("*");
		    }
		    
		     for(int space2 = 0; space2 < row - i + 1;space2++)
		    {
		        System.out.print(" ");
		    }
		    
		    System.out.println();
		}
		
		
		
	}
}