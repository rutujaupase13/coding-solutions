import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
       Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int deepClean = 0;

        for (int i = 10; i <= 110; i = i + 10)
        {
            if (N < i)
            {
                deepClean = i - N;
                break;
            }
        }

        System.out.println(deepClean);
	}
}
