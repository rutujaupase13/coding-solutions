import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row value : ");
		int count = 1;
		int num = sc.nextInt();
		for(int i = 0 ; i < num ;i++)
		{
		    for(int j = 0;j <= i;j++)
		    {
		        System.out.print(" "+count);
		        count++;
		    }
		    System.out.println();
		}
	}
}