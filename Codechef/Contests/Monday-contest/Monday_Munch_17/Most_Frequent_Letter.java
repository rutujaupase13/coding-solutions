import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

        int[] count = new int[26];

        
        for (int i = 0; i < S.length(); i++)
        {

            char ch = S.charAt(i);

       
            if (ch >= 'A' && ch <= 'Z')
            {
                ch = (char)(ch + 32);
            }


            if (ch >= 'a' && ch <= 'z')
            {
                count[ch - 'a']++;
            }
        }

        int max = 0;
        int index = 0;

        for (int i = 0; i < 26; i++)
        {
            if (count[i] > max)
            {
                max = count[i];
                index = i;
            }
        }

      
        char answer = (char)(index + 'a');

        System.out.println(answer);
	}
}
