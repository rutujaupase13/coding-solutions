import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int first = A * 3;
        int second = B * 1 + A * 1;
        
        int sum = (first < second ? first : second);
        System.out.println(sum);
	}
}