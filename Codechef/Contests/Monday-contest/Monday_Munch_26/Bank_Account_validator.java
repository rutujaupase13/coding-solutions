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
            String A = sc.next();
            int sum = 0;

           for(int i =0; i < A.length();i++)
           {
                sum += A.charAt(i) - '0';
            }

            if(sum % 10 == 0) 
            {
                System.out.println("Valid");
            } 
            else
            {
                System.out.println("Invalid");
            }
            T--;
        }

	}
}