import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row value:");
		int row = sc.nextInt();
		//char ch = 'A';
		
		for(int i = 1;i <=2*row-1;i++)
		{
		    int star = i;
		    if(i > row) star = 2*row-i;
		    for(int j = 1;j <= star;j++)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		    //ch++;
		}
		
		
// 		for(int i = row-2;i>= 0;i--)
// 		{
// 		    for(int j = 0;j <= i;j++)
// 		    {
// 		        System.out.print("*");
// 		    }
// 		    System.out.println();
// 		    //ch++;
// 		}
	}
}