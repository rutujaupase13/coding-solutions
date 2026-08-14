import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
         int R = sc.nextInt();

         boolean found = false;

        for (int i = L; i <= R; i++)
        {
            if (i % 2 == 0)
            {
                found = true;
                break;
            }
        }

        if (found)
        {
            System.out.println("Yes");
        } else
        {
            System.out.println("No");
        }
	}
}
