import java.util.*;

public class Main
{
    public static void Pattern( int start , int End,int sum)
    {   
        if(End < start) 
        {
            System.out.println(sum+"");
            return ;
        }
        sum = sum + start;
        Pattern(start + 1, End,sum);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start");
        int start = sc.nextInt();
        System.out.println("Enter the End");
        int End = sc.nextInt();
        int sum = 0;
        
        Pattern(start, End,sum);
	}
}