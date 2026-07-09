import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("Enter the value of rows");
		int row = sc.nextInt();
		
		
		for(int i = 0;i < row;i++)
		{
		    for(int j = 0 ;j <= i; j++)
		    {
		        if((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0  && j % 2 != 0))
		        {
		        System.out.print("1");
		        }
		        else{
		            System.out.print("0");
		            
		        }
		    }
		    
		    System.out.println();
		}
	}
}