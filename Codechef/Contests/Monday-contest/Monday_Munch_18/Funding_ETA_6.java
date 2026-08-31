import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int A = sc.nextInt();
        int Y = sc.nextInt();
        int B = sc.nextInt();
        int D = sc.nextInt();
        
        int totalRevenue = X * A + Y * B;
        if(totalRevenue >= D)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
	}
}
