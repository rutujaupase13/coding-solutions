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
            String s = sc.next();

            boolean possible = false;

        
            for(int i =0;i < N;i++)
            {

                int x = 0;
                int y = 0;

                for(int j = 0; j < N; j++) 
                {

                    char move = s.charAt(j);

                    
                    if (j == i) 
                    {
                        if (move == 'U') 
                        {
                            move = 'D';
                        } 
                        else if(move == 'D') 
                        {
                            move = 'U';
                        } 
                        else if(move == 'L') 
                        {
                            move = 'R';
                        } 
                        else if(move == 'R') 
                        {
                            move = 'L';
                        }
                    }

                   
                    if(move == 'U')
                    {
                        y++;
                    } 
                    else if(move == 'D') 
                    {
                        y--;
                    } 
                    else if(move == 'L') 
                    {
                        x--;
                    } 
                    else if(move == 'R') 
                    {
                        x++;
                    }
                }



         if(x == 0 && y == 0) 
         {
                    possible = true;
                    break;
                }
            }

            if(possible)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            
             T--;
        }
       

	}
}
