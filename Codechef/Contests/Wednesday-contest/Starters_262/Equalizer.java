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

        while (T > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];

            for(int i = 0;i <N;i++)
            {
                A[i] = sc.nextInt();
            }

            int maxScore = 0;

          
            for(int L = 0;L < N;L++)
            {

                
                for(int R = L;R < N;R++)
                {

                    
                    for(int i = L;i <= R;i++)
                    {
                        A[i]++;
                    }

                    
                    int score = 0;

                    for(int i = 0;i < N - 1;i++)
                    {
                        if(A[i] == A[i + 1])
                        {
                            score++;
                        }
                    }

                    maxScore = Math.max(maxScore, score);

                  
                    for(int i = L;i <=R;i++) 
                    {
                        A[i]--;
                    }
                }
            }

            System.out.println(maxScore);
            T--;
        }

	}
}
