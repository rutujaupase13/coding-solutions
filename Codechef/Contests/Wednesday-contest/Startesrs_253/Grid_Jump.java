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

            int A = sc.nextInt();
            int B = sc.nextInt();
            int P = sc.nextInt();
            int Q = sc.nextInt();
            int R = sc.nextInt();

            int min = Integer.MAX_VALUE;

            
            for (int i = 0; i <= Math.min(A, B); i++)
            {

                int Right = A - i;
                int Up = B - i;

               
                int rightMoves = (Right + 1) / 2;

             
                int upMoves = (Up + 1) / 2;

                int cost = i * R + rightMoves * P + upMoves * Q;

                min = Math.min(min, cost);
            }

            System.out.println(min);
            T--;
        }
	}
}
