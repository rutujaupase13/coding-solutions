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
        
        int[] arr = new int[N];
        
        for(int i =0;i<N;i++)
        {
            arr[i]= sc.nextInt();
        }
        
        int X = sc.nextInt();
        
        int occurence = 0, place = 0;
        for(int i =0;i<N;i++)
        {
            if(X == arr[i] )
            {
                occurence++;
                
                if(occurence == 2)
                {
                    System.out.println(i);
                    return;
                }
            }
        }
        
        if(occurence == 1)
        {
            System.out.println("-2");
        }
        else 
        {
            System.out.println("-1");
        }
	}
}
