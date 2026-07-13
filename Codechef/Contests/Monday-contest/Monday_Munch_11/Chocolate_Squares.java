import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    
	    while(T > 0)
	    {
	        int L = sc.nextInt();
	        int B = sc.nextInt();
	        
	        int gcd = 1;
	        int min = (L < B) ? L : B;
	        
	         for(int i = 1; i <= min; i++) 
	         {
                   if(L % i == 0 && B % i == 0)
                   {
                    gcd = i;
                   }
              }
              
            System.out.println(gcd+"");

	    }

	}
}