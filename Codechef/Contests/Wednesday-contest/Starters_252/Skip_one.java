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

        while (T-- > 0) 
        {
            int N = sc.nextInt();
            long K = sc.nextLong();

            long sum = 0;
            long max = 0;
            int answer = 0;

            for (int i = 0; i < N; i++) 
            {
                long cost = sc.nextLong();

                sum = sum + cost;
                max = Math.max(max, cost);

                
                if (sum - max <= K)
                {
                    answer = i + 1;
                }
            }

            System.out.println(answer);
        }
	}
}
