import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        
        int N =  sc.nextInt();
        
        String S = sc.next();
        int count = 0;
        
        if(S.charAt(0) == '1')
        {
            count++;
        }
        
        for(int i = 1;i < N;i++)
        {
            //System.out.println("1");
            if(S.charAt(i-1) == '0' && S.charAt(i) == '1')
            {
              //   System.out.println("2");
                count++;
            }
            
            
        }
        
        System.out.println(count);
	}
}
