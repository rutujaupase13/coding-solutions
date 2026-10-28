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
            int K = sc.nextInt();
             String S = sc.next();
           int alarms = 0;
            int i = N - 1;

            while(i >= 0) 
            {
                if(S.charAt(i) == '1') 
                {
                    alarms++;
                    i = i - K - 1;
                }
                else
                {
                    i--;
                }
            }

            System.out.println(alarms);
            T--;
        }

	}
}
