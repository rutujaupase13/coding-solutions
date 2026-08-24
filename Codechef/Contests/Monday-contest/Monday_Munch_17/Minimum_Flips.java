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

            int positive = 0;
            int negative = 0;

            for (int i = 0; i < N; i++)
            {
                int num = sc.nextInt();

                if (num == 1)
                {
                    positive++;
                } 
                else 
                {
                    negative++;
                }
            }

            if (N % 2 != 0)
            {
                System.out.println(-1);
            }
            else
            {
                System.out.println(Math.abs(positive - negative) / 2);
            }
            
        T--;
        }
	}
}
