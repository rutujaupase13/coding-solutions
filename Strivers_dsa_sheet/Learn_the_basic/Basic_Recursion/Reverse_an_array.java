import java.util.*;

public class Main
{
    
    public static void Pattern( int len , int[] arr,int i)
    {   
        if(i < 0) 
        {
           // System.out.println(sum+"");
            return ;
        }
        System.out.println(arr[i]+"");
        Pattern(len, arr,i-1);
    }
    
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
        int len = sc.nextInt();
        System.out.println("Enter the array");
        int[] arr = new int[len];
        int i = len-1;
        
        
       for(int k = 0 ; k < len;k++)
        {
             arr[k] = sc.nextInt();
        }
        
        Pattern(len, arr,i);
	}
}