import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		long num = sc.nextLong();
		int count = 0;
		
		while(num > 0)
		{
		    long temp = num % 10;
		    num = num / 10;
		    count++;
		}
		
		System.out.println(count+"");
	}
}