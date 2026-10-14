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
        
        while (T > 0)
        {
            int N = sc.nextInt();
            int[] A = new int[N];

            for(int i = 0; i < N; i++)
            {
                A[i] = sc.nextInt();
            }

            int ans = Integer.MAX_VALUE;

    
            for(int i = 0; i < N; i++)
            {
                int original = A[i];

                
                for(int value = 1; value <= 100; value++) 
                {
                    A[i] = value;

                    int max = A[0];
                    int min = A[0];

                    
                    for(int j = 1; j < N; j++)
                    {
                        if(A[j] > max)
                        {
                            max = A[j];
                        }

                        if(A[j] < min)
                        {
                            min = A[j];
                        }
                    }

                    int difference = max - min;

                    if(difference < ans)
                    {
                        ans = difference;
                    }
                }

                
                A[i] = original;
            }

            System.out.println(ans);
            T--;
        }

	}
}
