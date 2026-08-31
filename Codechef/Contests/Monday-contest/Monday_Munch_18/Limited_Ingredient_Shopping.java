import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        
        int W = sc.nextInt();
        int N = sc.nextInt();
        
        int[] arr = new int[2 * N];
        
        for(int i=0;i<N;i++)
        {
         int weight = sc.nextInt();

            arr[2 * i] = weight;
           arr[2 * i+ 1] = weight;
        }

        
        Arrays.sort(arr);

        long sum = 0;
        int count = 0;

       
        for (int i = arr.length - 1; i >= 0; i--) 
        {
            sum = sum + arr[i];
            count++;

            if (sum >=W)
            {
            System.out.println(count);
                return;
            }
        }

        
        System.out.println(-1);
	}
}
