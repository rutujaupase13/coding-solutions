import java.util.*;

public class Main
{
    public static void Pattern(int length , int start)
    {   
        if(start > length) return ;
        System.out.println(length+"");
        Pattern(length ,start+1);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int length = sc.nextInt();
        int start = 1;
        
        Pattern(length,start);
	}
}