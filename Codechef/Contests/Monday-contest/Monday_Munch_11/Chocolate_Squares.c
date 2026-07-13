#include <stdio.h>

int main() {
	// your code goes here
    int T;
    scanf("%d",&T);
    
    while(T--)
    {
        int L,B;
        scanf("%d %d",&L,&B);
        
       int gcd = 1;
       
       int min = (L < B) ? L : B;
       
       for(int i = 1;i <= min;i++)
       {
           if(L % i == 0 && B % i == 0)
           {
               gcd = i;
           }
       }
        printf("%d\n",gcd);
    }
    
    return 0;
}

