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

            for (int i = 0;i < N; i++)
            {
                arr[i] = sc.nextInt();
            }

            int max = 0;

           
            for (int i = 0; i < N;i++)
            {
                max = Math.max(max, arr[i]);
            }

           
            for (int i = 0; i < N; i++)
            {

                for (int j =i + 1; j < N; j++)
                {

                    if (arr[i] <= arr[j])
                    {

                        int sum = arr[i]+ arr[j];

                        max = Math.max(max, sum);
                    }
                }
            }

            System.out.println(max);
            T--;
        }
	}
}
