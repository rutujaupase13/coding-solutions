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

            int odd = 0;
            int even = 0;

            for (int i = 0; i < N; i++)
            {
                int x = sc.nextInt();

                if (x % 2 == 0)
                {
                    even++;
                }
                else
                {
                    odd++;
                }
            }
            
        int answer = 2 * Math.min(odd, even) + 1;

            answer = Math.min(answer, N);

            System.out.println(answer);
        }
	}
}
