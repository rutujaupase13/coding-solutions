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
            int M = sc.nextInt();
            int X = sc.nextInt();

            int row = (X + M - 1) / M;

           
            int front = row;
            int back = N - row + 1;

            System.out.println(Math.min(front, back));
            T--;
        }
	}
}
