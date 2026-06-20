import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row value:");
		int row = sc.nextInt();
		char ch = 'A';
		
		for(int i = 0;i <row;i++)
		{
		    for(int j = 0;j <= i;j++)
		    {
		        System.out.print(" "+ch);
		    }
		    System.out.println();
		    ch++;
		}
	}
}