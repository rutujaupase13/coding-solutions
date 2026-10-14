import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T > 0) 
        {
            int N = sc.nextInt();
            String A = sc.next();
            String B = sc.next();

            int countA = 0;
            int countB = 0;

            
            for(int i = 0;i < N;i++)
            {
                if(A.charAt(i) == '1')
                {
                    countA++;
                }
            }

            
            
            
            
            for(int i =0;i <N;i++) 
            {
                if (B.charAt(i) == '1')
                {
                    countB++;
                }
            }

            
            if(countA% 2 == countB%2)
            {
                System.out.println("YES");
            } else
            {
                System.out.println("NO");
            }
            
            
            T--;
        }

	}
}
