import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		
		int T = sc.nextInt();
		
		while(T > 0)
		{
		    int N = sc.nextInt();
		     sc.nextLine(); 
		    String str= sc.next();
		    
		    int door = 0;
		    int counter = 0;
		   char ch = str.charAt(0);
		    
		    for(int i = 0; i<N;i++)
		    {
		        if(ch == str.charAt(i))
		        {
		            counter++;
		        }
		        else if(ch != str.charAt(i))
		        {
		            counter=1; // 1 because ith char already read  *imp  *logic
		            ch = str.charAt(i);
		        }
		        
		        
		        if(counter == 3 )
		        {
		            door++;
		            counter = 0;
		           // ch = str.charAt(i);
		        }
		       
		    }
		    
		    System.out.println(""+door);
		    
		    
		    T--;
		}

	}
}
