import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
         Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while(T > 0)
        {
            int N = sc.nextInt();
            int[] arr = new int[N];
            int sum= 0;
            
            for(int i= 0;i< N;i++)
            {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            
            
            
            if(sum == 0)
            {
                System.out.println(0);
            }
            else if(sum %2 != 0)
            {
                System.out.println(-1);
            }
            else
            {
                System.out.println(Math.abs(sum) / 2);
            }
            T--;
        }
	}
}
