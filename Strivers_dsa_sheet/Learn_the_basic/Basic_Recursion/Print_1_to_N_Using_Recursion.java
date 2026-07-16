import java.util.*;

public class Main
{
    public static void Pattern( int start , int End)
    {   
        if(start > End) return ;
        System.out.println(start+"");
        Pattern(start+1, End);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter the start");
//         int start = sc.nextInt();
        System.out.println("Enter the End");
        int End = sc.nextInt();
        int start = 1;
        
        Pattern(start, End);
	}
}