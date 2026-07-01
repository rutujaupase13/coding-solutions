#include <stdio.h>

int main() {
	// your code goes here
    int T;
    scanf("%d",&T);
    
    while(T--)
    {
        int X,Y;
        scanf("%d %d",&X,&Y);
        
        int temp = 0;
        
        while(X != Y)
        {
             int result = (int)ceil(X / 10.0);
           //  printf("%d ",result);
             temp = temp + result;
             X--;
        }
        
        printf("%d\n",temp);
    }
    
    return 0;
}
