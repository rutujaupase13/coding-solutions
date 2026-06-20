import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row value:");
		int row = sc.nextInt();
		
		for(int i = 1;i <= row;i++)
		{
		    for(int j = 1;j <=i;j++)
		    {
		       System.out.print(""+j);
		    }
		    for(int k = 1;k <= 2*(row-i);k++)
		    {
		        System.out.print(" ");
		    }
		    for(int r = i;r >=1;r--)
		    {
		        System.out.print(""+r);
		    }
		    System.out.println();
		}
	}
}