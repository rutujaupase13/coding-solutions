import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt();
        
        if((N * K) >= P)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
	}
}
