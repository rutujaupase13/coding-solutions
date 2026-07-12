import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = sc.nextInt();
		int  count = 0;
		
		while(num > 0)
		{
		    int temp = num % 10;
		    count = count * 10 + temp;
		    num = num / 10;
		}
		
		System.out.println(count+"");
	}
}