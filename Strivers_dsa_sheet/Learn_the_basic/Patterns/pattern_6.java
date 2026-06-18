import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value : ");
		
		int num = sc.nextInt();
		for(int i = num ; i>=0;i--)
		{
		    for(int j = 0;j < i;j++)
		    {
		        System.out.print(""+(j+1));
		    }
		    System.out.println();
		}
	}
}