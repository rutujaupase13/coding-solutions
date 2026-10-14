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
        int K = sc.nextInt();
        int Y = sc.nextInt();
        int count = 0;
        
        for(int i = 1 ; i <= X;i++)
        {
            if(i*K == Y)
            {
                count++;
            }
        }
        
        if(count > 0)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
	}
}
