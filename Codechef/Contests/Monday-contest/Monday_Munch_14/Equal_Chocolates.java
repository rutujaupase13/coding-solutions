import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int X = sc.nextInt();
        int B = sc.nextInt();
        int Y = sc.nextInt();
        
        if((A * X) == (B * Y))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
	}
}
