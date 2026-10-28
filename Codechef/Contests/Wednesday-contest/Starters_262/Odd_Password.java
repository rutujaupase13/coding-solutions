import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        for(int i = 0;i <5;i++)
        {
            if(i % 2 == 0)
            {
            char pass= str.charAt(i);
            System.out.print(""+pass);
        
            }
            
        }
	}
}